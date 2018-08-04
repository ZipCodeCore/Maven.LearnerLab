package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLecturesTest() {
        Instructor instructor = new Instructor(2);
        ZipCodeWilmington.getInstance().hostLectures(instructor, 40);

        Student[] i = Students.getInstance().getStudentArray();
        Double expected = 3.0;
        double actual = i[1].getTotalStudyTime();
        Assert.assertEquals(expected, actual, 001);
    }

    @Test
    public void hostLectures1() {
       // Student[] expected = Students.getInstance().getStudentArray();


    }
}