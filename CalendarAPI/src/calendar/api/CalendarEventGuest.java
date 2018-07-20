/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar.api;

/**
 * Generic guest for an event. 
 * According to the kind of event, a guest may be a physical person, or an
 * exhibitor, or whatever
 * @author claudio
 */
public interface CalendarEventGuest extends Displayable {
    public String getName();

    /**
     * An almost-unique identifier for this guest.
     * The Id should be a string 
     * @return the Id string
     */
    public CalendarEventId getId();
    public String getRole() throws CalendarEventException;

    public static class CalendarEventId {
        private String id;
        public CalendarEventId() {
        }
    }
}
