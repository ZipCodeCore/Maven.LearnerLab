package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilimingtonTest
{
    ZipCodeWilimington zipCodeWilimington = ZipCodeWilimington.getInstance();
    @Test
    public void testHostLecture1()
    {
        //We instantiate a constructor which implements Teacher
        //We cannot instantiate an interface like Teacher
        Instructor instructor = new Instructor("Will", 1);
        Student student = new Student("Bob", 9L);

        Students students = Students.getInstance();
        students.add(student);

        zipCodeWilimington.hostLecture(instructor, 12);
        double expected = 2;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.01);



    }

    @Test
    public void testHostLecture2()
    {
        Instructor instructor = new Instructor("Kris", 2L);
        Student student6 = new Student("Will", 6L);

        Students instance = Students.getInstance();
        instance.add(student6);

        zipCodeWilimington.hostLecture(Educator.NHU,300);

        double expected = 50;
        double actual = student6.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }


}