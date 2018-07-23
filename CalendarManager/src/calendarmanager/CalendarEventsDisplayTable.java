/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendarmanager;

import calendar.api.Displayable;
import java.util.ArrayList;

/**
 *
 * @author claudio
 */
public class CalendarEventsDisplayTable {

    static void display(ArrayList<Displayable> items) {
        if ((items != null) && (items.size() > 0)) {

            int totalLineWidth = 80;
//            int totalTextWidth = totalLineWidth - 2; // 2 pipes: |-----------|

            // Create divisor
            StringBuilder stringBuilder = new StringBuilder(totalLineWidth);
//            stringBuilder.append("|");
            for (int i = 0; i < totalLineWidth; i++) {
                stringBuilder.append("-");
            }
//            stringBuilder.append("|");
            String divisor = stringBuilder.toString();

            // Heading
            String title = "Title: ";

            for (Displayable item : items) {
                if (item != null) {
                    System.out.println("");
                    System.out.println(divisor);
                    // Title line
                    stringBuilder = new StringBuilder(totalLineWidth);
                    stringBuilder.append(title);
                    stringBuilder.append(item.getTitle());
//                    padding(stringBuilder, totalTextWidth - stringBuilder.length() + 1);
                    System.out.println(stringBuilder);
                    System.out.println(divisor);
                    System.out.println(item.getDescription().trim());

                }
            }

        }
    }

//    static void padding(StringBuilder stringBuilder, int n) {
//        for (int i = 0; i < n; i++) {
//            stringBuilder.append(" ");
//        }
//    }
}
