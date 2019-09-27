package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void testImplementation() {
        //given
        Instructor instructor = new Instructor(-1L);
        //when - check instructor type

        //then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        //given
        Instructor instructor = new Instructor(5L);
        //when

        //then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        //given
        Teacher teacher = new Instructor(8L); //cast to long by typing L after the int used to cast it
        Student learner = new Student(8L);
        double numberOfHours = 72;
        //when
        teacher.teach(learner, numberOfHours);
        double actual = learner.getTotalStudyTime();
        //then
        Assert.assertEquals(numberOfHours, actual, 0); //delta represents the "difference" for precision
    }

    @Test
    public void testLecture() {
        //given
        Teacher teacher = new Instructor(8L);
        Student learner1 = new Student(8L);
        Student learner2 = new Student(4L);
        Student[] studentArray = new Student[]{learner1, learner2};
        double numberOfHours = 10;
        double expected = 5;
        //when
        teacher.lecture(studentArray, numberOfHours);
        //then
        for (Student student : studentArray) {
            double actual = student.getTotalStudyTime();
            Assert.assertEquals(expected, actual, 0);
        }
    }
}
