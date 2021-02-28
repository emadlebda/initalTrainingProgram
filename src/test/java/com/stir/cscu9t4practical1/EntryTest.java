/**
 * @author Emad Abulebda, emadabulebda@gmail.com
 */
package com.stir.cscu9t4practical1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author saemundur
 */
public class EntryTest {

    // helper function
    protected Entry createEntry(String name, int day, int month, int year, int hour, int minute, int second, int distance) {
        return new Entry(name, day, month, year, hour, minute, second, distance);
    }

    /**
     * Test of getName method, of class Entry.
     */
    @Test
    public void testGetName() {
        Entry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        String expResult = "Alice";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDay method, of class Entry.
     */
    @Test
    public void testGetDay() {
        Entry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        int expResult = 1;
        int result = instance.getDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMonth method, of class Entry.
     */
    @Test
    public void testGetMonth() {
        Entry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        int expResult = 2;
        int result = instance.getMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYear method, of class Entry.
     */
    @Test
    public void testGetYear() {
        Entry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        int expResult = 2003;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHour method, of class Entry.
     */
    @Test
    public void testGetHour() {
        Entry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMin method, of class Entry.
     */
    @Test
    public void testGetMin() {
        Entry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        int expResult = 16;
        int result = instance.getMin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSec method, of class Entry.
     */
    @Test
    public void testGetSec() {
        Entry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        int expResult = 7;
        int result = instance.getSec();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDistance method, of class Entry.
     */
    @Test
    public void testGetDistance() {
        Entry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        float expResult = 3.0F;
        float result = instance.getDistance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getEntry method, of class Entry.
     */
    @Test
    public void testGetEntry() {
        Entry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        String expResult = "Alice ran 3.0 km in 0:16:7 on 1/2/2003\n";
        String result = instance.getEntry();
        assertEquals(expResult, result);
    }

}
