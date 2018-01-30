package org.usfirst.frc3381.scissorLift;

import org.usfirst.frc3381.scissorLift.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc3381.scissorLift.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    public JoystickButton extendBtn;
    public JoystickButton contractBtn;
    public JoystickButton manualBtn;
    public JoystickButton autoOutBtn;
    public JoystickButton autoInBtn;
    public Joystick joystick1;

    public OI() {

        joystick1 = new Joystick(0);
        
        contractBtn = new JoystickButton(joystick1, 3);
        contractBtn.whileHeld(new contractLift());
        extendBtn = new JoystickButton(joystick1, 2);
        extendBtn.whileHeld(new extendLift());
        manualBtn = new JoystickButton(joystick1, 1);
        manualBtn.whileHeld(new manual());
        autoOutBtn = new JoystickButton(joystick1, 6);
        autoOutBtn.whenPressed(new autoOut());
        autoInBtn = new JoystickButton(joystick1, 7);
        autoInBtn.whenPressed(new autoIn());


        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("extendLift", new extendLift());
        SmartDashboard.putData("contractLift", new contractLift());
        SmartDashboard.putData("manual", new manual());

    }

    public Joystick getjs1() {
        return joystick1;
    }

}

