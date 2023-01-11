package frc.robot.subsystems;

import org.team555.frc.command.commandrobot.ManagerSubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends ManagerSubsystemBase
{
   // Creates the intake motor
   private final CANSparkMax motor = new CANSparkMax(Constants.INTAKE_MOTOR_PORT, MotorType.kBrushless);

   /**
    * Starts the intake with the speed {@index Constants.INTAKE_SPEED}
    */
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


