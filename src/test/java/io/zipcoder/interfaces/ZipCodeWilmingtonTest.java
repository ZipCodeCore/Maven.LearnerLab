package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLectureByTeacher() {
        Students studentInstance = Students.getInstance();

        Student student1 = new Student(2);
        Student student2 = new Student(2);
        Student student3 = new Student(2);

        studentInstance.addPerson(student1);
        studentInstance.addPerson(student2);
        studentInstance.addPerson(student3);

        Instructor Kris = new Instructor(1);

        ZipCodeWilmington.hostLectureByTeacher(Kris, 14);

        Double expected = 2d;
        Double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.01);


    }

}