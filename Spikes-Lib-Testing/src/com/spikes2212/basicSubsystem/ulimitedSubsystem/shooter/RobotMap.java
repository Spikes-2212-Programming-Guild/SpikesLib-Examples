package com.spikes2212.basicSubsystem.ulimitedSubsystem.shooter;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public interface PWM {
		public static final int SHOOTER_MOTOR = 6;
	}
	
	public interface DIO {
		public static final int ENCODER_A = 1;
		public static final int ENCODER_B = 2;
	}
}
