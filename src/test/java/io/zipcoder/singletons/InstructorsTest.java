package io.zipcoder.singletons;

import io.zipcoder.Instructors;
import io.zipcoder.Person;
import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void singleStudentTest(){
        Person tempInstructor = Instructors.getInstance().findById(0000L);
        Assert.assertEquals("Tariq", tempInstructor.getName());
    }

}
