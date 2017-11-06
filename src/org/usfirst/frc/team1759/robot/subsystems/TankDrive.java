package org.usfirst.frc.team1759.robot.subsystems;

import org.usfirst.frc.team1759.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

import com.ctre.CANTalon; 

/**
 * @author Aidan Galbreath. This controller the tank drive on the test bot.
 */

public class TankDrive extends Subsystem {
	RobotDrive myRobot;
	RobotMap robotMap;
	SpeedController bottomRight;
	SpeedController topRight;
	SpeedController bottomLeft;
	SpeedController topLeft;
	
	public TankDrive(SpeedController topLeft, SpeedController bottomLeft, SpeedController topRight, SpeedController bottomRight) {
		this.bottomLeft = bottomLeft;
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
		this.topRight = topRight;
	}
	
	public void initDefaultCommand() {
		robotMap = new RobotMap();
		myRobot = new RobotDrive(topLeft, bottomLeft, topRight, bottomRight);
	}
	
	public void tankDrive(double leftJoy, double rightJoy) {
		myRobot.tankDrive(leftJoy, rightJoy);
	}
}
