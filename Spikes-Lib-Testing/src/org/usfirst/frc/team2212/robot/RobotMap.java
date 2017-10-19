package org.usfirst.frc.team2212.robot;

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
		public static final int DRIVE_RIGHT_1 = 5;
		public static final int DRIVE_RIGHT_2 = 1;
	}
}
