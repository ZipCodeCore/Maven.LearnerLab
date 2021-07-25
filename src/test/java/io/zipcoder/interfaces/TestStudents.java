package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

public class TestStudents {
    @Test
    public void testInstance(){
        Students instance = Students.getINSTANCE();
        Integer actual=instance.personList.size();
        Integer expected = 4;
        Assert.assertEquals(expected,actual);
    }
}
