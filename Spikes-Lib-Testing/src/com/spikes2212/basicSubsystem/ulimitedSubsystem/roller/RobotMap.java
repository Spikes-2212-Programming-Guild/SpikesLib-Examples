package com.spikes2212.basicSubsystem.ulimitedSubsystem.roller;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public interface PWM {
		public static final int ROLLER_MOTOR = 6;
	}
}
