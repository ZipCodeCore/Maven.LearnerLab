package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void instructorsTest() {
        Instructors instance1 =  Instructors.getInstance();
        Instructors instance2 =  Instructors.getInstance();

        Instructor instructor1 = new Instructor(12311323);
        Instructor instructor2 = new Instructor(32452234);
        Instructor instructor3 = new Instructor(324724987);
        Instructor instructor4 = new Instructor(345633211);
        Instructor instructor5 = new Instructor(33341231);
        Instructor instructor6 = new Instructor(324930192);

        instance1.add(instructor1);
        instance1.add(instructor2);
        instance2.add(instructor3);
        instance2.add(instructor4);
        instance2.add(instructor5);
        instance1.add(instructor6);

        Instructors expected = instance1;
        Instructors actual = instance2;

        Assert.assertEquals(expected, actual);
    }
}
