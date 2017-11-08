package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

   @Test
   public void testConstructor() {
    Person idTest = new Person(111, "Oleg");
    Assert.assertEquals(111, idTest.getId());
    }

    @Test
    public void testSetName() {
    final Person getNameTest = new Person(111, "Oleg");
    String expected = "oleg";
    Assert.assertEquals(expected, getNameTest.getName());
    }

}