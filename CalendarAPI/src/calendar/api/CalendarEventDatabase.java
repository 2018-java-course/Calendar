/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar.api;

import java.util.ArrayList;

/**
 *
 * @author claudio
 */
public interface CalendarEventDatabase {
    /**
     * Utility method to quickly populate an array of events. 
     * This method is needed to help the calendar manager to create an array of 
     * events of a specific subclass of CalendarEvent.
     * @param arrayToPopulate the array to be populated
     */
    public void populate(ArrayList<CalendarEvent> arrayToPopulate);
}
