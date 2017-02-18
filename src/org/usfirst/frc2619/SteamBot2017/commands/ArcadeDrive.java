// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc2619.SteamBot2017.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc2619.SteamBot2017.MathUtil;
import org.usfirst.frc2619.SteamBot2017.Robot;

import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;

/**
 *
 */
public class ArcadeDrive extends Command {

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
	private CANTalon.TalonControlMode previousControlMode;

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
	public ArcadeDrive() {

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		previousControlMode = Robot.driveTrain.getControlMode();
		Robot.driveTrain.setControlMode(TalonControlMode.PercentVbus);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		double rightSpeed, leftSpeed, dbX = Robot.driveTrain.deadband_x, dbY = Robot.driveTrain.deadband_y;
		double power = Robot.driveTrain.delin_pow;
		leftSpeed = MathUtil.deadbandCheck(-1 * Robot.oi.getLeftJoystick().getY(), dbY)
				+ MathUtil.deadbandCheck(Robot.oi.getLeftJoystick().getX(), dbX);
		rightSpeed = MathUtil.deadbandCheck(-1 * Robot.oi.getLeftJoystick().getY(), dbY)
				+ MathUtil.deadbandCheck(-1 * Robot.oi.getLeftJoystick().getX(), dbX);
		leftSpeed = MathUtil.delinearize(leftSpeed, power);
		rightSpeed = MathUtil.delinearize(rightSpeed, power);
		Robot.driveTrain.run(leftSpeed, rightSpeed);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.driveTrain.setControlMode(previousControlMode);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
