package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
    Student implementationTest = new Student(111);
    double expected = implementationTest.learn(5.0);
        Assert.assertEquals(expected, implementationTest.learn(5.0));
    }

}
