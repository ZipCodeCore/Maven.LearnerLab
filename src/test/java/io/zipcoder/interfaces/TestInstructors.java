package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructors {

    Instructors instructors;

    String[] instructorNames = new String[]{
            "Tariq 'Too Many Cooks' Hook",
            "Leon 'Wagwan' Hunter",
            "Yas",
            "L. Dolio Durant",
            "Melanie"
    };

    @Before
    public void setUp() {
        instructors = Instructors.getInstance();
        for (int i = 0; i < instructorNames.length; i++) {
            instructors.personList.add(new Instructor(instructorNames[i], (long)(i + 1)));
        }
    }

    @Test
    public void test(){
        int expected = 5;
        int actual = instructors.getCount();

        Assert.assertEquals(expected, actual);
        Assert.assertTrue(instructors.getArray()[0] instanceof Instructor);
    }

}