package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {
    ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();

    @Test
    public void hostLecture() {
        Student student5 = new Student("Vince",1);
        Students instance = Students.getInstance();
        instance.add(student5);
        //Instructor instructor1 = new Instructor("Kris",10);

        zcw.hostLecture(Educator.LEON,400);

        double expected  = 80;
        double actual  = student5.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0.01);


    }
}