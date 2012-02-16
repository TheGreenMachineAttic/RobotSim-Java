package com.edinarobotics.utils.threads;

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
    }
    public void start(){
       robotThread.start();
    }
    public void enable(){
        robot.isEnabled = true;
    }
    public void disable(){
        robot.isEnabled = false;
    }
    public void stop(){
        robot.continueRunning = false;
    }
}
