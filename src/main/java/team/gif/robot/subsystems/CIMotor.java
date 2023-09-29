package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class CIMotor extends SubsystemBase {
    public static TalonSRX cimotor = new TalonSRX(RobotMap.CIMOTOR);

    public CIMotor(){
        cimotor.configFactoryDefault();
        cimotor.setNeutralMode(NeutralMode.Brake); //setting to brake mode
        //cimotor.setInverted(false); // test the motor spin in the wrong direction.
    }

    /**
     * Sets the speed of the cim motor
     * @param percent percent of max speed to run the motor
     */
    public void setSpeedPercent(double percent) {
        cimotor.set(ControlMode.PercentOutput, percent);
    }
}
