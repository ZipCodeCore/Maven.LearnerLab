package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLectureTest() {
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

}
