/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj1_sd.interfaces;

/**
 *
 * @author drcc
 */
public interface IBenchContestant {
    
    /**
    * The Contestant
    * @param ContestantId ID of the Contestant for the task
    */
    public void followCoachAdvice(int ContestantId);
    
    
    /**
    * The Contestant
    * @param ContestantId ID of the Contestant for the task
    */
    public void seatDown(int ContestantId);
}
