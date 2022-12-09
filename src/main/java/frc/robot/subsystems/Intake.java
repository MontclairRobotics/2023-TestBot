package frc.robot.subsystems;

import org.team555.frc.command.commandrobot.ManagerSubsystemBase;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends ManagerSubsystemBase
{
    /*
     *Requires:
     *    - One CanSparkMax
     *          - port: Constants.INTAKE_MOTOR_PORT
     *          - use MotorType.kBrushless 
     *    - static final double Constants.INTAKE_SPEED
     * 
     * The intake is essentially a 'Ball Sucker'.
     * When you run the intake, a motor should spin around
     * which should allow the robot to suck in a ball located
     * in front of it.
     */

     //void startIntake(): make motor spin with speed Constants.INTAKE_SPEED
     //void startReverseIntake(): make motor spin backwards with speed Constants.INTAKE_SPEED
     //void stop(): stop the motor

     //@Override
     //void whenInactive(): make sure the motor is NOT running
    
}

//INSIDE OF Robot.java
// make it so that 
//         - when you hit X_Square, it starts sucking
//         - when you hit B_CIRCLE, it sucks in reverse 
//
