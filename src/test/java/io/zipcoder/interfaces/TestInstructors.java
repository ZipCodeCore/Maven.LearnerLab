package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class TestInstructors {
    @Test
    public void testInstructors(){
        Instructors instructors = Instructors.getINSTRUCTORSINSTANCE();
        int expected = 4;
        int actual = instructors.personList.size();
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
    }

}
