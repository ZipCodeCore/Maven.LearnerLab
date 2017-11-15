package io.zipcoder.interfaces.classes;

import io.zipcoder.interfaces.Enum.Educator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    Students students = Students.getINSTANCE();
    Instructors instructors = Instructors.getInstance();
    ZipCodeWilmington test = new ZipCodeWilmington();

    @Before
    public void setup(){
        Educator.values();
    }

    @Test
    public void testHostLecture() {
        Student teststudent = students.findById(25);
        double expected = teststudent.getTotalStudyTime();

        test.hostLecture(instructors.personList.get(0), 100);


        double actual = teststudent.getTotalStudyTime();

        Assert.assertTrue(actual>expected);

    }

    @Test
    public void testHostLecture2(){
        Student teststudent = students.findById(25);

        double expected = teststudent.getTotalStudyTime();

        test.hostLecture(3,1200);
        double actual = teststudent.getTotalStudyTime();

        Assert.assertTrue(actual>expected);

    }
}