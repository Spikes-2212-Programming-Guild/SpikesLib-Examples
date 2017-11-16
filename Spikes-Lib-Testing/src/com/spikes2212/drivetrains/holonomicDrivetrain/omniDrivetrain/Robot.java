
package com.spikes2212.drivetrains.holonomicDrivetrain.omniDrivetrain;

import com.ctre.CANTalon;
import com.spikes2212.dashboard.DashBoardController;
import com.spikes2212.genericsubsystems.drivetrains.HolonomicDrivetrain;
import com.spikes2212.genericsubsystems.drivetrains.TankDrivetrain;
import com.spikes2212.genericsubsystems.drivetrains.commands.DriveArcade;
import com.spikes2212.genericsubsystems.drivetrains.commands.DriveHolonomic;
import com.spikes2212.genericsubsystems.drivetrains.commands.DriveTank;
import com.spikes2212.utils.DoubleSpeedcontroller;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;

	Command autonomousCommand;
	SendableChooser<Command> chooser = new SendableChooser<>();
	public static HolonomicDrivetrain drivetrain;
	DashBoardController dbc;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		DoubleSpeedcontroller leftControl = new DoubleSpeedcontroller(new CANTalon(RobotMap.CAN.DRIVE_LEFT_1),
				new CANTalon(RobotMap.CAN.DRIVE_LEFT_2));
		DoubleSpeedcontroller rightControl = new DoubleSpeedcontroller(new CANTalon(RobotMap.CAN.DRIVE_RIGHT_1),
				new CANTalon(RobotMap.CAN.DRIVE_RIGHT_2));
		leftControl.setInverted(true);

		CANTalon rearMotor = new CANTalon(RobotMap.CAN.DRIVE_REAR);
		CANTalon frontMotor = new CANTalon(RobotMap.CAN.DRIVE_FRONT);
		rearMotor.setInverted(true);

		drivetrain = new HolonomicDrivetrain(leftControl::set, rightControl::set,
				new DoubleSpeedcontroller(leftControl, rightControl)::set,
				new DoubleSpeedcontroller(rearMotor, frontMotor)::set);
		drivetrain.setDefaultCommand(new DriveHolonomic(drivetrain, oi::getRightY, oi::getLeftX));

		oi = new OI();
		dbc = new DashBoardController();
		dbc.addDouble("left", new CANTalon(RobotMap.CAN.DRIVE_LEFT_1)::get);
		dbc.addDouble("right", new CANTalon(RobotMap.CAN.DRIVE_RIGHT_1)::get);
		// chooser.addObject("My Auto", new MyAutoCommand());
		SmartDashboard.putData("Auto mode", chooser);
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		autonomousCommand = chooser.getSelected();

		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */

		// schedule the autonomous command (example)
		if (autonomousCommand != null)
			autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand != null)
			autonomousCommand.cancel();
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		dbc.update();
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();

	}
}
