/**
 * @author Emad Abulebda, emadabulebda@gmail.com
 */
package com.stir.cscu9t4practical1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author saemundur
 */
public class CycleEntryTest {
    // helper function
    protected CycleEntry createEntry(String name, int day, int month, int year, int hour, int minute, int second, int distance, String terrain, String tempo) {
        return new CycleEntry(name, day, month, year, hour, minute, second, distance, terrain, tempo);
    }


    /**
     * Test of getName method, of class CycleEntry.
     */
    @Test
    public void testGetName() {
        CycleEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        String expResult = "Alice";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDay method, of class CycleEntry.
     */
    @Test
    public void testGetDay() {
        CycleEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "gravel", "moderate");
        int expResult = 1;
        int result = instance.getDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMonth method, of class CycleEntry.
     */
    @Test
    public void testGetMonth() {
        CycleEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "mountain", "fast");
        int expResult = 2;
        int result = instance.getMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYear method, of class CycleEntry.
     */
    @Test
    public void testGetYear() {
        CycleEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "gravel", "slow");
        int expResult = 2003;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHour method, of class CycleEntry.
     */
    @Test
    public void testGetHour() {
        CycleEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "fast");
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMin method, of class CycleEntry.
     */
    @Test
    public void testGetMin() {
        CycleEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        int expResult = 16;
        int result = instance.getMin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSec method, of class CycleEntry.
     */
    @Test
    public void testGetSec() {
        CycleEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        int expResult = 7;
        int result = instance.getSec();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDistance method, of class CycleEntry.
     */
    @Test
    public void testGetDistance() {
        CycleEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        float expResult = 3.0F;
        float result = instance.getDistance();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTerrain method, of class CycleEntry.
     */
    @Test
    public void testGetTerrain() {
        CycleEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        String expResult = "asphalt";
        String result = ((CycleEntry) instance).getTerrain();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTempo method, of class CycleEntry.
     */
    @Test
    public void testGetTempo() {
        CycleEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        String expResult = "moderate";
        String result = ((CycleEntry) instance).getTempo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEntry method, of class CycleEntry.
     */
    @Test
    public void testGetEntry() {
        CycleEntry instance = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        String expResult = "Alice cycled 3.0 km on the asphalt terrain at tempo of moderate in0:16:7 on 1/2/2003\n";
        String result = instance.getEntry();
        assertEquals(expResult, result);
    }

}