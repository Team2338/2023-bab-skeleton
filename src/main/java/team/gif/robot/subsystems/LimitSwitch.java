package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class LimitSwitch extends SubsystemBase {
    public DigitalInput limitSwitch = new DigitalInput(RobotMap.LIMITSWITCH);

    public boolean getLimitSwitchState() {
        return limitSwitch.get();
    }
}
