package frc.robot.subsystems;

import org.team555.frc.command.commandrobot.ManagerSubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import frc.robot.Constants;

public class Climber extends ManagerSubsystemBase
{
    /* Requires:
     *  - TalonFX left
     *  - TalonFX right
     *  - static final double Constants.CLIMBER_SPEED
     *  - static final boolean Constants.CLIMBER_LEFT_INVERTED
     *  - static final boolean Constants.CLIMBER_RIGHT_INVERTED
     * 
     * The climbers of the robot are what allow the robot to perform
     * "pull-ups." They must be controllable by the operator both for
     * ascending and descending. 
     * 
     * It is important that climbers do not exceed their physical limits,
     * so this code will be heavily reviewed before it is tested, since
     * otherwise the robot might damage itself.
     * 
     * Keep in mind that the motors may be inverted; meaning that the
     * positive direction of input may not necessarily be the same as
     * the upward direction. Please use TalonFX.setInverted(boolean),
     * as well as a constant
     */
    
    // NOTE: use ControlMode.PercentOutput for .set()

    // ! IMPORTANT
    // . Crossout
    // ? Question
    // todo: SOME TODO
    // note: a note
    // * documentation
    private final CANSparkMax motor = new CANSparkMax(Constants.INTAKE_MOTOR_PORT, MotorType.kBrushless);

    // void up()   : Make both motors go up with the speed Constants.CLIMBER_SPEED.
    // void down() : Make both motors go down with the speed Constants.CLIMBER_SPEED.
    // void stop() : Make both motors stop; speed 0.
    public void up()
    {
       motor.set(Constants.CLIMBER_SPEED);
    }
    public void down()
    {
       motor.set(-Constants.CLIMBER_SPEED);
    }
    public void stop()
    {
       motor.set(0);
    }
    // @Override void whenInactive() : make sure both motors are stopped
}

// In Robot.java, make it so that Y_TRIANGLE is climbers up and A_CROSS is climbers down