# 2023 Build-A-Bot Template
FRC robot code for Build-A-Bot training. This training combines the basic concepts of programming to provide hands-on experience.

## Hardware
Neo Motor and SparkMax

CIM Motor and TalonSRX

Limit Switch Sensor

Pigeon (connected through TalonSRX)

## Requirements

### Parameters
Param 1: Run CIM in Brake mode

### Basic
Req 1: All: Display state of Limit Switch Sensor to console (not pressed = false, pressed = true)

Req 2: All: Read pigeon heading, and display the heading on console

Req 3: Teleop: Hold B - run CIM at 20% power forward

Req 4: Teleop: Hold X - run CIM at 20% power reverse

Req 5: Teleop: Joystick turns CIM motor forward and reverse (from +100% to -100%)

Req 6: Teleop: Hold Y - turn SparkMax/Neo using 2.5 volts

Req 7: All: Show Limit Switch Sensor state on Shuffleboard (not pressed = red, pressed = green)

Req 8: All: Show pigeon heading and display using compass widget on Shuffleboard

### Intermediate

Req 9: Teleop: If Limit Switch Sensor is true, cut TalonSRX/CIM power by 50% (when B and X are held)

### Advanced

Req 10: Teleop: Hold A - turn SparkMax/Neo 60 RPM, display RPM to shuffleboard