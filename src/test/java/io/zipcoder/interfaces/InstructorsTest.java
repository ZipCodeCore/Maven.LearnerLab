package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorsTest {

    Instructors instructors = Instructors.getInstance();
    @Test
    void getArray() {
        int expected = 3;

        int actual = instructors.getArray().length;

        Assert.assertEquals(expected, actual);
    }

    @Test
    void getInstance() {
        String expected = "Tariq,Leon,Dolio,";

        String actual =  instructors.toString();

        Assert.assertEquals("The two instructor list are equal", expected, actual);
    }

}