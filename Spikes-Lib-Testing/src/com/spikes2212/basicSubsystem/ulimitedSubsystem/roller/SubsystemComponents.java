package com.spikes2212.basicSubsystem.ulimitedSubsystem.roller;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.spikes2212.utils.DoubleSpeedcontroller;

import edu.wpi.first.wpilibj.VictorSP;

public class SubsystemComponents {

	public static class Roller {
		public static final VictorSP MOTOR = new VictorSP(RobotMap.PWM.ROLLER_MOTOR);
	}

}
