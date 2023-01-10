package frc.robot.subsystems;

import org.team555.frc.command.commandrobot.ManagerSubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Transport extends ManagerSubsystemBase
{
    /*
     *Requires:
     *    - One TalonFX
     *          - port: Constants.TRANSPORT_MOTOR_PORT 
     *    - static final double Constants.INTAKE_SPEED
     * 
     * The transport is essentially a 'Ball Mover'.
     * When you run the transport, a motor should spin around
     * which should move a belt which moves balls from the bottom,
     * next to the intake, to the top, next to shooter
     */
    public TalonFX transportMotor = new TalonFX(Constants.TRANSPORT_MOTOR_PORT);

    public void startTransporting()
    {
        transportMotor.set(ControlMode.PercentOutput, Constants.TRANSPORT_MOTOR_SPEED);
    }
    public void startMovingBackwards()
    {
        transportMotor.set(ControlMode.PercentOutput, -Constants.TRANSPORT_MOTOR_SPEED);
    }
    public void stop()
    {
        transportMotor.set(ControlMode.PercentOutput, 0);
    }

     //void startMoving(): make motor spin with speed Constants.BALL_TRANSPORT_SPEED
     //void startMovingBackwards(): make motor spin backwards with speed Constants.BALL_TRANSPORT_SPEED
     //void stop(): stop the motor
     // use ControlMode.PercentOutput

     //@Override
     //void whenInactive(): make sure the motor is NOT running
}

//In Robot.java
//make it so that
//      - When the DPad up, start moving
//      - When the DPad down, move it down