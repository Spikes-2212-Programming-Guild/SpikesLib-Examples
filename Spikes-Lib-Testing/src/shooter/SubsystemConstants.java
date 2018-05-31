package shooter;

import java.util.function.Supplier;

import com.spikes2212.dashboard.ConstantHandler;

public class SubsystemConstants {
	public static class Shooter {
		public static final Supplier<Double> SHOOT_SPEED = ConstantHandler.addConstantDouble("Shoot Speed", 1000);
		public static final Supplier<Double> SHOOT_ACCELERATION = ConstantHandler.addConstantDouble("Shoot Acceleration", 1000);
		
		public static final Supplier<Double> KP = ConstantHandler.addConstantDouble("Shooter PID's KP", 07);
		public static final Supplier<Double> KI= ConstantHandler.addConstantDouble("Shooter PID's KI", 01);
		public static final Supplier<Double> KD = ConstantHandler.addConstantDouble("Shooter PID's KD", 01);
	}
}
