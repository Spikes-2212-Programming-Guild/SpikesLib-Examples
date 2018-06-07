package com.spikes2212.basicSubsystem.ulimitedSubsystem.shooter;

import com.spikes2212.genericsubsystems.basicSubsystem.commands.MoveBasicSubsystemWithPIDForSpeed;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private Joystick joystick = new Joystick(0);

	public OI() {
		JoystickButton shoot = new JoystickButton(joystick, 2);

		shoot.whenPressed(new MoveBasicSubsystemWithPIDForSpeed(Robot.shooter, SubsystemComponents.Shooter.ENCODER, SubsystemConstants.Shooter.SHOOT_SPEED, SubsystemComponents.Shooter.PID_SETTINGS, SubsystemConstants.Shooter.SHOOT_ACCELERATION.get()));
		
	}

}
