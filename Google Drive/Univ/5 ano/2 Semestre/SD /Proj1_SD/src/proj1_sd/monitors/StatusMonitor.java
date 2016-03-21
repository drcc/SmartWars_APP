/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj1_sd.monitors;

import enums.CoachState;
import enums.ContestantState;
import enums.RefereeState;

import java.util.HashMap;

/**
 *
 * @author drcc
 */
public class StatusMonitor {

    /*Entities*/
	private HashMap<Integer, Coach> coach;
	private HashMap<Integer, Contestant> contestant;
	private Referee referee;
	
	/*Entities states*/
	private final HashMap<Integer, ContestantState> contestantState;
	private final HashMap<Integer, CoachState> coachState;
	private RefereeState refereeState;

	/*Monitors objects*/
	private Bench bench;
	private Playground playground;
        private Referee_Site referee_site;
        
    public StatusMonitor() {
        this.coachState = new HashMap<>();
        this.contestantState = new HashMap<>();
    }

    /**
     * Checks the state of a coach
     *
     * @param coachId coach identification number
     * @return the state of the coach specified
     */
    public CoachState getCoachState(int coachId) {
        return coachState.get(coachId);
    }

    /**
     * Sets the state of a coach
     *
     * @param coachId coach identification number
     * @param state the state of the coach specified
     */
    public void setCoachState(int coachId, CoachState state) {
        coachState.put(coachId, state);
    }

    /**
     * Checks the state of a contestant
     *
     * @param contestantId contestant identification number
     * @return the state of the contestant specified
     */
    public ContestantState getContestantState(int contestantId) {
        return contestantState.get(contestantId);
    }

   
    /**
     * Sets the state of a contestant
     *
     * @param contestantId contestant identification number
     * @param state the state of the contestant specified
     */
    public void setContestantState(int contestantId, ContestantState state) {
        contestantState.put(contestantId, state);
    }

    
     /**
     * Sets the state of a referee
     *
     * @param state the state of the referee specified
     */
    public void setRefereeState(RefereeState state) {
        refereeState = state;
    }

     /**
     * Checks the state of a referee
     *
     * @return the state of the referee specified
     */
    public RefereeState getRefereeState() {
        return refereeState;
    }
    
}
