package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void getStudyMap() {
        Students students = Students.INSTANCE.getInstance();
        Instructors instructors = Instructors.INSTANCE.getInstance();
        Long expectedTeacherId = 2323L;
        Teacher teacher = instructors.findByID(expectedTeacherId);
        Long expectedStudentId = 34L;
        Student student = students.findByID(expectedStudentId);
        Double numberOfHours = 12D;
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        zipCodeWilmington.hostLecture(teacher,numberOfHours);
        System.out.println(student.getTotalStudyTime());

    }
}