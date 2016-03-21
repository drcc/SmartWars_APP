/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author drcc
 */
public enum RefereeState {
    
    /**
     * Referee... 
     */
    START_OF_THE_MATCH,
    
    /**
     * Referee ...
     */
    START_OF_A_GAME,
    
    /**
     * Referee ...
     */
    TEAMS_READY,
    
    /**
     * Referee ...
     */
    WAIT_FOR_TRIAL_CONCLUSION,
    
    /**
     * Referee ...
     */
    END_OF_A_GAME,
    
    /**
     * Referee ...
     */
    END_OF_THE_MATCH;
    
    /**
     * Returns an abbreviation of Referee states:
     *      <br>  SOTM - START_OF_THE_MATCH
     *      <br>  SOAG - START_OF_A_GAME
     *      <br>  TR - TEAMS_READY
     *      <br>  WFTC - WAIT_FOR_TRIAL_CONCLUSION
     *      <br>  EOAG - END_OF_A_GAME
     *      <br>  EOTM - END_OF_THE_MATCH
     * @return returns an abbreviation of Referee states
     */
    
    @Override
    public String toString()
    {
        switch(this)
        {
            case START_OF_THE_MATCH:
                return "SOTM";
            case START_OF_A_GAME:
                return "SOAG";
            case TEAMS_READY:
                return "TR";
            case WAIT_FOR_TRIAL_CONCLUSION:
                return "WFTC";
            case END_OF_A_GAME:
                return "EOAG";
            case END_OF_THE_MATCH:
                return "EOTM";
            default:
                return "";
        }
    }
}
