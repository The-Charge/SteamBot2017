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
import org.usfirst.frc2619.SteamBot2017.Robot;

/**
 *
 */
public class ClimbOverride extends Command {
	private static final double SPEED = 1;

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
	public ClimbOverride() {

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.ropeClimber);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		this.setTimeout(.05);
		Robot.ropeClimber.setMotorModes();
		Robot.cANLights.LightRun(0, 255, 0);
		Robot.ledBoard.bitmap(3);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.ropeClimber.run(SPEED);
	}

	// Called once after isFinished returns true
	protected boolean isFinished() {
		if (!this.isTimedOut() || Robot.oi.buttonBox.getRawButton(6))
			return false;
		else
			return true;
	}

	protected void end() {
		Robot.ropeClimber.stop();
		Robot.ledBoard.bitmapRandom();
		Robot.cANLights.colorAlliance();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
