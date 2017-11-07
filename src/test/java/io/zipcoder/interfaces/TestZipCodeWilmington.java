package io.zipcoder.interfaces;

import io.zipcoder.interfaces.donald.fountain.classroomLab.*;
import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    Instructors instructor = Instructors.getInstance();
    Students student = Students.getInstance();
    Teacher dolio = (Teacher) instructor.findById(1);
    Student donald = (Student) student.findById(1);
    ZipCodeWilmington cohort = ZipCodeWilmington.getInstance();

    @Test
    public void testHostLectureByTeacherObject(){
        int numberOfHours = 26;
        double expected = 1;

        cohort.hostLecture(dolio, numberOfHours);
        double actual = donald.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testHostLectureById(){
        int numberOfHours = 26;
        double expected = 1;

        cohort.hostLecture(1, numberOfHours);
        double actual = donald.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);

    }
}
