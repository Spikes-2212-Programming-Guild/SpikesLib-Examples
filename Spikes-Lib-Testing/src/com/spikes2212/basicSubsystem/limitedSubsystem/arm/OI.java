package com.spikes2212.basicSubsystem.limitedSubsystem.arm;

import com.spikes2212.genericsubsystems.commands.MoveBasicSubsystem;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private Joystick joystick = new Joystick(0);

	private JoystickButton moveArmUp;
	private JoystickButton moveArmDown;

	public OI() {
		moveArmUp = new JoystickButton(joystick, 1);
		moveArmDown = new JoystickButton(joystick, 2);
		
		moveArmUp.whenPressed(new MoveBasicSubsystem(Robot.arm, Robot.armUpSpeed));
		moveArmDown.whenPressed(new MoveBasicSubsystem(Robot.arm, Robot.armDownSpeed));
	}
}
