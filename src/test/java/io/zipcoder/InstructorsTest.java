package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void singleStudentTest(){
        Person tempInstructor = Instructors.getInstance().findById(0000L);
        Assert.assertEquals("Tariq", tempInstructor.getName());
    }

}
