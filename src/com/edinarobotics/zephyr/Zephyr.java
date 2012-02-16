/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.edinarobotics.zephyr;


import com.edinarobotics.utils.autonomous.AutonomousManager;
import com.edinarobotics.utils.autonomous.AutonomousStep;
import com.edinarobotics.zephyr.autonomous.IdleStopStep;
import com.edinarobotics.utils.helperClasses.ToggleHelper;
import com.edinarobotics.utils.gui.StartUp;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Zephyr {
    //Driving Variables
    public double leftDrive = 0;
    public double rightDrive = 0;
    private final double ONE_STICK_MULTIPLIER = 0.5;
   
    //Shooter Variables
    public double shooterSpeed = 0;
    public boolean ballLoaderUp = false;
    public double shooterRotateSpeed = 0;
    private final double SHOOTER_SPEED_STEP = 0.0005;
    private double lastManualSpeed = 0;
    
     //Camera Variables
     public double cameraSetX;
     public double cameraSetY;
     private double CAMERA_STEP = .005;
     //Collector Variables
     public int collectorLift = 0;
     public boolean collectorSpin = false;
     public boolean convMove = false;
     public boolean shifters = false;
     //Gui Variables
     public boolean isEnabled;
     public boolean isAutonomous;
     public boolean isOperatorControl;
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
    /*
    public void operatorControl() 
    {
        
        
        // Initiate components
        ToggleHelper button3 = new ToggleHelper();
        while(isOperatorControl&&isEnabled)
        {*/
           //************GAMEPAD 1****************************************//
           // Set values for the drive speeds of the robot
           //Using 0.9 as comparison value to avoid floating point problems
           //Shouldn't ever be an issue but just in case
           /*
           if(Math.abs(driveGamepad.getDPadY())<=0.9){
               //Normal joystick drive. D-pad is not 1 or -1
               // Filter the joysticks on the gamepads according to the filters
               // initialized
               GamepadResult joystick = filters.filter(driveGamepad.getJoysticks());
               leftDrive = joystick.getLeftY();
               rightDrive = joystick.getRightY();
           }
           else{
               //Single direction, forward/backward drive with the d-pad.
               double oneStickDriveValue = driveGamepad.getDPadY() * ONE_STICK_MULTIPLIER;
               leftDrive = oneStickDriveValue;
               rightDrive = oneStickDriveValue;
           }
           
           if(driveGamepad.getRawButton(Gamepad.RIGHT_BUMPER))
           {
               collectorLift = 1;
           }
           else if(driveGamepad.getRawButton(Gamepad.RIGHT_TRIGGER))
           {
               collectorLift = -1;
           }
           else{
               collectorLift = 0;
           }
           if(driveGamepad.getRawButton(Gamepad.LEFT_TRIGGER))
           {
               collectorSpin = true;
           }
           else{
               collectorSpin = false;
           }
            if(driveGamepad.getRawButton(Gamepad.LEFT_BUMPER))
           {
               convMove = true;
           }
           else{
               convMove = false;
           }
           if(button3.isToggled(driveGamepad.getRawButton(Gamepad.BUTTON_3)))
           {
               shifters = !shifters;
           }*/
           //******************GAMEPAD 2*********************************//
           // If the right bumper on the shootGamepad is pushed, speed up the
           // shooter
            /*
           if(shootGamepad.getRawButton(Gamepad.RIGHT_BUMPER))
           {
               //Step speed of shooter up.
               shooterSpeed += SHOOTER_SPEED_STEP;
               
               // Limit the speed of the shooter to not exceed -1
               if(shooterSpeed >= 1)
               {
                   shooterSpeed = 1;
               }
               
               // Store the speed of the shooter to a second variable
               lastManualSpeed = shooterSpeed;
           }
           
           // If the left bumper on the shootGamepad is pushed, slow down the
           // shooter
           else if(shootGamepad.getRawButton(Gamepad.RIGHT_TRIGGER))
           {
               //Step speed of shooter down.
               shooterSpeed -= SHOOTER_SPEED_STEP;
               
               // Limit the speed of the shooter to not go past 0
               if(shooterSpeed<=0)
               {
                   shooterSpeed = 0;
               }
               
               // Store the speed of the shooter to a second variable
               lastManualSpeed = shooterSpeed;
           }
           
           // Jump shooter speed to max if button 1 on the shootGamepad is
           // pushed
           if(shootGamepad.getRawButton(Gamepad.BUTTON_1))
           {
               // Max is 1
               shooterSpeed = 1;
           }
           // Jump shooter speed to 50% if button 3 on the shootGamepad is
           // pushed
           else if(shootGamepad.getRawButton(Gamepad.BUTTON_3)){
               shooterSpeed = 0.5;
           }
           // Jump shooter speed to the min if button 3 on the shootGamepad is
           // pushed
           else if(shootGamepad.getRawButton(Gamepad.BUTTON_2))
           {
               // Min is 0
               shooterSpeed = 0;
           }
           
           shooterRotateSpeed = filters.filter(shootGamepad.getJoysticks()).getRightX();
           
           // Set the camera servo positions
           cameraSetY = components.cameraServoVertical.get() + shootGamepad.getDPadY() * CAMERA_STEP;
           ballLoaderUp = shootGamepad.getRawButton(Gamepad.LEFT_TRIGGER) || 
                          shootGamepad.getRawButton(Gamepad.LEFT_BUMPER);
           mechanismSet();
        }
    }
    */
    /**
     * Updates all parts of the robot to avoid safety timeouts
     */
    public void mechanismSet(){
        
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
