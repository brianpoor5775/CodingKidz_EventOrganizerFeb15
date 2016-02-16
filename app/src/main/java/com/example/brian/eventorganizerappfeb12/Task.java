package com.example.brian.eventorganizerappfeb12;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Brian on 2/14/16.
 */
public class Task {
    // Time Format
    DateFormat timeFormat = new SimpleDateFormat("h:mm a");

    // AMPM Enum
    private enum AMPM {
        AM, PM
    }

    // Instance Variables
    private Date date;
    private String time;
    private String category;

    // Constructors
    public Task (int year, int month, int day, int hours, int minutes, AMPM ampm,  String category) {
        if (ampm.equals(AMPM.PM))
            hours += 12;
        this.date = new Date(year, month, day, hours, minutes);
        this.time = timeFormat.format(this.date);
        this.category = category;
    }

    //Methods
    public String getTime() {
        return time;
    }
    public Date getDate(){
        return date;
    }
    public String getCategory(){
        return category;
    }
    public String toString() {
        return getTime() + " " + getCategory();
    }


}
