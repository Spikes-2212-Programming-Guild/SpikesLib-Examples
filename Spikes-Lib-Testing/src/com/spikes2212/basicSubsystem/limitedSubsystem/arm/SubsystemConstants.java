package com.spikes2212.basicSubsystem.limitedSubsystem.arm;

import java.util.function.Supplier;

import com.spikes2212.dashboard.ConstantHandler;

/**
 * 
 * This class contains all of the constants for every subsystem. It is primarily
 * used in the Robot class.
 * 
 * 
 * @author Matan
 *
 */
public class SubsystemConstants {

	/**
	 * 
	 * This class contains all of the arm's constants.
	 * 
	 * 
	 * @author Matan
	 */
	public static class Arm {
		public static final Supplier<Double> ARM_DOWN_SPEED = ConstantHandler.addConstantDouble("arm down speed", -0.3);
		public static final Supplier<Double> ARM_UP_SPEED = ConstantHandler.addConstantDouble("arm up speed", 0.3);
	}
}
