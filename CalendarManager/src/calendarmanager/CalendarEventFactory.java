/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendarmanager;

import FieraDelFumetto.Fiera;
import airshow.AirShow;
import airshow.AirShowCategory;
import calendar.api.CalendarEvent;
import com.beer.BeerEvent;
import concerts.Concert;
import java.time.LocalDate;

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
        return new Fiera("Comics", "Rome");
    }

    static CalendarEvent makeConcertEvent() {
        return new Concert.Builder().build();
    }

}
