package calendarmanager;

import calendar.api.CalendarEvent;
import calendar.api.Displayable;
import java.util.ArrayList;

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

        // populate the events ArrayList here...
        events.add(CalendarEventFactory.makeAirShowEvent());
        events.add(CalendarEventFactory.makeBeerEvent());
        events.add(CalendarEventFactory.makeConcertEvent());
        events.add(CalendarEventFactory.makeFieraEvent());

        System.out.println("List of my events:");

        events.forEach(e -> System.out.println(e.getTitle() + " " + e.getDescription()));

        ArrayList<Displayable> dispEvents = new ArrayList<>();
        events.forEach(c -> dispEvents.add(c));

        CalendarEventsDisplayTable.display(dispEvents);

//        events.forEach(e -> {
//            try {
//                e.getLocation();
//            } catch (CalendarEventException ex) {
//                Logger.getLogger(CalendarManager.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        });
    }
}
