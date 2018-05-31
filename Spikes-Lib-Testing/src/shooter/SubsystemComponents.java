package shooter;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.spikes2212.utils.DoubleSpeedcontroller;
import com.spikes2212.utils.PIDSettings;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.VictorSP;

public class SubsystemComponents {

	public static class  Shooter {
		public static final VictorSP MOTOR = new VictorSP(RobotMap.PWM.SHOOTER_MOTOR);
		public static final Encoder ENCODER = new Encoder(RobotMap.DIO.ENCODER_A, RobotMap.DIO.ENCODER_B);
		
		
		public static final PIDSettings PID_SETTINGS = new PIDSettings(SubsystemConstants.Shooter.KP.get(), SubsystemConstants.Shooter.KI.get(), SubsystemConstants.Shooter.KD.get(), 0, 1);
		
	}

}
