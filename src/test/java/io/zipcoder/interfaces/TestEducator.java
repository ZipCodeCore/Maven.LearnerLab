package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void implementationTest(){
        //given
        Educator instructor = Educator.LEON;

        //when
        Boolean check1 = instructor instanceof Teacher;

        //then
        Assert.assertTrue(check1);

    }
    @Test
    public void teachTest(){
        //given
        Educator instructor = Educator.LEON;
        Student student = new Student(null, null);

        //when
        instructor.teach(student, 20.0);
        Double actual = student.getTotalStudyTime();
        Double expected = 20.0;

        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void lectureTest() {
        //given
        Educator instructor =  Educator.LEON;
        Student student1 = new Student(null, null);
        Student student2 = new Student(null, null);
        Learner[] learners = {student1, student2};


        //when
        instructor.lecture(learners, 10.0);

        Double actual1 = student1.getTotalStudyTime();
        Double actual2 = student2.getTotalStudyTime();

        Double expected1 = 5.0;
        Double expected2 = 5.0;

        //then
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }
}
