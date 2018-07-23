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

        ArrayList<CalendarEvent> lotsOfevents = new ArrayList<>();
        CalendarEventFactory.populate(lotsOfevents);

        ArrayList<Displayable> dispEvents = new ArrayList<>();
        lotsOfevents.forEach(c -> {
            if (c != null) {
                dispEvents.add(c);
            }
        });

        CalendarEventsDisplayTable.display(dispEvents);

    }
}
