/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.edinarobotics.zephyr;


import com.edinarobotics.utils.autonomous.AutonomousManager;
import com.edinarobotics.utils.autonomous.AutonomousStep;
import com.edinarobotics.utils.gui.RobotDataDisplay;
import com.edinarobotics.zephyr.autonomous.IdleStopStep;
import com.edinarobotics.utils.gui.StartUp;
import com.edinarobotics.utils.threads.RobotThread;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Zephyr implements RobotThread{
    //Driving Variables
    public double leftDrive = 0;
    public double rightDrive = 0;
   
    //Shooter Variables
    public double shooterSpeed = 0;
    public boolean ballLoaderUp = false;
    public double shooterRotateSpeed = 0;
    private final double SHOOTER_SPEED_STEP = 0.0005;
    private double lastManualSpeed = 0;
    
     //Collector Variables
     public int collectorLift = 0;
     public boolean collectorSpin = false;
     public boolean convMove = false;
     public boolean shifters = false;
     //Gui Variables
     public boolean isEnabled = true;
     public boolean isAutonomous;
     public boolean isOperatorControl;
     public RobotDataDisplay display;
     public boolean modeIsOperatorControl;
     public boolean continueRunning;
    
    public void run(){
        while(continueRunning){
            if(isEnabled){
                if(modeIsOperatorControl){
                    operatorControl();
                }
                else{
                    autonomous();
                }
                 try{
                    Thread.sleep(1);
                }
                catch(Exception e){
                    System.err.println(e);
                }
            }
            else{
                try{
                    Thread.sleep(1);
                }
                catch(Exception e){
                    System.err.println(e);
                }
            }
        }
    }
    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    public void autonomous() {
        AutonomousStep[] steps = new AutonomousStep[1];
        steps[0] = new IdleStopStep(this);
        AutonomousManager manager = new AutonomousManager(steps, this);
        manager.start();
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    
    public void operatorControl() 
    {
        System.out.println("Teleop");
        mechanismSet();
    }
    
    
    /**
     * Updates all parts of the robot to avoid safety timeouts
     */
    public void mechanismSet(){
        display.setLeftSpeed(Double.toString(leftDrive));
        display.setRightSpeed(Double.toString(rightDrive));
        display.setShooterSpeed(Double.toString(shooterSpeed));
        display.setShooterRotation(Double.toString(shooterRotateSpeed));
        display.setShooterPiston(Boolean.toString(convMove));
        display.setCollectorSpin(Boolean.toString(collectorSpin));
        display.setCollectorConveyorField(Boolean.toString(convMove));
        display.setCollectorLift(Integer.toString(collectorLift));
    }
    
    /**
     * Stop the robot from moving
     */
    public void stop(){
        leftDrive = 0;
        rightDrive = 0;
        shooterSpeed = 0;
        ballLoaderUp = false;
        mechanismSet();
    }
    
    public static void main(String[] args){
        StartUp startUpFrame = new StartUp();
        startUpFrame.setVisible(true);
    }
}
