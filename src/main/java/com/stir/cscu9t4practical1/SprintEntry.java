/**
 * @author Emad Abulebda, emadabulebda@gmail.com
 */
package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {
    private int repetitions;
    private int recovery;

    public SprintEntry(String name, int day, int month, int year, int hour, int minute, int second, float distance, int repetitions, int recovery) {
        super(name, day, month, year, hour, minute, second, distance);
        this.repetitions = repetitions;
        this.recovery = recovery;
    }//constructor

    public int getRepetitions() {
        return repetitions;
    }

    public int getRecovery() {
        return recovery;
    }

    //Overriding getEntry method
    @Override
    public String getEntry() {
        return getName() + " sprinted " + getDistance() + " km and had " + getRepetitions() + " repetitions and had " + getRecovery() +
                " minutes of recovery in " + getHour() + ":" + getMin() + ":" + getSec() + " on "
                + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
    }
}
