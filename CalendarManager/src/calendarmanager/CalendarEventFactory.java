/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendarmanager;

import airshow.AirShow;
import airshow.AirShowCategory;
import airshow.util.AirShowDatabase;
import calendar.api.CalendarEvent;
import com.beer.BeerEvent;
import com.beer.utils.BeerEventManager;
import concerts.Concert;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author claudio
 */
public class CalendarEventFactory {

    private CalendarEventFactory() {
    }

    static CalendarEvent makeBeerEvent() {
        return new BeerEvent.Builder()
                .setTitle("Oktober Fest")
                .setDescription("A wonderful fest")
                .setStartDate(LocalDate.now())
                .build();
    }

    static CalendarEvent makeAirShowEvent() {
        return new AirShow.Builder()
                .setName("Festa dei piloti")
                .setStartDate(LocalDate.of(2018, 6, 29))
                .build()
                .setCategory(AirShowCategory.FUN);
    }

    static CalendarEvent makeFieraEvent() {
//        return new Fiera.Builder()
//                .setNomeEvento("Comics")
//                .setLuogoEvento("Rome")
//                .build();
        return null;
    }

    static CalendarEvent makeConcertEvent() {
        return new Concert.Builder()
                .setLuogo("New York")
                .setNomeConcerto("Latte e i suoi derivati")
                .build();
    }

    static void populate(ArrayList<CalendarEvent> lotsOfevents) {
        new AirShowDatabase().populate(lotsOfevents);
        new concerts.Populator().populate(lotsOfevents);
        new BeerEventManager().populate(lotsOfevents);
        // fifa
        // fiera

    }

}
