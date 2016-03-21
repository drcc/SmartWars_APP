/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj1_sd.monitors;

import enums.CoachState;
import enums.ContestantState;
import enums.RefereeState;
import proj1_sd.interfaces.IPlaygroundCoach;
import proj1_sd.interfaces.IPlaygroundContestant;
import proj1_sd.interfaces.IPlaygroundReferee;

/**
 *
 * @author drcc
 */
public class Playground implements IPlaygroundCoach, IPlaygroundContestant, IPlaygroundReferee {

    private final StatusMonitor status; // main/status monitor declaration

    public Playground(StatusMonitor status) {
        this.status = status;
    }

    /**
     * Inform the referee operation. The coach to referee
     */
    public synchronized void informReferee(int coachId) {
        status.setCoachState(coachId, CoachState.WATCH_TRIAL);
    }

    /**
     * Get Ready operation. The Referee to last contestant
     */
    public synchronized void getReady(int contestantId) {
        status.setContestantState(contestantId, ContestantState.DO_YOUR_BEST);
    }

    /**
     * Pull The Rope operation. The
     */
    public synchronized void pullTheRope(int contestantId) {
        status.setContestantState(contestantId, ContestantState.DO_YOUR_BEST);

    }

    /**
     * Am Done operation. The last contestant to referee
     */
    public synchronized void amDone(int contestantId) {
        status.setContestantState(contestantId, ContestantState.DO_YOUR_BEST);

    }

    /**
     * Start trial operation. The referee to last contestant
     */
    public synchronized void startTrial() {
        status.setRefereeState(RefereeState.WAIT_FOR_TRIAL_CONCLUSION);
    }

    /**
     * Assert Trial Decision operation. The referee to coach
     */
    public synchronized void assertTrialDecision() {
        status.setRefereeState(RefereeState.WAIT_FOR_TRIAL_CONCLUSION);

    }

}
