package utils;

import java.util.Calendar;
import java.util.TimeZone;

public class Utilidades {

    //Get The Current Day
    public static int getCurrentDay() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    //Get The Current Day
    public static String getCurrentMonth() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int monthInt = calendar.get(Calendar.MONTH);
        return Integer.toString(monthInt);
    }
}
