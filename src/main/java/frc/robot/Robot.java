// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import org.team555.frc.command.AutoCommands;
import org.team555.frc.command.Commands;
import org.team555.frc.command.commandrobot.RobotContainer;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends RobotContainer 
{
    // Create all subsystems here
    // using `static final`.

    @Override
    public void initialize() 
    {
        // First, add all setup code

        // Then, create all shuffleboard initialization

        // Then, create all button bindings

        // Then, create autonomous commands
        AutoCommands.add("Main", () -> Commands.instant(() -> {}));

        // Finally, set up the auto command chooser on shuffleboard
        Shuffleboard.getTab("Main").add("Auto Commands", AutoCommands.chooser());
    }
}
