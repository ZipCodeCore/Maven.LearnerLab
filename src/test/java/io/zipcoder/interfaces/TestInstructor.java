package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplmentation(){
        Instructor instu = new Instructor(234, "leon");
        Assert.assertTrue(instu instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instru = new Instructor(234, "leon");
        Assert.assertTrue(instru instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor instruc = new Instructor(987, "mochi");
        Student estudiante = new Student(007, "josh");

        instruc.teach(estudiante, 12.0);
        Double expected = 12.0;
        Double actual = estudiante.getTotalStudyTime();

    Assert.assertEquals(expected, actual);



    }

    @Test
    public void testLecture(){

    }

}
