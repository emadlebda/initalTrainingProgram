/**
 * @author Emad Abulebda, emadabulebda@gmail.com
 */
package com.stir.cscu9t4practical1;

import java.util.Calendar;

public class Entry {
    private String name;
    private Calendar dateAndTime;
    private float distance;


    //constructor
    public Entry() {
        this.name = null;
        this.distance = 0.0f;
        dateAndTime = null;
    }

    public Entry(String name, int day, int month, int year, int hour, int minute, int second, float distance) {
        this.name = name;
        this.distance = distance;
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hour, minute, second);
        dateAndTime = calendar;
    } //constructor

    public String getName() {
        return name;
    } //getName

    public int getDay() {
        return dateAndTime.get(Calendar.DATE);
    } //getDay

    public int getMonth() {
        return dateAndTime.get(Calendar.MONTH) + 1;
    } //getMonth

    public int getYear() {
        return dateAndTime.get(Calendar.YEAR);
    } //getYear

    public int getHour() {
        return dateAndTime.get(Calendar.HOUR);
    } //getHour

    public int getMin() {
        return dateAndTime.get(Calendar.MINUTE);
    } //getMin

    public int getSec() {
        return dateAndTime.get(Calendar.SECOND);
    } //getSec

    public float getDistance() {
        return distance;
    } //getYear


    public String getEntry() {
        return getName() + " ran " + getDistance() + " km in "
                + getHour() + ":" + getMin() + ":" + getSec() + " on "
                + getDay() + "/" + getMonth() + "/" + getYear() + "\n";

    } //getEntry

} // Entry