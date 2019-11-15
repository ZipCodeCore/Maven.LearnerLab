package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void getStudyMapByNameTest() {
        Students students = Students.getInstance();
        Instructors instructors = Instructors.getInstance();
        Long expectedTeacherId = 2323L;
        Teacher teacher = instructors.findByID(expectedTeacherId);
        Long expectedStudentId = 34L;
        Student student = students.findByID(expectedStudentId);
        Double numberOfHours = 12D;
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        zipCodeWilmington.hostLecture(teacher,numberOfHours);
        Double expectedHours = 3D;

        Assert.assertEquals(expectedHours, student.getTotalStudyTime());

    }

    @Test
    public void getStudyMapByIdTest() {
        Students students = Students.getInstance();
        Student student = new Student (98L, "Edgar");
        students.add(student);
        Long expectedTeacherId = 2323L;
        Double numberOfHours = 12D;
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        zipCodeWilmington.hostLecture(expectedTeacherId,numberOfHours);
        Double expectedHours = 2.4;

        Assert.assertEquals(expectedHours, student.getTotalStudyTime());

    }
}