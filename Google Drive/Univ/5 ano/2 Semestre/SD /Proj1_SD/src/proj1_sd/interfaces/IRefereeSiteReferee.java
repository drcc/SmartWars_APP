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
public interface IRefereeSiteReferee {
    
       /**
    * The Referee
    * @param RefereeId ID of the Referee for the task
    */
    public void annouceNewGame(int RefereeId);
    
    /**
    * The Referee
    * @param RefereeId ID of the Referee for the task
    */
    public void declareGameWinner(int RefereeId);
    
    /**
    * The Referee
    * @param RefereeId ID of the Referee for the task
    */
    public void declareMatchWinner(int RefereeId);
}
