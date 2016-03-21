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
public interface IPlaygroundReferee {
    
    /**
    * The Referee
    * @param RefereeId ID of the Referee for the task
    */
    public void startTrial(int RefereeId);
    
    
    /**
    * The Referee
    * @param RefereeId ID of the Referee for the task
    */
    public void assertTrialDecision(int RefereeId);
    
    
}
