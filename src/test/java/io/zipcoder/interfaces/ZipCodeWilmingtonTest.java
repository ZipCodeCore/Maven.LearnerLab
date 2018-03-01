package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static io.zipcoder.interfaces.Educator.leon;
import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test

    public void hostLectureByTeacher() {
        Students studentInstance = Students.getINSTANCE();

        Student Ronald = new Student(101);
        Student Darby = new Student(102);
        Student Danny = new Student(103);
        Student Lara = new Student (104);

        studentInstance.add(Ronald);
        studentInstance.add(Darby);
        studentInstance.add(Danny);
        studentInstance.add(Lara);

        Instructor Tariq = new Instructor(1);

        ZipCodeWilmington.hostLectureByTeacher(Tariq, 80);

        Double expected = 10d;
        double actual = Ronald.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void hostLectureByEducator() {
        Students studentInstance = Students.getINSTANCE();

        Student Ronald = new Student(101);
        Student Darby = new Student(102);
        Student Danny = new Student(103);
        Student Lara = new Student (104);

        studentInstance.add(Ronald);
        studentInstance.add(Darby);
        studentInstance.add(Danny);
        studentInstance.add(Lara);

        Instructor Tariq = new Instructor(1);

        ZipCodeWilmington.hostLectureByTeacher(leon, 78);

        Double expected = 10d;
        double actual = Ronald.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.01);
    }
}