/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendarmanager;

import calendar.api.CalendarEvent;
import airshow.util.AirShowDatabase;
import calendar.api.CalendarEventException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author claudio
 */
public class CalendarManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<CalendarEvent> events = new ArrayList();
        new AirShowDatabase().populate(events);
        events.forEach(e -> System.out.println(e.getTitle()));

        events.forEach(e -> {
            try {
                e.getLocation();
            } catch (CalendarEventException ex) {
                Logger.getLogger(CalendarManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
}
