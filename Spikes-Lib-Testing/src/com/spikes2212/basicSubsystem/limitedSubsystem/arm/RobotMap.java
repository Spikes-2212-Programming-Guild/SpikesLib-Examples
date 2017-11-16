package com.spikes2212.basicSubsystem.limitedSubsystem.arm;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public interface CAN {
		public static final int ARM = 6;
	}
	
	public interface DIO{
		public static final int UPPER_LIMIT = 1;
		public static final int DOWN_LIMIT = 0;
	}
}
