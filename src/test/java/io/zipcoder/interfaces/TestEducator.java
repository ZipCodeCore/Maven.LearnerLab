package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testImplementation() {
        Educator educator = Educator.LEON;
        Assert.assertTrue(educator instanceof Teacher);
    }

    @Test
    public void testTeach() {
        //given
        Educator educator = Educator.LEON;
        double numberOfHours = 6.0;
        Learner learner = new Student(0, "Stephen");
        //when
        educator.teach(learner, numberOfHours);
        double actualLearnerHours = learner.getTotalStudyTime();
        double actualTimeWorked = educator.getTimeWorked();
        //then
        Assert.assertEquals(numberOfHours, actualLearnerHours, 0.0);
        Assert.assertEquals(numberOfHours, actualTimeWorked, 0.0);
    }

    @Test
    public void testLecture() {
        //given
        Educator educator = Educator.LEON;
        Students students = Students.getInstance();
        double numberOfHours = 20.0;
        double expected = 5.0;
        //when
        educator.lecture(students.getArray(), numberOfHours);
        double actualStudentHoursLearned = students.findByID(1L).getTotalStudyTime();
        double actualTimeWorked = educator.getTimeWorked();
        //then
        Assert.assertEquals(expected, actualStudentHoursLearned, 0.001);
        Assert.assertEquals(expected, actualTimeWorked, 0.001);
    }

    @Test
    public void testGetHoursWorked() {
        //given
        Educator educator = Educator.DOLIO;
        double expected = 5.0;
        Students students = Students.getInstance();
        //when
        educator.teach(students.findByID(1L), expected);
        double actual = educator.getTimeWorked();
        //then
        Assert.assertEquals(expected, actual, 0.01);
    }

}
