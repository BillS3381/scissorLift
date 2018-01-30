package org.usfirst.frc3381.scissorLift.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3381.scissorLift.Robot;

// This file will not show up in RobotBuilder, because 
//RobotBuilder can kindly end itself.

public class autoIn extends Command {

    public autoIn() {

        requires(Robot.lift);

    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	Robot.lift.retract();
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
    	
        return !Robot.lift.inSwitch();
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    	Robot.lift.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
     	Robot.lift.stop();
    }
}
