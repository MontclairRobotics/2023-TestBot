package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import java.util.Arrays;

import org.team555.frc.command.commandrobot.ManagerSubsystemBase;
import org.team555.frc.command.commandrobot.RobotContainer;

import com.kauailabs.navx.frc.AHRS;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.trajectory.Trajectory;
import edu.wpi.first.util.sendable.Sendable;
import edu.wpi.first.util.sendable.SendableBuilder;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import static frc.robot.Constants.*;

import frc.robot.Constants;

public final class Drivetrain extends ManagerSubsystemBase
{
    ////////////////////////////////////////////////
    // Final fields
    ////////////////////////////////////////////////
    private final CANSparkMax 
        leftMotor1 = new CANSparkMax(LEFT_MOTOR_1_PORT, MotorType.kBrushless),
        leftMotor2 = new CANSparkMax(LEFT_MOTOR_2_PORT, MotorType.kBrushless),
        leftMotor3 = new CANSparkMax(LEFT_MOTOR_3_PORT, MotorType.kBrushless),
        rightMotor1 = new CANSparkMax(RIGHT_MOTOR_1_PORT, MotorType.kBrushless),
        rightMotor2 = new CANSparkMax(RIGHT_MOTOR_2_PORT, MotorType.kBrushless),
        rightMotor3 = new CANSparkMax(RIGHT_MOTOR_3_PORT, MotorType.kBrushless)
    ;
    
    private final CANSparkMax[]
        leftMotors = {
            leftMotor1,
            leftMotor2,
            leftMotor3
        },
        rightMotors = {
            rightMotor1, 
            rightMotor2,
            rightMotor3
        }
    ;

    private final RelativeEncoder 
        leftEncoder1 = leftMotor1.getEncoder(),
        leftEncoder2 = leftMotor2.getEncoder(),
        leftEncoder3 = leftMotor3.getEncoder(),
        rightEncoder1 = rightMotor1.getEncoder(),
        rightEncoder2 = rightMotor2.getEncoder(),
        rightEncoder3 = rightMotor3.getEncoder()
    ;


    private final RelativeEncoder[]
        leftEncoders = {
            leftEncoder1,
            leftEncoder2,
            leftEncoder3
        },
        rightEncoders = {
            rightEncoder1, 
            rightEncoder2,
            rightEncoder3
        }
    ;


    private final MotorControllerGroup leftMotorGroup = new MotorControllerGroup(leftMotors);
    private final MotorControllerGroup rightMotorGroup = new MotorControllerGroup(rightMotors);

    private final DifferentialDrive differentialDrive 
        = new DifferentialDrive(leftMotorGroup, rightMotorGroup);

    ////////////////////////////////////////////////
    // Other fields
    ////////////////////////////////////////////////

    private int currentSpeedIndex = 0;

    private double targetSpeed;
    private double targetTurn;

    private double maxOutput = 1.0;
    
    ////////////////////////////////////////////////
    // Constructor
    ////////////////////////////////////////////////
    public Drivetrain() 
    {
        for(var m : leftMotors)
        {
            m.setInverted(LEFT_DRIVE_INVERSION);
        }
        for(var m : rightMotors)
        {
            m.setInverted(RIGHT_DRIVE_INVERSION);
        }

        for(var e : leftEncoders)
        {
            e.setPositionConversionFactor(CONVERSION_RATE);
        }
        for(var e : rightEncoders)
        {
            e.setPositionConversionFactor(CONVERSION_RATE);
        }
    }

    ////////////////////////////////////////////////
    // Methods
    ////////////////////////////////////////////////

    /**
     * Stop the motors of this subsystem
     */
    public void stop() 
    {
        differentialDrive.stopMotor();
    }

    /** 
     * Updates the target distance from what is inputted
     */

    public void set(double targetSpeed, double targetTurn)
    {
        this.targetSpeed = targetSpeed;
        this.targetTurn = targetTurn;
        //System.out.println("Setting Speed to: " + targetSpeed + "speed");
        //System.out.println("Setting Angle to: " + targetTurn + "percent turning");
        differentialDrive.arcadeDrive(targetSpeed, targetTurn, false);
    }

    /**
     * Update this subsystem
     */
    // @Override
    // public void always()
    // {
    //     if(DriverStation.isDisabled())
    //     {
    //         return;
    //     }

    //     // Locals for speed and turn
    //     double speed, turn;

    //     // Pid the speed distance of the input if targetting a distacne

    //     // Clamp speed
    //     speed = MathUtil.clamp(speed, -maxOutput, maxOutput);

    //     differentialDrive.arcadeDrive(speed, turn, false);
    // }

    @Override
    public void initialize() {
        // TODO Auto-generated method stub
        
    }
}

    