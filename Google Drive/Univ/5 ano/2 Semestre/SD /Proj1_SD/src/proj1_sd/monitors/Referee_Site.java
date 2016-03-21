/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj1_sd.monitors;

import enums.RefereeState;
import proj1_sd.interfaces.IRefereeSiteCoach;
import proj1_sd.interfaces.IRefereeSiteContestant;
import proj1_sd.interfaces.IRefereeSiteReferee;

/**
 *
 * @author drcc
 */
public class Referee_Site implements IRefereeSiteCoach, IRefereeSiteContestant, IRefereeSiteReferee {

    private final StatusMonitor status; // main/status monitor declaration

    public Referee_Site(StatusMonitor status) {
        this.status = status;
    }

    /**
     * Announce New Game operation. The
     */
    public synchronized void announceNewGame() {
        status.setRefereeState(RefereeState.START_OF_A_GAME);
    }

    /**
     * Declare Game Winner operation. The
     */
    public synchronized void declareGameWinner() {
        status.setRefereeState(RefereeState.END_OF_A_GAME);

    }

    /**
     * Declare Match Winner operation. The
     */
    public synchronized void declareMatchWinner() {
        status.setRefereeState(RefereeState.END_OF_THE_MATCH);

    }
}
