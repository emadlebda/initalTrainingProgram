/**
 * @author Emad Abulebda, emadabulebda@gmail.com
 */
package com.stir.cscu9t4practical1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author saemundur
 */
public class SwimEntryTest {

    // helper function
    protected SwimEntry createEntry(String name, int day, int month, int year, int hour, int second, int minute, int distance, String where) {
        return new SwimEntry(name, day, month, year, hour, second, minute, distance, where);
    }


    /**
     * Test of getName method, of class SwimEntry.
     */
    @Test
    public void testGetName() {
        SwimEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "outdoors");
        String expResult = "Alice";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDay method, of class SwimEntry.
     */
    @Test
    public void testGetDay() {
        SwimEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool");
        int expResult = 1;
        int result = instance.getDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMonth method, of class SwimEntry.
     */
    @Test
    public void testGetMonth() {
        SwimEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "outdoors");
        int expResult = 2;
        int result = instance.getMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYear method, of class SwimEntry.
     */
    @Test
    public void testGetYear() {
        SwimEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool");
        int expResult = 2003;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHour method, of class SwimEntry.
     */
    @Test
    public void testGetHour() {
        SwimEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool");
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMin method, of class SwimEntry.
     */
    @Test
    public void testGetMin() {
        SwimEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool");
        int expResult = 16;
        int result = instance.getMin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSec method, of class SwimEntry.
     */
    @Test
    public void testGetSec() {
        System.out.println("getSec");
        SwimEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool");
        int expResult = 7;
        int result = instance.getSec();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDistance method, of class SwimEntry.
     */
    @Test
    public void testGetDistance() {
        SwimEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool");
        float expResult = 3.0F;
        float result = instance.getDistance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getWhere method, of class SwimEntry
     */
    @Test
    public void testGetWhere() {
        SwimEntry instanceA = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "outdoors");
        String expResultA = "outdoors";
        String result = instanceA.getWhere();
        assertEquals(expResultA, result);

        SwimEntry instanceB = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool");
        String expResultB = "pool";
        result = instanceB.getWhere();
        assertEquals(expResultB, result);
    }

    /**
     * Test of getEntry method, of class SwimEntry.
     */
    @Test
    public void testGetEntry() {
        SwimEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "outdoors");
        String expResult = "Alice swam 3.0 km in an outdoors pool in0:16:7 on 1/2/2003\n";
        String result = instance.getEntry();
        assertEquals(expResult, result);
    }

}