package com.spikes2212.basicSubsystem.unlimitedSubsystem;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public interface USB {
	}

	public interface CAN {
		public static final int DRIVE_LEFT_1 = 6;
		public static final int DRIVE_LEFT_2 = 3;
		public static final int DRIVE_RIGHT_1 = 5;
		public static final int DRIVE_RIGHT_2 = 1;
		public static final int CLIMBER = 2;
		public static final int SHOOTER = 4;
	}

	public interface PWM {
		public static final int FEEDER = 3;
		public static final int BLENDER = 2;// part of the feeder subsystem
		public static final int GEAR_DROPPER = 1;
		public static final int PICKER = 0;
	}
	
	public interface DIO{
		public static final int GEAR_DROPPER_OPEN = 0;
		public static final int GEAR_DROPPER_CLOSE = 1;
	}

	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
