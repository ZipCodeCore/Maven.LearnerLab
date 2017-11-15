package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Class.Instructor;
import io.zipcoder.interfaces.Class.Instructors;
import io.zipcoder.interfaces.Enum.Educator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructors {

    @Before
    public void setUp(){
        Educator.values();
    }

    @Test
    public void TestInstructorsAreAddedToINSTRUCTORS(){
        Instructors instructors = Instructors.getInstructors();

        String expected = "DOLIO";

        Instructor testInstructor = instructors.findById(1002);

        String actual = testInstructor.getName();

        Assert.assertEquals(expected,actual);
    }
}
