package team.gif.robot.commands.cim;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Robot;

public class CIM20PercentReverse extends CommandBase {
    public CIM20PercentReverse() {
        super();
        addRequirements(Robot.ciMotor);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
        Robot.ciMotor.setSpeedPercent(-.2); //executing to run the cim motor at 20% reverse.
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        Robot.ciMotor.setSpeedPercent(0);
    }
}
