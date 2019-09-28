package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {


@Test
    public void learnerStudentTest() {
    Student student = new Student(66);
    Assert.assertTrue(student instanceof Learner);
}

@Test
    public void personStudentTest() {
    Student student = new Student(66);
    Assert.assertTrue(student instanceof Person);
}

@Test
    public void testTotalStudyTime(){
    Student student = new Student(88);
    student.learn(105);
    double expected = 105;
    double actual = student.getTotalStudyTime();

    Assert.assertEquals(actual,expected,0);


}


}