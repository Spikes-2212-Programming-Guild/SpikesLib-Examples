package com.spikes2212.basicSubsystem.ulimitedSubsystem.roller;

import com.spikes2212.genericsubsystems.commands.MoveBasicSubsystem;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private Joystick joystick = new Joystick(0);

	public OI() {
		JoystickButton rollerIn = new JoystickButton(joystick, 2);
		JoystickButton stopRoller = new JoystickButton(joystick, 3);
		
		rollerIn.whileHeld(new MoveBasicSubsystem(Robot.roller, SubsystemConstants.roller.ROLLER_IN_SPEED));
		
	}

}
