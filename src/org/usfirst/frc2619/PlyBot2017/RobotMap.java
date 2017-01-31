// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2619.PlyBot2017;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.DoubleSolenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI.Port;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveTrainLeftFrontMotor;
    public static CANTalon driveTrainRightFrontMotor;
    public static CANTalon driveTrainRightRearMotor;
    public static CANTalon driveTrainLeftRearMotor;
    public static DoubleSolenoid shiftersLeftShifter;
    public static DoubleSolenoid shiftersRightShifter;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    private final static int CURRENT_LIMIT = 4;// max current on each motor in amps
    
    public static AHRS driveTrainAHRS;
    
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftFrontMotor = new CANTalon(11);
        LiveWindow.addActuator("DriveTrain", "LeftFrontMotor", driveTrainLeftFrontMotor);
        
        driveTrainRightFrontMotor = new CANTalon(2);
        LiveWindow.addActuator("DriveTrain", "RightFrontMotor", driveTrainRightFrontMotor);
        
        driveTrainRightRearMotor = new CANTalon(3);
        LiveWindow.addActuator("DriveTrain", "RightRearMotor", driveTrainRightRearMotor);
        
        driveTrainLeftRearMotor = new CANTalon(10);
        LiveWindow.addActuator("DriveTrain", "LeftRearMotor", driveTrainLeftRearMotor);
        
        shiftersLeftShifter = new DoubleSolenoid(0, 0, 1);
        LiveWindow.addActuator("Shifters", "LeftShifter", shiftersLeftShifter);
        
        shiftersRightShifter = new DoubleSolenoid(0, 2, 3);
        LiveWindow.addActuator("Shifters", "RightShifter", shiftersRightShifter);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        driveTrainAHRS = new AHRS(Port.kMXP);
        driveTrainRightFrontMotor.setInverted(true);
        driveTrainRightRearMotor.setInverted(true);
        
    // BEGIN Code added by KAEDON
        
     // Change Right motor to follow mode
        driveTrainRightRearMotor.changeControlMode(CANTalon.TalonControlMode.Follower);
        // Set the device to follow the front motor with encoder 
        driveTrainRightRearMotor.set(driveTrainRightFrontMotor.getDeviceID());
        
     // Change Left motor to follow mode
        driveTrainLeftRearMotor.changeControlMode(CANTalon.TalonControlMode.Follower);
        // Set the device to follow the front motor with encoder 
        driveTrainLeftRearMotor.set(driveTrainLeftFrontMotor.getDeviceID());
        
     //Enable current limiting
        driveTrainLeftRearMotor.EnableCurrentLimit(true);
        driveTrainRightRearMotor.EnableCurrentLimit(true);
        driveTrainLeftFrontMotor.EnableCurrentLimit(true);
        driveTrainRightFrontMotor.EnableCurrentLimit(true);
        
     //Set Current Limiting value from int CurrentLimit   
        driveTrainLeftRearMotor.setCurrentLimit(CURRENT_LIMIT);
        driveTrainRightRearMotor.setCurrentLimit(CURRENT_LIMIT);
        driveTrainLeftFrontMotor.setCurrentLimit(CURRENT_LIMIT);
        driveTrainRightFrontMotor.setCurrentLimit(CURRENT_LIMIT);
        
    // END Code added by KAEDON
        
     
    }
}
