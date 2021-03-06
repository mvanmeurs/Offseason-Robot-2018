package org.usfirst.frc.team3546.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3546.robot.RobotMap;

/**
 * Created by User on 2/2/2017.
 */
public class Climbing extends Subsystem{

    protected void initDefaultCommand() {}

    private final SpeedController climbingMotor = RobotMap.climbingMotor;

    //public static final double CLIMBING_SPEED = 1;

    //public void climbingMotorClimb(){climbingMotor.set(-CLIMBING_SPEED);}

    public void climbingMotorClimb(double climb_speed){climbingMotor.set(climb_speed);}

    public void climbingMotorOff(){climbingMotor.set(0);}

    private final DoubleSolenoid climbingClampSolenoid = RobotMap.climbingClampPositionSolenoid;

    public void setClimbingClampDisengage() { climbingClampSolenoid.set(DoubleSolenoid.Value.kForward);}
    public void setClimbingClampEngage() { climbingClampSolenoid.set(DoubleSolenoid.Value.kReverse);}
}