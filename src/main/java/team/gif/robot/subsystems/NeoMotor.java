package team.gif.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.SparkMaxPIDController;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Constants;
import team.gif.robot.RobotMap;

import javax.sound.sampled.Control;

public class NeoMotor extends SubsystemBase {
    public static CANSparkMax neo = new CANSparkMax(RobotMap.NEOMOTOR, CANSparkMaxLowLevel.MotorType.kBrushless);
    public static SparkMaxPIDController neoPID = neo.getPIDController();

    public NeoMotor(){
        neo.restoreFactoryDefaults();
        neo.setInverted(true);
        neo.setIdleMode(CANSparkMax.IdleMode.kBrake);
    }

    /**
     * Sets the speed of the NEO Motor
     * @param percent percent of max speed to run the motor
     */
    public void setSpeedVoltage(double percent) {
        neo.setVoltage(percent);
    }

    public void setMotorSpeedRPM(double setpoint) {
        neoPID.setReference(setpoint, CANSparkMax.ControlType.kVelocity);
    }
    public double getMotorSpeedInRPM(){
        return neo.getEncoder().getVelocity();
    }
}
