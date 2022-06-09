package java12.newfeatures;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class PreviewChangesTest {

    // Example 1
    // 0ld syntax Switch
    @Test
    public void oldSwitchStyle() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        String typeOfDay = "";
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                typeOfDay = "Working Day";
                break;
            case SATURDAY:
            case SUNDAY:
                typeOfDay = "Day Off";
        }
    }

    // Example 2
    // New syntax Switch
    @Test
    public void newSwitchStyle() {
        int number = 1;
//        String result = switch (number) {
//            case 1, 2 -> "one or two";
//            case 3 -> "three";
//            case 4, 5, 6 -> "four or five or six";
//            default -> "unknown";
//        };
    }

    // Example 3
    // Pattern Matching for instanceof
    @Test
    public void patternMatchingForInstanceof() {
//        // old
//        Object obj = "Hello World!";
//        if (obj instanceof String s) {
//            String s = (String) obj;
//            int length = s.length();
//        }
//        // new java 12
//        Object obj1 = "Hello World!";
//        if (obj1 instanceof String s) {
//            int length = s.length();
//        }
    }
}
