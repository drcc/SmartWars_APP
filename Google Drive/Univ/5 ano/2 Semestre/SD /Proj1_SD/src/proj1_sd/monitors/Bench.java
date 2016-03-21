package proj1_sd.monitors;

import enums.CoachState;
import enums.ContestantState;
import enums.RefereeState;
import proj1_sd.interfaces.IBenchCoach;
import proj1_sd.interfaces.IBenchContestant;
import proj1_sd.interfaces.IBenchReferee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drcc
 */
public class Bench implements IBenchCoach,IBenchContestant,IBenchReferee {
    
    private final StatusMonitor status; // main/status monitor declaration
    
    public Bench(StatusMonitor status)
    {
        this.status = status;
    }
    
    
    // ------------------- Coach --------------------
    
    /**
    * Call Contestants operation.
    * The coach to contestants
    */
    public synchronized void callContestants(int coachId) 
    {
        status.setCoachState(coachId,CoachState.ASSEMBLE_TEAM);

    }
    
    /**
    * Review Notes operation.
    * The Coach
    */
    public synchronized void reviewNotes(int coachId) 
    {
    	status.setCoachState(coachId,CoachState.WAIT_FOR_REFEREE_COMMAND);
    }
    
    
    // ------------------- Contestants --------------------
    /**
    * Follow Coach Advice operation.
    * The Last contestant to Coach
    */
    public synchronized void followCoachAdvice(int contestantId) 
    {
    	status.setContestantState(contestantId, ContestantState.STAND_IN_POSITION);
    }
    
    
  /**
    * Seat Down operation.
    * The Contestants
    */
    public synchronized void seatDown(int contestantId) 
    {
    	status.setContestantState(contestantId, ContestantState.SEAT_AT_THE_BENCH);
    }
    
    
   
    
    // ------------------- Referee --------------------
    
    
    
    /**
    * Call Trial operation.
    * The referee to last coach
    */
    public synchronized void callTrial() 
    {
    	status.setRefereeState(RefereeState.TEAMS_READY);
    }
    
   
}



