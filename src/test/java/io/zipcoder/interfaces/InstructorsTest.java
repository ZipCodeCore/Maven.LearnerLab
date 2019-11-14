package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;


public class InstructorsTest {

    @Test
    public void getInstance() {
        List<Instructor> testInstructors = Instructors.getInstance();
        Instructor instructor1 = new Instructor(33L,"Kris");
        Instructor instructor2 = new Instructor(35L,"Dolio");
        Instructor instructor3 = new Instructor(34L,"Roberto");
        testInstructors.add(instructor1);
        testInstructors.add(instructor2);
        testInstructors.add(instructor3);

        for (Instructor eachInst : testInstructors){
            System.out.println(eachInst.getName() + " - " + eachInst.getId());
        }

        Integer expected = 3;
        Integer actual = testInstructors.size();

        Assert.assertEquals(expected,actual);
    }
}