/**
 * @author Emad Abulebda, emadabulebda@gmail.com
 */
package com.stir.cscu9t4practical1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SprintEntryTest {

    // helper function
    protected SprintEntry createEntry(String name, int day, int month, int year, int hour, int second, int minute, int distance, int repetitions, int recovery) {
        return new SprintEntry(name, day, month, year, hour, second, minute, distance, repetitions, recovery);
    }

    /**
     * Test of getName method, of class SprintEntry.
     */
    @Test
    public void testGetName() {
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        String expResult = "Alice";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDay method, of class SprintEntry.
     */
    @Test
    public void testGetDay() {
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        int expResult = 1;
        int result = instance.getDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMonth method, of class SprintEntry.
     */
    @Test
    public void testGetMonth() {
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        int expResult = 2;
        int result = instance.getMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYear method, of class SprintEntry.
     */
    @Test
    public void testGetYear() {
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        int expResult = 2003;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHour method, of class SprintEntry.
     */
    @Test
    public void testGetHour() {
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMin method, of class SprintEntry.
     */
    @Test
    public void testGetMin() {
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        int expResult = 16;
        int result = instance.getMin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSec method, of class SprintEntry.
     */
    @Test
    public void testGetSec() {
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        int expResult = 7;
        int result = instance.getSec();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDistance method, of class SprintEntry.
     */
    @Test
    public void testGetDistance() {
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        float expResult = 300;
        float result = instance.getDistance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getRepetitions method of class SprintEntry
     */
    @Test
    public void testGetRepetitions() {
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        int expResults = 4;
        int result = instance.getRepetitions();
        assertEquals(expResults, result);
    }

    /**
     * Test of getRecovery method of class SprintEntry
     */
    @Test
    public void testGetRecovery() {
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        int expResults = 2;
        int result = instance.getRecovery();
        assertEquals(expResults, result);
    }

    /**
     * Test of getEntry method, of class SprintEntry.
     */
    @Test
    public void testGetEntry() {
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        String expResult = "Alice sprinted 300.0 km and had 4 repetitions and had 2 minutes of recovery in 0:16:7 on 1/2/2003\n";
        String result = instance.getEntry();
        assertEquals(expResult, result);
    }

}