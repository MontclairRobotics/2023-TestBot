// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import org.team555.frc.command.AutoCommands;
import org.team555.frc.command.Commands;
import org.team555.frc.command.commandrobot.RobotContainer;
import org.team555.frc.controllers.GameController;
import org.team555.frc.controllers.GameController.Button;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Climber;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends RobotContainer 
{   
    private static final GameController drivercontroller = GameController.from(Constants.DRIVER_CONTROLLER_TYPE, 0);
    private static final GameController operatorController = GameController.from(Constants.OPERATOR_CONTROLLER_TYPE, 0);
    // Create all subsystems here
    // using `static final`.
    private static final Intake intake = new Intake();
    private static final Climber climber = new Climber();

    @Override
    public void initialize() 
    {
        // First, add all setup code

        // Then, create all shuffleboard initialization

        // Then, create all button bindings
        
        // suck
        operatorController.getButton(Button.X_SQUARE)
            .whenActive(() -> intake.startIntake())
            .whenInactive(() -> intake.stop());
        
        // unsuck
        operatorController.getButton(Button.B_CIRCLE)
            .whenActive(() -> intake.startReverseIntake())
            .whenInactive(() -> intake.stop());

        //climbers up
        operatorController.getButton(Button.Y_TRIANGLE)
            .whenActive(() -> climber.up())
            .whenInactive(() -> climber.stop());
        
        //climbers down
        operatorController.getButton(Button.A_CROSS)
            .whenActive(() -> climber.down())
            .whenInactive(() -> climber.stop());
    
        // Then, create autonomous commands
        AutoCommands.add("Main", () -> Commands.instant(() -> {}));

        // Finally, set up the auto command chooser on shuffleboard
        Shuffleboard.getTab("Main").add("Auto Commands", AutoCommands.chooser());
    }
}
