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
public interface IBenchCoach {
    
    /**
    * The Coach
    * @param CoachId ID of the Coach for the task
    */
    public void callContestants(int CoachId);
    
    /**
    * The Coach
    * @param CoachId ID of the Coach for the task
    */
    public void reviewNotes(int CoachId);
}
