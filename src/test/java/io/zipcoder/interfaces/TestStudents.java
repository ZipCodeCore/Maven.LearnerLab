package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testGetInstance(){
        Students s = Students.getInstance();
        Person julio = s.findById(2);

        Assert.assertEquals("Julio", julio.getName());
    }
}