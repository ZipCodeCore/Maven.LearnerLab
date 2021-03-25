package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLectureByTeacherTest() {
        // Given
        double expectedNumberOfHours = 7;
        double expectedNumberOfStudents = 7;
        double expectedNumberOfHoursPerStudent = expectedNumberOfHours / expectedNumberOfStudents;
        // When
        Instructor instructor = new Instructor();
        instructor.lecture(Students.getInstance().getArray(), expectedNumberOfHours);
        double actualNumberOfHoursPerStudent = Students.getInstance().getArray()[0].getTotalStudyTime();
        // Then
        Assert.assertEquals(expectedNumberOfHoursPerStudent, actualNumberOfHoursPerStudent, 0.01);
    }

    @Test
    public void hostLectureByEducatorTest() {
        // Given
        double expectedNumberOfHoursWorked = 7;
        // When
        ZipCodeWilmington.getInstance().hostLecture(Educator.TARIQ, expectedNumberOfHoursWorked);
        double actualNumberOfHoursWorked = Educator.TARIQ.getTimeWorked();
        // Then
        Assert.assertEquals(expectedNumberOfHoursWorked, actualNumberOfHoursWorked, 0.01);
    }

}
