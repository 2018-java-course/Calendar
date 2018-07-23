/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendarmanager;

import calendar.api.Displayable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author claudio
 */
public class CalendarEventsDisplayTable {

    static void display(ArrayList<Displayable> items) {
        if ((items != null) && (items.size() > 0)) {
            Comparator<Displayable> cmpTitleLength = (d1, d2) -> d2.getTitle().length() - d1.getTitle().length();
            Comparator<Displayable> cmpDescLength = (d1, d2) -> d2.getDescription().length() - d1.getDescription().length();

            Collections.sort(items, cmpTitleLength);
            int maxTitleLen = items.get(0).getTitle().length();

            Collections.sort(items, cmpDescLength);
            int maxDescLen = items.get(0).getDescription().length();

            int totalLen = maxTitleLen + maxDescLen + 3; // 3 pipes: |----|-------|

            // Create divisor
            String divisor;
            StringBuilder stringBuilder = new StringBuilder(totalLen);
            stringBuilder.append("|");
            for (int i = 0; i < maxTitleLen; i++) {
                stringBuilder.append("-");
            }
            stringBuilder.append("|");
            for (int i = 0; i < maxDescLen; i++) {
                stringBuilder.append("-");
            }
            stringBuilder.append("|");
            divisor = stringBuilder.toString();

            // Heading line
            stringBuilder = new StringBuilder(totalLen);
            String title = "Title";
            stringBuilder.append("|");
            stringBuilder.append(title);
            padding(stringBuilder, maxTitleLen - title.length());

            String desc = "Description";
            stringBuilder.append("|");
            stringBuilder.append(desc);
            padding(stringBuilder, maxDescLen - desc.length());
            stringBuilder.append("|");
            String heading = stringBuilder.toString();

            // Print full heding
            System.out.println(divisor);
            System.out.println(heading);
            System.out.println(divisor);

            for (Displayable item : items) {
                if (item != null) {
                    stringBuilder = new StringBuilder(totalLen);
                    stringBuilder.append("|");
                    stringBuilder.append(item.getTitle());
                    padding(stringBuilder, maxTitleLen - item.getTitle().length());
                    stringBuilder.append("|");
                    stringBuilder.append(item.getDescription());
                    padding(stringBuilder, maxDescLen - item.getDescription().length());
                    stringBuilder.append("|");
                    System.out.println(stringBuilder);
                }
            }
            System.out.println(divisor);
        }
    }

    static void padding(StringBuilder stringBuilder, int n) {
        for (int i = 0; i < n; i++) {
            stringBuilder.append(" ");
        }
    }

}
