package org.usfirst.frc.team3546.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3546.robot.Robot;

/**
 * Created by User on 2/4/2017.
 */
public class FuelOutput extends Command{
    public FuelOutput() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        //Robot.ballSorting.setSortHigh();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.shooting.spitOutFuel();
        Robot.ballSorting.spinFrontIntakeandStorageMotorCounterClockwise();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.shooting.stopShooterMotors();
        Robot.ballSorting.spinFrontIntakeandStorageMotorOff();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
