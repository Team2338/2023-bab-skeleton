package team.gif.robot.commands.cim;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Robot;

public class JoystickControl extends CommandBase {
    public JoystickControl() {
        super();
        addRequirements(Robot.ciMotor);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
        double forwardAndBackward = -Robot.oi.driver.getLeftY();
        if (Robot.limitSwitch.getLimitSwitchState()) { //req 9
            forwardAndBackward /= 2;
        }
        Robot.ciMotor.setSpeedPercent(forwardAndBackward); //using the joystick, setting the cim motor relevant to the joystick.
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
    }
}
