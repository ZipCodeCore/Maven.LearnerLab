package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {
    private Person testPerson, testPerson1, testPerson2, testPerson3;

    @Before
    public void setUp() throws Exception {
    testPerson = new Person (874312L, "David Smith");
    testPerson1 = new Person (874311L, "Jeremy Smith");
    testPerson2 = new Person (874316L, "Mary Smith");
    testPerson3 = new Person (874318L, "Joel Smith");
    }

    @Test
    public void constructorTest () {
    Long expectedId = 874312L;
    String expectedName = "David Smith";

        Assert.assertEquals(expectedId, testPerson.getId());
        Assert.assertEquals(expectedName, testPerson.getName());
    }

    @Test
    public void getId() {
        Long expectedId = 874311L;
        Assert.assertEquals(expectedId, testPerson1.getId());
    }

    @Test
    public void setName() {
        String expectedName = "Waldo Smith";
        testPerson.setName(expectedName);
        Assert.assertEquals(expectedName, testPerson.getName());
    }
}

