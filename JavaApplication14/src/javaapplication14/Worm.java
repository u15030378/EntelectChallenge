/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author dewal
 */
public class Worm {
    char wormType, taskStarted;
    int motivation, consecShift, consecNight, consecFree, consecOff;
    boolean needForWeekend, employed;
    
    Worm(char _wormType)
    {
        wormType=_wormType;
        taskStarted='N';
        motivation=15;
        consecShift=0;
        consecNight=0;
        consecFree=0;
        consecOff=0;
        needForWeekend=false;
        employed=true;
    }
    
    
}
