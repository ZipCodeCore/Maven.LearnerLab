package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructor {
    private Instructor myInstructor;
    private Student myStudent, myStudent2;
    private Student [] myStudentsArray;

    @Before
    public void setup () throws Exception{
        myInstructor = new Instructor(44556L, "Mr. Trombello");
        myStudent = new Student (9876L, "Hayden Parker");
        myStudent2 = new Student (9996L, "Lula Parker");
        myStudentsArray = new Student [2];
        myStudentsArray[0] = myStudent;
        myStudentsArray[1] = myStudent2;
    }

    @Test
    public void instanceOfTeacherTest () {
        Assert.assertTrue(myInstructor instanceof Teacher);
    }

    @Test
    public void instanceOfPersonTest () {
        Assert.assertTrue(myInstructor instanceof Person);
    }

    @Test
    public void testTeach () {
        Double expected = 8D;
        myStudent.learn(8D);
        Assert.assertEquals(expected, myStudent.getTotalStudyTime());
    }

    @Test
    public void testLecture () {
        Double expected = 4D;
        myInstructor.lecture(8D, myStudentsArray);
        Assert.assertEquals(expected, myStudent.getTotalStudyTime());
    }

    @Test
    public void testLecture2 () {
        Double expected = 4D;
        myInstructor.lecture(8D, myStudentsArray);
        Assert.assertEquals(expected, myStudent2.getTotalStudyTime());
    }
}
