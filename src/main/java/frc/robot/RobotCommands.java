package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandGroupBase;
import edu.wpi.first.wpilibj2.command.Command;
import org.team555.frc.command.commandrobot.*;

import frc.robot.subsystems.*;

import static frc.robot.Robot.*;
import static org.team555.frc.command.Commands.*;
import static edu.wpi.first.wpilibj2.command.CommandGroupBase.*;


public class RobotCommands {
    
    public static Command driveForTime(double speed, double time) {
        return sequence(
                instant(() -> {
                    drivetrain.set(speed, 0);
                }),
            runForTime(time, block(drivetrain)),
            instant(() -> {
                drivetrain.stop();
            })
        );
    }

    public static Command shootSequence() {
        return sequence (
            
        );
    }
}