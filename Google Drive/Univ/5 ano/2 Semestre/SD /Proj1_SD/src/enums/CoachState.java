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
public enum CoachState {
    
    /**
     * Coach 
     */
    WAIT_FOR_REFEREE_COMMAND,
    
    /**
     * Coach ...
     */
    ASSEMBLE_TEAM,
    
    /**
     * Coach ...
     */
    WATCH_TRIAL;
    
    
    /**
     * Returns an abbreviation of coach states:
     *      <br>  WFRC - WAIT_FOR_REFEREE_COMMAND
     *      <br>  AT - ASSEMBLE_TEAM
     *      <br>  WT - WATCH_TRIAL
     * @return returns an abbreviation of coach states
     */
    
    @Override
    public String toString()
    {
        switch(this)
        {
            case WAIT_FOR_REFEREE_COMMAND:
                return "WFRC";
            case ASSEMBLE_TEAM:
                return "AT";
            case WATCH_TRIAL:
                return "WT";
            default:
                return "";
        }
    }
}
