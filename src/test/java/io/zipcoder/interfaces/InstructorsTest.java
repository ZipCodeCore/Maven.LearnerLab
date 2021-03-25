package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;


public class InstructorsTest {

    @Test
    public void getInstance() {
        Instructors testInstructors = Instructors.getInstance();


        for (Instructor eachInst : testInstructors){
            System.out.println(eachInst.getName() + " - " + eachInst.getId());
        }

        Integer expected = 2;
        Integer actual = testInstructors.count();

        Assert.assertEquals(expected,actual);
    }
}