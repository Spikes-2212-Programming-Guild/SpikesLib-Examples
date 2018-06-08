
package com.spikes2212.basicSubsystem.limitedSubsystem.arm;

import com.spikes2212.dashboard.DashBoardController;
import com.spikes2212.genericsubsystems.basicSubsystem.BasicSubsystem;
import com.spikes2212.genericsubsystems.basicSubsystem.commands.MoveBasicSubsystem;
import com.spikes2212.genericsubsystems.basicSubsystem.utils.limitationFunctions.TwoLimits;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
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
	public static BasicSubsystem arm;

	DashBoardController dbc;

	@Override
	public void robotInit() {

		arm = new BasicSubsystem(SubsystemComponents.Arm.ARM_MOTOR::set, new TwoLimits(SubsystemComponents.Arm.UPPER_LIMIT::get, SubsystemComponents.Arm.DOWN_LIMIT::get));

		// initializing oi and the dash board controller
		oi = new OI();
		dbc = new DashBoardController();

		// adding the arm's speed to the dash board
		dbc.addDouble("arm speed", SubsystemComponents.Arm.ARM_MOTOR::get);

		// adding the arm's up and down limits' feedback to the dash board
		dbc.addBoolean("is up", SubsystemComponents.Arm.UPPER_LIMIT::get);
		dbc.addBoolean("is down", SubsystemComponents.Arm.DOWN_LIMIT::get);
		
		SmartDashboard.putData("Move Arm Up", new MoveBasicSubsystem(Robot.arm, SubsystemConstants.Arm.ARM_UP_SPEED));
		SmartDashboard.putData("Move Arm Down", new MoveBasicSubsystem(Robot.arm, SubsystemConstants.Arm.ARM_DOWN_SPEED));
	}

	/**
	 * This function is called once each time the robot enters Disabled mode. You
	 * can use it to reset any subsystem information you want to clear when the
	 * robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
		//updating the dash board controller
		dbc.update();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable chooser
	 * code works with the Java SmartDashboard. If you prefer the LabVIEW Dashboard,
	 * remove all of the chooser code and uncomment the getString code to get the
	 * auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons to
	 * the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {

		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector", "Default");
		 * switch(autoSelected) { case "My Auto": autonomousCommand = new
		 * MyAutoCommand(); break; case "Default Auto": default: autonomousCommand = new
		 * ExampleCommand(); break; }
		 */

		// schedule the autonomous command (example)
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		//updating the dash board controller
		dbc.update();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		//updating the dash board controller
		dbc.update();
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
	}
}
