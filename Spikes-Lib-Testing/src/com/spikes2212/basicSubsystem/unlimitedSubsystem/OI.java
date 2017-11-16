package com.spikes2212.basicSubsystem.unlimitedSubsystem;

import org.usfirst.frc.team2212.robot.subsystems.Climber;
import org.usfirst.frc.team2212.robot.subsystems.Feeder;
import org.usfirst.frc.team2212.robot.subsystems.Gear;
import org.usfirst.frc.team2212.robot.subsystems.Picker;
import org.usfirst.frc.team2212.robot.subsystems.Shooter;

import com.spikes2212.genericsubsystems.commands.MoveBasicSubsystem;
import com.spikes2212.genericsubsystems.commands.MoveLimitedSubsystem;

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
		joystickRight = new Joystick(0);
		
		shootButton = new JoystickButton(joystickRight, 1);
		
		shootButton.whileHeld(new MoveBasicSubsystem(Robot.shooter, Robot.shootingSpeed));
	}
	
	
	
}
