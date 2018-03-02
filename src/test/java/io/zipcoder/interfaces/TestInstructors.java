package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestInstructors {

    @Test
    public void testInstructors(){
        StringBuilder testInstructors = new StringBuilder();
        testInstructors.append(Instructors.getInstance().getArray()[0].getId());  // Tariq id = 1
        testInstructors.append(Instructors.getInstance().getArray()[1].getId());  // Leon = 2
        testInstructors.append(Instructors.getInstance().getArray()[2].getId());  // Wilhem = 3
        testInstructors.append(Instructors.getInstance().getArray()[3].getId());  // Froilan = 4
        testInstructors.append(Instructors.getInstance().getArray()[4].getId());  // Chris = 5
        testInstructors.append(Instructors.getInstance().getArray()[5].getId());  // Nhu = 6

        String expected = "123456";    // id #'s
        String actual = testInstructors.toString();

        Assert.assertEquals(expected, actual);

    }

}