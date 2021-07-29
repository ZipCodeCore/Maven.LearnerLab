package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testEducatorInstance() {
        Instructor expected = Instructors.getInstance().findById(101L);
        Instructor actual = Educator.DOLIO.instructor;

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testTeachEnum(){

        Student student = Students.getInstance().findById(1L);
        Educator.DOLIO.teach(student,2);

        Double expected = 3.0;
        Double actual = student.totalStudyTime;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLectureEnum() {
        Student[] students = Students.getInstance().toArray();
        Educator.DOLIO.lecture(students, 19);

        Double expected = 2.0;
        Double actual = students[0].getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }


}
