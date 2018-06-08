package com.spikes2212.basicSubsystem.ulimitedSubsystem.roller;

import edu.wpi.first.wpilibj.VictorSP;

public class SubsystemComponents {

	public static class Roller {
		public static final VictorSP MOTOR = new VictorSP(RobotMap.PWM.ROLLER_MOTOR);
	}

}
