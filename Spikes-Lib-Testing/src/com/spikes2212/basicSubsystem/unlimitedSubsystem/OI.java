package com.spikes2212.basicSubsystem.unlimitedSubsystem;


import com.spikes2212.genericsubsystems.commands.MoveBasicSubsystem;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI /*GEVALD*/ {
	
	private Joystick joystickRight;
	
	private Button shootButton;
	
	public OI(){
		joystickRight = new Joystick(1);
		
		shootButton = new JoystickButton(joystickRight, 1);
		
		shootButton.whileHeld(new MoveBasicSubsystem(Robot.shooter, Robot.shootingSpeed));
	}
	
	
	
}
