package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InstructorsTest {

    Instructor tariq;
    Instructor froilan;
    Instructor leon;
    Instructor wilhem;
    Instructor kibret;
    Instructors instructors;

    @Before
    public void setup() {
        tariq = new Instructor(1);
        froilan = new Instructor(2);
        leon = new Instructor(3);
        wilhem = new Instructor(4);
        instructors = Instructors.getInstance();
        instructors.add(tariq);
        instructors.add(froilan);
        instructors.add(leon);
        instructors.add(wilhem);
    }


    @Test
    public void instructorsTest1() {
        Instructors i2 = Instructors.getInstance();
        Instructor kris = new Instructor(5);
        Instructor dolio = new Instructor(6);
        i2.add(kris);
        i2.add(dolio);
        int expected = 6;
        int actual = i2.getCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAllTest() {
        instructors.add(kibret);
        instructors.removeAll();
        int expected = 0;
        int actual = instructors.getCount();
        Assert.assertEquals(expected,actual);
    }
}
