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
public enum ContestantState {
   
    
    /**
     * contestant 
     */
    SEAT_AT_THE_BENCH,
    
    /**
     * contestant ...
     */
    STAND_IN_POSITION,
    
    /**
     * contestant ...
     */
    DO_YOUR_BEST;
    
    
    /**
     * Returns an abbreviation of contestant states:
     *      <br>  SATB - SEAT_AT_THE_BENCH
     *      <br>  SIP - STAND_IN_POSITION
     *      <br>  DYB - DO_YOUR_BEST
     * @return returns an abbreviation of contestant states
     */
    
    @Override
    public String toString()
    {
        switch(this)
        {
            case SEAT_AT_THE_BENCH:
                return "SATB";
            case STAND_IN_POSITION:
                return "SIP";
            case DO_YOUR_BEST:
                return "DYB";
            default:
                return "";
        }
    }
}
