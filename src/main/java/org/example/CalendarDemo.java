package org.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        System.out.println(sdf.format(calendar.getTime()));
//        System.out.println(date.toString());
        calendar.get(Calendar.DAY_OF_MONTH);
    }
}
