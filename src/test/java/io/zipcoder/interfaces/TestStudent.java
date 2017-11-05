package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {

        Assert.assertTrue(Student.instanceOf(Learner));


    }

    @Test

    public void testInheritance() {

        Assert.assertTrue(Student.instanceOf(Person));

    }

    @Test

    public void testLearn() {

        

    }

}
