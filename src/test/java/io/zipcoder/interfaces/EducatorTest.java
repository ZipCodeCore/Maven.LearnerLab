package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {
    Instructor instructor=new Instructor(0,Educator.values()[0].getName());
    Student student=new Student(666);
    Learner [] learners= new Learner []{student, new Student(222)};

    @Test
    public void teach() throws Exception {
        double expected=10;

        instructor.teach(student, 10);

        double actual=student.getTotalStudyTime();

        Assert.assertEquals(expected, actual,.00);
       Assert.assertEquals(10,instructor.getTimeWorked(),.00);
    }

    @Test
    public void lecture() throws Exception {
        double expected =20;

        instructor.lecture(learners, 40);

        Student one=(Student) learners[0];
        double actual = one.getTotalStudyTime();

        Assert.assertEquals(expected, actual,.00);
        Assert.assertEquals(40,instructor.getTimeWorked(),.00);
    }


}
