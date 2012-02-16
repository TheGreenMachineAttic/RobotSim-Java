/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edinarobotics.utils.threads;

/**
 *
 * @author Danny
 */
public interface RobotThread extends Runnable{
    public void autonomous();
    public void operatorControl();
}
