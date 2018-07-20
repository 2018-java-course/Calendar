/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar.api;

import java.time.LocalDate;

/**
 * An event that can be added to a Calendar. Classes that implement this
 * interfaces can be added to the list of event of Calendar class
 *
 * @author claudio
 */
public interface CalendarEvent extends Displayable {

    @Override
    public String getTitle();

    public LocalDate getStartDate();

    public LocalDate getEndDate();

    public String getCategory();

    public String getLocation() throws CalendarEventException;

}
