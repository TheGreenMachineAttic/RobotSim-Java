/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edinarobotics.zephyr.autonomous;

import com.edinarobotics.utils.autonomous.AutonomousStep;
import com.edinarobotics.zephyr.Zephyr;

/**
 *
 * @author Danny
 */
public class DriveStep extends AutonomousStep{
    Zephyr robot;
    
    public DriveStep(Zephyr robot)
    {
        this.robot = robot;
    }
    
   public void start()
   {
       robot.leftDrive = .5;
       robot.rightDrive = .5;
       for(int x = 0; x<1000; x++)
       {
           robot.mechanismSet();
           try{
               Thread.sleep(1);
           }
           catch(Exception e){
               System.err.print(e);
           }
           
       }
   }
   public boolean isFinished()
   {
       return true;
   }
   public void stop()
   {
       robot.stop();
   }
    
}
