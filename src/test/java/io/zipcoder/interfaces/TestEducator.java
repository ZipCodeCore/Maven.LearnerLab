package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {


    Educator dolio = Educator.DOLIO;
    Instructor instructor = new Instructor(1, "Dolio");



    @Test
    public void testImplementation() {

        Assert.assertTrue(instructor instanceof Teacher);

    }

    @Test
    public void testInheritance() {

        Assert.assertTrue(instructor instanceof Person);


    }

    @Test
    public void testTeach() {

        double prevTimeWorked = dolio.getTimeWorked();
        Student student = new Student(1, "Zan");

        double expected = 10;
        dolio.teach(student,10);

        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
        Assert.assertEquals(prevTimeWorked+10, dolio.getTimeWorked(),0);

    }

}
