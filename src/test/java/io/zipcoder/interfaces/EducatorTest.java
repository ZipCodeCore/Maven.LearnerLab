package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

public class EducatorTest {

    Educator tariq = Educator.TARIQ;
    Student student = new Student(1);


    @Test
    public void testEducatorEnum(){
        boolean expected = true;
        boolean actual = tariq instanceof Teacher;
        Assert.assertTrue(String.valueOf(expected), actual);
    }

    @Test
    public void testTeach() {
        double expected = 20.0;
        tariq.teach(student, 20);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0);
    }

    @Test
    public void testLecture() {
        Student student1 = new Student(1);
        Student student2 = new Student(2);
        Learner[] learners = {student1, student2};
        Educator Leon = Educator.LEON;
        double expected = 10.0;
        Leon.lecture(learners, 20);
        double actual = student1.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }
}