/**
 * @author Emad Abulebda, emadabulebda@gmail.com
 */
package com.stir.cscu9t4practical1;

public class SwimEntry extends Entry {
    private String where;

    public SwimEntry(String name, int day, int month, int year, int hour, int minute, int second, float distance, String where) {
        super(name, day, month, year, hour, minute, second, distance);
        this.where = where;
    }//constructor

    public String getWhere() {
        return where;
    }

    //Overriding getEntry method
    @Override
    public String getEntry() {
        return getName() + " swam " + getDistance() + " km in an " + getWhere() + " pool in"
                + getHour() + ":" + getMin() + ":" + getSec() + " on "
                + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
    }
}
