/**
 * @author Emad Abulebda, emadabulebda@gmail.com
 */
package com.stir.cscu9t4practical1;

public class CycleEntry extends Entry {
    private String terrain;
    private String tempo;

    public CycleEntry(String name, int day, int month, int year, int hour, int minute, int second, float distance, String terrain, String tempo) {
        super(name, day, month, year, hour, minute, second, distance);
        this.terrain = terrain;
        this.tempo = tempo;
    }

    public String getTerrain() {
        return terrain;
    }

    public String getTempo() {
        return tempo;
    }

    //Overriding getEntry method
    @Override
    public String getEntry() {
        return getName() + " cycled " + getDistance() + " km on the " + getTerrain() + " terrain at tempo of " + getTempo() + " in"
                + getHour() + ":" + getMin() + ":" + getSec() + " on "
                + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
    }
}
