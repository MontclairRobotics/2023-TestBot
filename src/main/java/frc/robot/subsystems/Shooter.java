package frc.robot.subsystems;

import org.team555.frc.command.commandrobot.ManagerSubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends ManagerSubsystemBase
{
    private final CANSparkMax leftMotor = new CANSparkMax(Constants.LEFT_SHOOTER_MOTOR_PORT, MotorType.kBrushless);
    private final CANSparkMax rightMotor = new CANSparkMax(Constants.RIGHT_SHOOTER_MOTOR_PORT, MotorType.kBrushless);
    
    public Shooter(){
        leftMotor.setInverted(Constants.SHOOTER_LEFT_INVERTED);
        rightMotor.setInverted(Constants.SHOOTER_RIGHT_INVERTED);
    }
    
    public void expel(){
        leftMotor.set(Constants.SHOOTER_SPEED);
        rightMotor.set(Constants.SHOOTER_SPEED);
    }
    public void repel(){
        leftMotor.set(-Constants.SHOOTER_SPEED);
        rightMotor.set(-Constants.SHOOTER_SPEED);
    }


    public void stop(){
      leftMotor.set(0);
      rightMotor.set(0);
    }
    /* Requires:
     *  - CanSparkMax left  : use MotorType.kBrushless so it doesn't catch on fire
     *  - CanSparkMax right : use MotorType.kBrushless so it doesn't catch on fire
     *  - static final double Constants.SHOOTER_SPEED
     *  - static final boolean Constants.SHOOTER_LEFT_INVERTED
     *  - static final boolean Constants.SHOOTER_RIGHT_INVERTED
     * 
     * The shooters of the robot are what allow the robot to play
     * dodgeball. They should be able to shoot out (expel) and prevent
     * the shooting of (repel) balls.
     * 
     * Keep in mind that the motors may be inverted; meaning that the
     * positive direction of input may not necessarily be the same as
     * the upward direction. Please use CanSparkMax.setInverted(boolean),
     * as well as a constant
     */

    // void expel() : Make both motors shoot out with the speed Constants.SHOOTER_SPEED.
    // void repel() : Make both motors shout in with the speed Constants.SHOOTER_SPEED.
    // void stop()  : Make both motors stop; speed 0.

    // @Override void whenInactive() : make sure both motors are stopped
}

// In Robot.java, make it so that the operator's LEFT_TRIGGER, when more than half-held, expels,
// and the operator's RIGHT_TRIGGER, when more than half-held, repels