// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.



package org.usfirst.frc3381.scissorLift.subsystems;

/** NOTICE! The Scissor Lift project as a whole has been back-burnered
as of 29 Jan 2018. TL;DR it bowed out under force to the point of
being an IED. This will probably be used for ex code. */

import org.usfirst.frc3381.scissorLift.Robot;
import org.usfirst.frc3381.scissorLift.RobotMap;
import org.usfirst.frc3381.scissorLift.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class lift extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController liftMotor = RobotMap.liftliftMotor;
    private final AnalogInput pot = RobotMap.liftpot;
    private final DigitalInput limitSwitch0 = RobotMap.liftlimitSwitch0;
    private final DigitalInput limitSwitch1 = RobotMap.liftlimitSwitch1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public void extend() {
    	liftMotor.set(-.25);
    }
    
    public void retract() {
    	liftMotor.set(.25);
    }
    
    public void stop() {
    	liftMotor.set(0);
    }
    
    public double getPot() {
    	return pot.getValue();
    }
    
    public void manual() {
    	liftMotor.set(-Robot.oi.joystick1.getY());
    }
    
    public boolean outSwitch() {
    	return limitSwitch0.get();
    }
    
    public boolean inSwitch() {
    	return limitSwitch1.get();
    }

}

