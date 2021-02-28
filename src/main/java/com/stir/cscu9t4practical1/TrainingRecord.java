/**
 * @author Emad Abulebda, emadabulebda@gmail.com
 */
package com.stir.cscu9t4practical1;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class TrainingRecord {
    private List<Entry> entries;

    public TrainingRecord() {
        entries = new ArrayList<>();
    } //constructor


    // checks if an entry is already exists on our list
    protected boolean exists(Entry entry) {
        boolean flag = false;
        for (Entry current : entries) {
            if (current.getName().equalsIgnoreCase(entry.getName()) && current.getDay() == entry.getDay() && current.getMonth() == entry.getMonth() && current.getYear() == entry.getYear()) {
                flag = true;
                break;
            }
        }
        return flag;
    }//exists

    // add a record to the list
    public String addEntry(Entry e) {
        String result = "";
        if (exists(e)) {
            result = "Already added";
        } else {
            entries.add(e);
            result = "Record added\n";
        }

        return result;
    } // addEntry

    // look up the entry of a given day and month and year
    public String searchByDate(int day, int month, int year) {
        ListIterator<Entry> iter = entries.listIterator();
        String result = "No entries found";
        while (iter.hasNext()) {
            Entry current = iter.next();
            if (current.getDay() == day && current.getMonth() == month && current.getYear() == year)
                result = current.getEntry();
        }
        return result;
    } // lookupEntryByDate

    // look up the entry of a given day and month
    public String searchEntryByName(String name) {
        ListIterator<Entry> iter = entries.listIterator();
        String result = "No entries found";
        while (iter.hasNext()) {
            Entry current = iter.next();
            if (current.getName().equalsIgnoreCase(name))
                result = current.getEntry();
        }
        return result;
    } // lookupEntryByDate

    // looks up to all entries
    public String lookupEntries(int day, int month, int year) {
        ListIterator<Entry> iter = entries.listIterator();
        StringBuilder result = new StringBuilder("Sorry couldn't find anything for this date");
        while (iter.hasNext()) {
            Entry current = iter.next();
            if (current.getDay() == day && current.getMonth() == month && current.getYear() == year) {
                if (result.toString().equals("Sorry couldn't find anything for this date"))
                    result = new StringBuilder();
                result.append(current.getEntry());
            }
        }
        return result.toString();
    }

    // delete an entry
    public String deleteEntry(String name, int month, int day, int year) {
        ListIterator<Entry> iter = entries.listIterator();
        StringBuilder result = new StringBuilder("Sorry couldn't find anything");
        while (iter.hasNext()) {
            Entry current = iter.next();
            if (current.getDay() == day && current.getMonth() == month && current.getYear() == year && current.getName().equalsIgnoreCase(name)) {
                if (result.toString().equals("Sorry couldn't find anything")) {
                    result = new StringBuilder();
                }
                entries.remove(current);
                result.append("Record was deleted\n");
            }
        }
        return result.toString();
    }

    // Count the number of entries
    public int getNumberOfEntries() {
        return entries.size();
    }

    // Clear all entries
    public void clearAllEntries() {
        if (!entries.isEmpty())
            entries.clear();
    }

} // TrainingRecord