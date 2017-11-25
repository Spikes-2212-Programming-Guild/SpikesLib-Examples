package com.spikes2212.drivetrains.holonomicDrivetrain.omniDrivetrain;

import com.spikes2212.genericsubsystems.drivetrains.commands.DriveTank;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private Joystick driverRight = new Joystick(0);
	private Joystick driverLeft = new Joystick(1);
	
	public OI(){
		JoystickButton tankControlButton = new JoystickButton(driverRight, 0);
		
		tankControlButton.whileHeld(new DriveTank(Robot.drivetrain, this::getLeftY, this::getRightY));
	}

	// receives input, returns the adjusted input for better sensitivity
	private double adjustInput(double input){
		return input * Math.abs(input);
	}

	// returns the adjusted value of the driving left joystick's y
	public double getLeftY() {
		return adjustInput(driverLeft.getY());
	}

	// returns the adjusted value of the driving right joystick's y
	public double getRightY() {
		return adjustInput(driverRight.getY());
	}
	
	// returns the adjusted value of the driving left joystick's x
	public double getLeftX(){
		return adjustInput(driverLeft.getX());
	}
}
