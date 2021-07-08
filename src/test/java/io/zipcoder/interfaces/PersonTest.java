package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PersonTest {
    Person person;

    @Before
    public void setID(){
        long idInput = 0474754;
        person = new Person(idInput);
    }

    @Test
    public void testConstructor(){
        long idInput = 0474754;
        person = new Person(idInput);
        long actual = person.getId();
        assertEquals(idInput, actual);
    }

    @Test
    public void TestSetName(){
        String name = "Frankie";
        person.setName(name);
        String actual = person.getName();
        assertEquals(name, actual);
    }
}
