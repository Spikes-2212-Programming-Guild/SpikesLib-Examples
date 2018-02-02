package com.spikes2212.drivetrains.tankDrivetrain;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.spikes2212.utils.DoubleSpeedcontroller;

public class SubsystemComponents {

	public static class Drivetrain {
		public static final DoubleSpeedcontroller LEFT_SPEED_CONTROLLER = new DoubleSpeedcontroller(
				new WPI_TalonSRX(RobotMap.CAN.DRIVE_LEFT_1), new WPI_TalonSRX(RobotMap.CAN.DRIVE_LEFT_2));
		public static final DoubleSpeedcontroller RIGHT_SPEED_CONTROLLER = new DoubleSpeedcontroller(
				new WPI_TalonSRX(RobotMap.CAN.DRIVE_RIGHT_1), new WPI_TalonSRX(RobotMap.CAN.DRIVE_RIGHT_2));
	}

}
