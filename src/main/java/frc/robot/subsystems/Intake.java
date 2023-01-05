package frc.robot.subsystems;

import org.team555.frc.command.commandrobot.ManagerSubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends ManagerSubsystemBase
{
    /*
     *Requires:
     *    - One CANSparkMax
     *          - port: Constants.INTAKE_MOTOR_PORT
     *          - use MotorType.kBrushless 
     *    - static final double Constants.INTAKE_SPEED
     * 
     * The intake is essentially a 'Ball Sucker'.
     * When you run the intake, a motor should spin around
     * which should allow the robot to suck in a ball located
     * in front of it.
     */
    private final CANSparkMax motor = new CANSparkMax(Constants.INTAKE_MOTOR_PORT, MotorType.kBrushless);
     
     //void startIntake(): make motor spin with speed Constants.INTAKE_SPEED
     //void startReverseIntake(): make motor spin backwards with speed Constants.INTAKE_SPEED
     //void stop(): stop the motor

     public void startIntake()
     {
        motor.set(Constants.INTAKE_SPEED);
     }
     public void startReverseIntake()
     {
        motor.set(-Constants.INTAKE_SPEED);
     }
     public void stop()
     {
        motor.set(0);
     }
    
}

//INSIDE OF Robot.java
// make it so that 
//         - when you hit X_Square, it starts sucking
//         - when you hit B_CIRCLE, it sucks in reverse 
//
