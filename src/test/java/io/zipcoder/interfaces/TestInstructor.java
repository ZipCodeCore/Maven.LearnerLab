package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

/*
Teacher teacher1;
@Before
public void setUp(){
instructor1 = new Instructor("Tariq", 123);}
@Test
public void testImplemetation(){
Assert.assertTrue(instructor1 instanceof Teacher);} //teacher is the


 */


public class TestInstructor {
    Instructor instructor1;

    @Before
    public void setUp(){
        instructor1 = new Instructor("Tariq", 1222);}

    @Test
    public void testImplementation(){Assert.assertTrue(instructor1 instanceof Teacher);}

    @Test
    public void testInheritance(){Assert.assertTrue(instructor1 instanceof Person);}

    @Test
    public void testTeach(){
        Student student4 = new Student("Linda", 888);
        double expected = 3.5;
        instructor1.teach(student4, 3.5);
        double actual = student4.getTotalStudyTime();
        Assert.assertEquals(expected,actual, .001);

    }

    @Test
    public void testLecture(){
        Student student4 = new Student("linda", 876);
        Learner[]learners = {student4};
        double expected = 1.5;
        instructor1.lecture(learners, 1.5);
        double actual = student4.getTotalStudyTime();
        Assert.assertEquals(expected, actual, .002);

    }


}