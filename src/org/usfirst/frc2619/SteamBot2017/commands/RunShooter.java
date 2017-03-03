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

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc2619.SteamBot2017.Robot;

/**
 *
 */
public class RunShooter extends Command {
	private static final double SPEED = 0.81;
	private static final double OFFSET = 0.1;

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
	public RunShooter() {

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.shooterMotors);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.ledBoard.bitmap(4);
		Robot.cANLights.LightRun(255, 69, 0);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		if (Robot.oi.buttonBox.getRawButton(15)) {
			double upperConstraint = SPEED + OFFSET > 1 ? 1 : SPEED + OFFSET;
			double lowerConstraint = SPEED - OFFSET < 0 ? 0 : SPEED - OFFSET;
			Robot.shooterMotors.set((-Robot.oi.buttonBox.getRawAxis(0) * ((upperConstraint - lowerConstraint) / 2)) + ((upperConstraint + lowerConstraint) / 2));
			//SmartDashboard.putNumber("ShooterPotValue", (-Robot.oi.buttonBox.getRawAxis(0) * ((upperConstraint - lowerConstraint) / 2)) + ((upperConstraint + lowerConstraint) / 2));
		}
		else {
			Robot.shooterMotors.set(SPEED);
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.shooterMotors.stop();
		Robot.ledBoard.bitmapRandom();
		Robot.cANLights.colorAlliance();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
