package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    Instructor instructor = new Instructor(121212, "Leon ");

    @Test
    public void testImplementation() {

        Assert.assertTrue(instructor instanceof Teacher);

    }

    @Test
    public void testInheritance() {

        Assert.assertTrue(instructor instanceof Person);


    }

    @Test
    public void testTeach(){

        double expected = 10000;
        //need feedback below... I guess that it's not seeing the way I am passing the number in as a double
        //it is clearly double
        //double actual = instructor.teach(10000.00);

        //Assert.assertEquals(expected, actual, 0);

    }

}
