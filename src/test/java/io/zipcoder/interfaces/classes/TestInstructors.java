package io.zipcoder.interfaces.classes;

import io.zipcoder.interfaces.Enum.Educator;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void TestInstructors() {
        Educator.values();
        Instructors test = Instructors.getInstance();

        //Educator testInstructor = Educator.TARIQ;

        String expected = "TARIQ";

        String actual = test.getArray()[0].getName();

        Assert.assertEquals(expected, actual);
    }
}
