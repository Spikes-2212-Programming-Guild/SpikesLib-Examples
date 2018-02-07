package com.spikes2212.basicSubsystem.limitedSubsystem.arm;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;

/**
 * This class contains all of the components for every subsystem. It is
 * primarily used in the Robot class.
 * 
 * @author Matan
 *
 */
public class SubsystemComponents {

	/**
	 * This class contains all of the arm's components.
	 * 
	 * @author Matan
	 *
	 */
	public static class Arm {
		public static final WPI_TalonSRX ARM_MOTOR = new WPI_TalonSRX(RobotMap.CAN.ARM);
		public static final DigitalInput UPPER_LIMIT = new DigitalInput(RobotMap.DIO.UPPER_LIMIT);
		public static final DigitalInput DOWN_LIMIT = new DigitalInput(RobotMap.DIO.DOWN_LIMIT);

	}
}
