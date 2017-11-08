package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor();
        boolean expected = true;
        boolean actual = false;
        if (instructor instanceof Teacher) {
            actual = true;
        }
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor();
        boolean expected = true;
        boolean actual = false;
        if (instructor instanceof Person) {
            actual = true;
        }
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor();
        Student student = new Student();
        instructor.teach(student, 5);
        double expectedStudyTimeOfStudent = 5;
        double actualStudyTimeOfStudent = student.getTotalStudyTime();
        Assert.assertEquals(expectedStudyTimeOfStudent, actualStudyTimeOfStudent, .001);
    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor();
        Learner[] learners = new Learner[2];
        Student student1 = new Student();
        Student student2 = new Student();
        learners[0] = student1;
        learners[1] = student2;
        instructor.lecture(learners, 24);
        double expectedStudyTimeOfStudent1 = 12;
        double actualStudyTimeOfStudent1 = student1.getTotalStudyTime();
        double expectedStudyTimeOfStudent2 = 12;
        double actualStudyTimeOfStudent2 = student2.getTotalStudyTime();
        Assert.assertEquals(expectedStudyTimeOfStudent1, actualStudyTimeOfStudent1, .001);
        Assert.assertEquals(expectedStudyTimeOfStudent2, actualStudyTimeOfStudent2, .001);
    }
}
