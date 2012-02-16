package com.edinarobotics.utils.threads;

import com.edinarobotics.utils.gui.RobotDataDisplay;
import com.edinarobotics.zephyr.Zephyr;

/**
 *
 * @author Danny
 */
public class ThreadManager {
    Zephyr robot;
    Thread robotThread;
    public ThreadManager(boolean modeToRun){
        robot = new Zephyr();
        robot.modeIsOperatorControl = modeToRun;
        robotThread = new Thread(robot);
        robot.continueRunning = true;
        robot.isEnabled = true;
    }
    public void start(RobotDataDisplay display){
        robot.display = display;
       robotThread.start();
       System.out.println("Started");
    }
    public void enable(){
        robot.isEnabled = !robot.isEnabled;
        System.out.println("Enabled");
    }
    public void disable(){
        robot.isEnabled = false;
    }
    public void stop(){
        robot.continueRunning = false;
    }
}
