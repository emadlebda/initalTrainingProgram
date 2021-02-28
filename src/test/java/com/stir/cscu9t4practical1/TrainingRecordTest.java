/**
 * @author Emad Abulebda, emadabulebda@gmail.com
 */
package com.stir.cscu9t4practical1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author saemundur
 */
public class TrainingRecordTest {
    TrainingRecord instance;

    public TrainingRecordTest() {
        this.instance = new TrainingRecord();
    }

    // helper function
    protected Entry createEntry(String name, int day, int month, int year, int hour, int second, int minute, int distance) {
        return new Entry(name, day, month, year, hour, second, minute, distance);
    }

    /**
     * Test of addEntry method, of class TrainingRecord.
     */
    @Test
    public void testAddEntry() throws Exception {
        Entry entry = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        instance.addEntry(entry);
        assertEquals(instance.getNumberOfEntries(), 1);
    }

    /**
     * Test of exists method, of class TrainingRecord.
     */
    @Test
    public void testExists() throws Exception {
        Entry entry = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        Entry entryNotExists = createEntry("Jemy", 10, 6, 2018, 0, 16, 7, 3);
        instance.addEntry(entry);
        assertTrue(instance.exists(entry));
        assertFalse(instance.exists(entryNotExists));
    }


    /**
     * Test of addEntry with a repeat
     * Adding another entry for the same person on the same day should fail
     */
    @Test()
    public void testAddEntryUnique() throws Exception {
        Entry a = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        Entry b = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3);

        instance.addEntry(a);
        // all should fail to add
        instance.addEntry(a);
        instance.addEntry(a);
        instance.addEntry(b);
        instance.addEntry(b);
        instance.addEntry(b);

        assertEquals(instance.getNumberOfEntries(), 1);
    }

    /**
     * Test of lookupEntryByDate method, of class TrainingRecord.
     */
    @Test
    public void testLookupEntry() throws Exception {
        System.out.println("lookupEntryByDate");
        String expResult = "No entries found";
        Entry a = createEntry("Alice", 1, 2, 2016, 0, 00, 7, 3);
        Entry b = createEntry("Bob", 1, 2, 2003, 0, 30, 15, 3);
        Entry c1 = createEntry("Claire", 7, 3, 2010, 0, 15, 20, 7);
        Entry c2 = createEntry("Claire", 11, 9, 2014, 0, 25, 30, 7);
        instance.addEntry(a);
        instance.addEntry(b);
        instance.addEntry(c1);
        instance.addEntry(c2);
        int d = 7;
        int m = 3;
        int y = 2010;
        String result = instance.searchByDate(d, m, y);
        assertNotEquals(expResult, result);
        result = instance.searchByDate(1, 2, 1999);
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumberOfEntries, of class TrainingRecord
     */
    @Test
    public void testGetNumberOfEntries() throws Exception {
        System.out.println("GetNumberOfEntries");
        Entry a = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        Entry b = createEntry("Bob", 1, 2, 2003, 0, 14, 15, 3);
        Entry c1 = createEntry("Claire", 7, 3, 2010, 0, 26, 20, 7);
        Entry c2 = createEntry("Claire", 11, 3, 2010, 0, 24, 55, 7);
        assertEquals(instance.getNumberOfEntries(), 0);
        instance.addEntry(a);
        assertEquals(instance.getNumberOfEntries(), 1);
        instance.addEntry(b);
        assertEquals(instance.getNumberOfEntries(), 2);
        instance.addEntry(c1);
        assertEquals(instance.getNumberOfEntries(), 3);
        instance.addEntry(c2);
        assertEquals(instance.getNumberOfEntries(), 4);
    }

    @Test
    public void testLookupEntries() throws Exception {
        String expectResultsNone = "Sorry couldn't find anything for this date";
        String expectResults = "Alice ran 3.0 km in 0:16:7 on 1/2/2003\n" +
                "Bob ran 3.0 km in 0:14:15 on 1/2/2003\n";
        Entry a = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        Entry b = createEntry("Bob", 1, 2, 2003, 0, 14, 15, 3);
        instance.addEntry(a);
        instance.addEntry(b);
        int day = 1;
        int month = 2;
        int year = 2003;
        String resultSuccess = instance.lookupEntries(day, month, year);
        String resultNone = instance.lookupEntries(day, month, 1999);
        assertEquals(expectResultsNone, resultNone);
        assertEquals(expectResults, resultSuccess);
    }

    @Test
    public void testDeleteEntry() throws Exception {
        Entry a = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        Entry b = createEntry("Bob", 1, 2, 2003, 0, 14, 15, 3);
        instance.addEntry(a);
        instance.addEntry(b);

        assertEquals(2, instance.getNumberOfEntries());
        instance.deleteEntry(a.getName(), a.getMonth(), a.getDay(), a.getYear());
        assertEquals(1, instance.getNumberOfEntries());
    }

    @Test
    public void testSearchByDate() throws Exception {
        Entry a = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        instance.addEntry(a);
        String result = instance.searchByDate(a.getDay(), a.getMonth(), a.getYear());
        assertNotEquals("No entries found", result);
        result = instance.searchByDate(a.getDay() + 1, a.getMonth() + 1, a.getYear() + 1);
        assertEquals("No entries found", result);
    }

    @Test
    public void testSearchEntryByName() throws Exception {
        Entry a = createEntry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        instance.addEntry(a);
        String result = instance.searchEntryByName(a.getName());
        assertNotEquals("No entries found", result);
        result = instance.searchEntryByName("NONE");
        assertEquals("No entries found", result);
    }
}
