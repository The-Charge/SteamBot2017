// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc2619.SteamBot2017.subsystems;

import org.usfirst.frc2619.SteamBot2017.Robot;
import org.usfirst.frc2619.SteamBot2017.RobotMap;
import org.usfirst.frc2619.SteamBot2017.TheChargeDashboard;
import org.usfirst.frc2619.SteamBot2017.commands.*;

import com.mindsensors.CANLight;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class CANLights extends Subsystem {

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS
	CANLight cANLight = new CANLight(3);
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	// Put methods for controlling this subsystem
	// here. Call these from Commands.secret code == hah

	public void initDefaultCommand() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public void LightRun(int r, int g, int b) {
		cANLight.showRGB(r, g, b);
	}

	public void LightOff() {
		cANLight.showRGB(0, 0, 0);
	}

	public void displayCANLightValues() {
		TheChargeDashboard.putNumber("CANLightRed", 0);
		TheChargeDashboard.putNumber("CANLightGreen", 0);
		TheChargeDashboard.putNumber("CANLightBlue", 0);
	}

	public void displayCANLightValues(int r, int g, int b) {
		TheChargeDashboard.putNumber("CANLightRed", r);
		TheChargeDashboard.putNumber("CANLightGreen", g);
		TheChargeDashboard.putNumber("CANLightBlue", b);
	}

	public void chargeColor() {
		cANLight.writeRegister(1, 0.5, 0, 255, 0); // green
		cANLight.writeRegister(2, 0.5, 255, 255, 0); // yellow
		cANLight.cycle(1, 2);
	}

	public void blink() {
		cANLight.writeRegister(1, 0.5, (int) SmartDashboard.getNumber("CANLightRed", 0),
				(int) SmartDashboard.getNumber("CANLightGreen", 0), (int) SmartDashboard.getNumber("CANLightBlue", 0)); // current
		cANLight.writeRegister(2, 0.5, 0, 0, 0); // off
		cANLight.cycle(1, 2);
	}

	public void blink(int r, int g, int b) {
		cANLight.writeRegister(1, 0.5, r, g, b); // current
		cANLight.writeRegister(2, 0.5, 0, 0, 0); // off
		cANLight.cycle(1, 2);
	}

	public void colorAlliance() {

		DriverStation ds = DriverStation.getInstance();
		if (ds.getAlliance() == DriverStation.Alliance.Red) {
			Robot.cANLights.LightRun(255, 0, 0);
			Robot.cANLights.displayCANLightValues(255, 0, 0);
		} else if (ds.getAlliance() == DriverStation.Alliance.Blue) {
			Robot.cANLights.LightRun(0, 0, 255);
			Robot.cANLights.displayCANLightValues(0, 0, 255);
		} else if (ds.getAlliance() == DriverStation.Alliance.Invalid) {
			Robot.cANLights.LightRun(255, 255, 0);
			Robot.cANLights.displayCANLightValues(255, 255, 0); // yellow
		}

	}

	public int[] hslToRGB(double h, double s, double l) {

		double r = 0, g = 0, b = 0;
		double chroma = 0.8; // 0.8 * saturation (int) -> 0.8
		h = (h + 1) * 180;
		double x1 = (h / 60); // [0,6]
		double x2 = chroma * (1 - Math.abs((x1 % 2) - 1)); // chroma * 0 or 1 ->
															// .8 or 0
		double m = 0.2;
		if (x1 < 1 && x1 >= 0) { // x2 == 0
			r = chroma; // 255
			g = x2;
			b = 0;
		} else if (x1 < 2 && x1 >= 1) { // x2 == 1
			r = x2;
			g = chroma; // 255
			b = 0;
		} else if (x1 < 3 && x1 >= 2) { // x2 == 2
			r = 0;
			g = chroma; // 255
			b = x2;
		} else if (x1 < 4 && x1 >= 3) { // x2 == 3
			r = 0;
			g = x2;
			b = chroma; // 255
		} else if (x1 < 5 && x1 >= 4) { // x2 == 4
			r = x2;
			g = 0;
			b = chroma; // 255
		} else if (x1 <= 6 && x1 >= 5) { // x2 == 5 || x2 == 6
			r = chroma; // 255
			g = 0;
			b = x2;
		}
		r = (r + m) * 255;
		g = (g + m) * 255;
		b = (b + m) * 255;
		displayCANLightValues((int) r, (int) g, (int) b);
		TheChargeDashboard.putNumber("CANLightHue", h);
		int[] rgb = { (int) r, (int) g, (int) b };
		return rgb;

	}

	public void LightRun(int[] rgb) {
		cANLight.showRGB(rgb[0], rgb[1], rgb[2]);
	}

}
