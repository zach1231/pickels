/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.Move;

/**
 * Add your docs here.
 */
public class Drive extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public static MecanumDrive drive = new MecanumDrive(RobotMap.LFMotor, RobotMap.LBMotor, RobotMap.RFMotor, RobotMap.RBMotor); 
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new Move());
  
  
  }
  public void normalDrive(){
    drive.driveCartesian(Robot.oi.xbox.getRawAxis(1) / 2,Robot.oi.xbox.getRawAxis(0) / 2,Robot.oi.xbox.getRawAxis(4));
  }
    public void fastDrive(){
      drive.driveCartesian(Robot.oi.xbox.getRawAxis(1),Robot.oi.xbox.getRawAxis(0),Robot.oi.xbox.getRawAxis(4));
    }
  }
