// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc2619.SteamBot2017;

import org.usfirst.frc2619.SteamBot2017.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton leftInvertBtn;
    public JoystickButton leftShiftLowButton;
    public JoystickButton leftPickupBtn;
    public JoystickButton leftShiftHighBtn;
    public JoystickButton leftLockStraight;
    public JoystickButton leftSpeedControl;
    public Joystick leftJoystick;
    public JoystickButton rightShiftHighButton;
    public JoystickButton rightInvertBtn;
    public JoystickButton rightPickupBtn;
    public JoystickButton rightShiftLowBtn;
    public JoystickButton rightLockStraight;
    public JoystickButton rightSpeedControl;
    public Joystick rightJoystick;
    public JoystickButton runShooterBtn;
    public JoystickButton runPickupBtn;
    public JoystickButton openDoorsBtn;
    public JoystickButton closeDoorsBtn;
    public JoystickButton climbRopeBtn;
    public JoystickButton stopIndexerBtn;
    public JoystickButton onCameraLightsBtn;
    public JoystickButton offCameraLightsBtn;
    public JoystickButton climbOverrideBtn;
    public JoystickButton extendPlungerBtn;
    public JoystickButton raddOnBtn;
    public JoystickButton retractPlungerBtn;
    public JoystickButton runIndexerBtn;
    public JoystickButton raddOffBtn;
    public JoystickButton closePlungeBtn;
    public JoystickButton openPlungeBtn;
    public Joystick buttonBox;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	public OI() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        buttonBox = new Joystick(2);
        
        openPlungeBtn = new JoystickButton(buttonBox, 8);
        openPlungeBtn.whenPressed(new OpenPlunge());
        closePlungeBtn = new JoystickButton(buttonBox, 8);
        closePlungeBtn.whenReleased(new ClosePlunge());
        raddOffBtn = new JoystickButton(buttonBox, 11);
        raddOffBtn.whenReleased(new OffLed());
        runIndexerBtn = new JoystickButton(buttonBox, 14);
        runIndexerBtn.whileHeld(new RunIndexer());
        retractPlungerBtn = new JoystickButton(buttonBox, 10);
        retractPlungerBtn.whenReleased(new RetractPlunger());
        raddOnBtn = new JoystickButton(buttonBox, 11);
        raddOnBtn.whenPressed(new OnLed());
        extendPlungerBtn = new JoystickButton(buttonBox, 10);
        extendPlungerBtn.whenPressed(new ExtendPlunger());
        climbOverrideBtn = new JoystickButton(buttonBox, 6);
        climbOverrideBtn.whileHeld(new ClimbOverride());
        offCameraLightsBtn = new JoystickButton(buttonBox, 12);
        offCameraLightsBtn.whenReleased(new OffCameraLights());
        onCameraLightsBtn = new JoystickButton(buttonBox, 12);
        onCameraLightsBtn.whenPressed(new OnCameraLights());
        stopIndexerBtn = new JoystickButton(buttonBox, 14);
        stopIndexerBtn.whenReleased(new StopIndexer());
        climbRopeBtn = new JoystickButton(buttonBox, 5);
        climbRopeBtn.whileHeld(new ClimbRope());
        closeDoorsBtn = new JoystickButton(buttonBox, 9);
        closeDoorsBtn.whenReleased(new CloseDoors());
        openDoorsBtn = new JoystickButton(buttonBox, 9);
        openDoorsBtn.whenPressed(new OpenDoors());
        runPickupBtn = new JoystickButton(buttonBox, 16);
        runPickupBtn.whileHeld(new RunPickup());
        runShooterBtn = new JoystickButton(buttonBox, 13);
        runShooterBtn.whileHeld(new RunShooter());
        rightJoystick = new Joystick(1);
        
        rightSpeedControl = new JoystickButton(rightJoystick, 3);
        rightSpeedControl.whileHeld(new SpeedControl());
        rightLockStraight = new JoystickButton(rightJoystick, 6);
        rightLockStraight.whenPressed(new ToggleLockStraight());
        rightShiftLowBtn = new JoystickButton(rightJoystick, 4);
        rightShiftLowBtn.whenPressed(new ShiftLow());
        rightPickupBtn = new JoystickButton(rightJoystick, 1);
        rightPickupBtn.whileHeld(new RunPickup());
        rightInvertBtn = new JoystickButton(rightJoystick, 2);
        rightInvertBtn.whenPressed(new DriveInverted());
        rightShiftHighButton = new JoystickButton(rightJoystick, 5);
        rightShiftHighButton.whenPressed(new ShiftHigh());
        leftJoystick = new Joystick(0);
        
        leftSpeedControl = new JoystickButton(leftJoystick, 3);
        leftSpeedControl.whileHeld(new SpeedControl());
        leftLockStraight = new JoystickButton(leftJoystick, 6);
        leftLockStraight.whenPressed(new ToggleLockStraight());
        leftShiftHighBtn = new JoystickButton(leftJoystick, 5);
        leftShiftHighBtn.whenPressed(new ShiftHigh());
        leftPickupBtn = new JoystickButton(leftJoystick, 1);
        leftPickupBtn.whileHeld(new RunPickup());
        leftShiftLowButton = new JoystickButton(leftJoystick, 4);
        leftShiftLowButton.whenPressed(new ShiftLow());
        leftInvertBtn = new JoystickButton(leftJoystick, 2);
        leftInvertBtn.whenPressed(new DriveInverted());


        // SmartDashboard Buttons
       /* SmartDashboard.putData("ShiftLow", new ShiftLow());
        SmartDashboard.putData("ShiftHigh", new ShiftHigh());
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("TankDrive", new TankDrive());
        SmartDashboard.putData("DriveXSeconds", new DriveXSeconds());
        SmartDashboard.putData("ArcadeDrive", new ArcadeDrive());
        SmartDashboard.putData("ClaytonDrive", new ClaytonDrive());
        SmartDashboard.putData("HaloDrive", new HaloDrive());
        SmartDashboard.putData("XboxDrive", new XboxDrive());
        SmartDashboard.putData("MotionMagicMode", new MotionMagicMode());
        SmartDashboard.putData("DriveXFeetMM: DXF_MM_20", new DriveXFeetMM(0, 0, 20));
        SmartDashboard.putData("DriveXFeetMM: DXF_MM_5", new DriveXFeetMM(0, 0, 5));
        SmartDashboard.putData("DriveXFeetMM: DXF_MM_10", new DriveXFeetMM(0, 0, 10));
        SmartDashboard.putData("DriveXFeetMM: DXF_MM_-5", new DriveXFeetMM(0, 0, -5));
        SmartDashboard.putData("RunShooter", new RunShooter());
        SmartDashboard.putData("OpenDoors", new OpenDoors());
        SmartDashboard.putData("CloseDoors", new CloseDoors());
        SmartDashboard.putData("ExtendPlunger", new ExtendPlunger());
        SmartDashboard.putData("RetractPlunger", new RetractPlunger());
        SmartDashboard.putData("OffLed", new OffLed());
        SmartDashboard.putData("OnLed", new OnLed());
        SmartDashboard.putData("RunLed", new RunLed());
        SmartDashboard.putData("ClimbRope", new ClimbRope());
        SmartDashboard.putData("OnCameraLights", new OnCameraLights());
        SmartDashboard.putData("OffCameraLights", new OffCameraLights());
        SmartDashboard.putData("RunPickup", new RunPickup());
        SmartDashboard.putData("RunIndexer", new RunIndexer());
        SmartDashboard.putData("TurnNDegreesAbsolutePID: FortyFive", new TurnNDegreesAbsolutePID(45));
        SmartDashboard.putData("TurnNDegreesAbsolutePID: NegFortyFive", new TurnNDegreesAbsolutePID(-45));
        SmartDashboard.putData("TurnNDegreesAbsolutePID: OneEighty", new TurnNDegreesAbsolutePID(180));
        SmartDashboard.putData("AllianceColor", new AllianceColor());
        SmartDashboard.putData("Blink", new Blink());
        SmartDashboard.putData("ChargeColors", new ChargeColors());
        SmartDashboard.putData("OffCANLights", new OffCANLights());
        SmartDashboard.putData("RunCANLights", new RunCANLights());
        SmartDashboard.putData("GearPegRightAutonBlue", new GearPegRightAutonBlue());
        SmartDashboard.putData("GearPegLeftAutonRed", new GearPegLeftAutonRed());
        SmartDashboard.putData("GearPegMiddleAutonRed", new GearPegMiddleAutonRed());
        SmartDashboard.putData("DriveToCurrent: 0.1", new DriveToCurrent(0.1));
        SmartDashboard.putData("TurnNDegreesRelativePID: 90", new TurnNDegreesRelativePID(90));
        SmartDashboard.putData("EnableCurrentLimit", new EnableCurrentLimit());
        SmartDashboard.putData("DisableCurrentLimit", new DisableCurrentLimit());
        SmartDashboard.putData("DriveToTarget: 2", new DriveToTarget(2));
        SmartDashboard.putData("DeliverGearWithVision", new DeliverGearWithVision());
        SmartDashboard.putData("DeliverGear", new DeliverGear());
        SmartDashboard.putData("RunPickupReverse", new RunPickupReverse());
        SmartDashboard.putData("DroneDrive", new DroneDrive());
        SmartDashboard.putData("GearPegLeftAutonBlueDrive", new GearPegLeftAutonBlueDrive());
        SmartDashboard.putData("GearPegRightAutonRedDrive", new GearPegRightAutonRedDrive());
        SmartDashboard.putData("HueShift", new HueShift());
        SmartDashboard.putData("AutonShooter", new AutonShooter());
        SmartDashboard.putData("ToggleLockStraight", new ToggleLockStraight());
        SmartDashboard.putData("SpeedControl", new SpeedControl());
        SmartDashboard.putData("OpenPlunge", new OpenPlunge());
        SmartDashboard.putData("ClosePlunge", new ClosePlunge());
        SmartDashboard.putData("GearPegMiddleAutonBlue", new GearPegMiddleAutonBlue());
        SmartDashboard.putData("ClimbOverride", new ClimbOverride());
        SmartDashboard.putData("DriveInverted", new DriveInverted());
        SmartDashboard.putData("GearPegLeftAutonBlueShoot", new GearPegLeftAutonBlueShoot());
        SmartDashboard.putData("GearPegRightAutonRedShoot", new GearPegRightAutonRedShoot());
        SmartDashboard.putData("BlueHopperShoot", new BlueHopperShoot());
        SmartDashboard.putData("RedHopperShoot", new RedHopperShoot());
        SmartDashboard.putData("BlueHopperShootChain", new BlueHopperShootChain());
        SmartDashboard.putData("RedHopperShootChain", new RedHopperShootChain());
        SmartDashboard.putData("RedShootOnly", new RedShootOnly());
        SmartDashboard.putData("BlueShootOnly", new BlueShootOnly());*/

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
	}

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getLeftJoystick() {
        return leftJoystick;
    }

    public Joystick getRightJoystick() {
        return rightJoystick;
    }

    public Joystick getButtonBox() {
        return buttonBox;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
