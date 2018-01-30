// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3381.scissorLift;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController liftliftMotor;
    public static AnalogInput liftpot;
    public static DigitalInput liftlimitSwitch0;
    public static DigitalInput liftlimitSwitch1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        liftliftMotor = new Talon(0);
        LiveWindow.addActuator("lift", "liftMotor", (Talon) liftliftMotor);
        liftliftMotor.setInverted(false);
        liftpot = new AnalogInput(0);
        LiveWindow.addSensor("lift", "pot", liftpot);
        
        liftlimitSwitch0 = new DigitalInput(1);
        LiveWindow.addSensor("lift", "limitSwitch0", liftlimitSwitch0);
        
        liftlimitSwitch1 = new DigitalInput(0);
        LiveWindow.addSensor("lift", "limitSwitch1", liftlimitSwitch1);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}