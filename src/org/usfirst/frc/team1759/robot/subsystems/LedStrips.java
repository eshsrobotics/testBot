package org.usfirst.frc.team1759.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc.team1759.robot.RobotMap;
import org.usfirst.frc.team1759.robot.OI;

/**
 *
 */
public class LedStrips extends Subsystem {
	PWM ledStrip;
	RobotMap robotMap;
	OI oi;
	
	int stripPort;
	double joy;
	double output;
	
	public LedStrips(int stripPort) {
		this.stripPort = stripPort;
	}

	public void initDefaultCommand() {
		robotMap = new RobotMap();
		oi = new OI();
		ledStrip = new PWM(stripPort);
	}
	
	public void blinkyBlinky(double joy) {
		this.joy = joy;
		output = 127.5 * (joy + 1.0);
		ledStrip.setRaw((int) output);
	}
}