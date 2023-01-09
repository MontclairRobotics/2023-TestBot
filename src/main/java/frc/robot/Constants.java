// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import org.team555.frc.controllers.GameController;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants 
{
    // Left Motor Ports
    public static final int LEFT_MOTOR_1_PORT = 2; 
    public static final int LEFT_MOTOR_2_PORT = 4;
    public static final int LEFT_MOTOR_3_PORT = 3;

    // Right Motor Ports
    public static final int RIGHT_MOTOR_1_PORT = 9;
    public static final int RIGHT_MOTOR_2_PORT = 10;
    public static final int RIGHT_MOTOR_3_PORT = 11;

    // Intake motor port number
    public static final int INTAKE_MOTOR_PORT = 1;

    // Transport motor port number
    public static final int TRANSPORT_MOTOR_PORT = 40;
    
    // Shooter motor Port
    public static final int LEFT_SHOOTER_MOTOR_PORT = 7;
    public static final int RIGHT_SHOOTER_MOTOR_PORT = 5;

    // Climber Motor Ports
    public static final int LEFT_CLIMBER_MOTOR_PORT = 41;
    public static final int RIGHT_CLIMBER_MOTOR_PORT = 42;

    // motor speeds
    public static final double INTAKE_SPEED = 0.5;

    //Climber Constants
    public static final double LEFT_CLIMBER_MOTOR_SPEED = 0.5;
    public static final double RIGHT_CLIMBER_MOTOR_SPEED = 0.5;
    public static final boolean LEFT_CLIMBER_MOTOR_INVERTED = false;
    public static final boolean RIGHT_CLIMBER_MOTOR_INVERTED = false;


    // Drivetrain Inversion
    public static final boolean LEFT_DRIVE_INVERSION = false;
    public static final boolean RIGHT_DRIVE_INVERSION = true;



    // Controller Information
    public static final GameController.Type DRIVER_CONTROLLER_TYPE = GameController.Type.PS4;
    public static final GameController.Type OPERATOR_CONTROLLER_TYPE = GameController.Type.PS4;
    
    //Shooter Constants
    public static final double SHOOTER_SPEED = 1;
    public static final boolean SHOOTER_LEFT_INVERTED = true;
    public static final boolean SHOOTER_RIGHT_INVERTED = true;

    //Transport Constants
    public static final double TRANSPORT_MOTOR_SPEED = 0.6;

}
