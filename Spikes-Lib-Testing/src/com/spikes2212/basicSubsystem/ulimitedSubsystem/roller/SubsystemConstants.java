package com.spikes2212.basicSubsystem.ulimitedSubsystem.roller;

import java.util.function.Supplier;

import com.spikes2212.dashboard.ConstantHandler;

public class SubsystemConstants {
	public static class roller {
		public static final Supplier<Double> ROLLER_IN_SPEED = ConstantHandler.addConstantDouble("Roller In Speed", 2212);
	}
}
