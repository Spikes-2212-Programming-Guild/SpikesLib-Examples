package com.spikes2212.drivetrains.holonomicDrivetrain.omniDrivetrain;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.spikes2212.utils.DoubleSpeedcontroller;

public class SubsystemComponents {
	public static class Drivetrain {
		public static final DoubleSpeedcontroller LEFT_MOTOR = new DoubleSpeedcontroller(
				new WPI_TalonSRX(RobotMap.CAN.DRIVE_LEFT_1), new WPI_TalonSRX(RobotMap.CAN.DRIVE_LEFT_2));

		public static final DoubleSpeedcontroller RIGHT_MOTOR = new DoubleSpeedcontroller(
				new WPI_TalonSRX(RobotMap.CAN.DRIVE_RIGHT_1), new WPI_TalonSRX(RobotMap.CAN.DRIVE_RIGHT_2));
		public static final WPI_TalonSRX REAR_MOTOR = new WPI_TalonSRX(RobotMap.CAN.DRIVE_REAR);
		public static final WPI_TalonSRX FRONT_MOTOR = new WPI_TalonSRX(RobotMap.CAN.DRIVE_FRONT);
	}

}
