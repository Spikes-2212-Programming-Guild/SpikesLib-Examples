package com.spikes2212.drivetrains.holonomicDrivetrain.omniDrivetrain;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public interface CAN {
		public static final int DRIVE_LEFT_1 = 6;
		public static final int DRIVE_LEFT_2 = 3;
		public static final int DRIVE_RIGHT_1 = 1;
		public static final int DRIVE_RIGHT_2 = 5;
		public static final int DRIVE_FRONT = 2;
		public static final int DRIVE_REAR = 4;
	}
}
