package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {
    ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();

    @Test
    public void getInstance() {
    }

    @Test
    public void hostLecture() {
        Student student1 = new Student("Vince",1);
        Students instance = Students.getInstance();
        instance.add(student1);
        Instructor instructor1 = new Instructor("Kris",10);

        zcw.hostLecture(instructor1,400);

        double expected  = 100;
        double actual  = student1.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0.01);


    }

    @Test
    public void hostLecture1() {
    }
}