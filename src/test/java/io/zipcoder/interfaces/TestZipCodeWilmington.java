package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture () {
        Student eric = new Student();
        Student cindy = new Student();
        Student petunya = new Student();
        Student tom = new Student();
        Instructor jawn = new Instructor();

        Double exepected = 25.0;
        Students.getInstance().add(eric);
        Students.getInstance().add(cindy);
        Students.getInstance().add(petunya);
        Students.getInstance().add(tom);
        Instructors.getInstance().add(jawn);

        ZipCodeWilmington.INSTANCE.hostLecture(jawn.getId(), 100.0);
        Double actual = ZipCodeWilmington.INSTANCE.getStudyMap().get(eric);

        Assert.assertEquals(exepected, actual);
    }
}
