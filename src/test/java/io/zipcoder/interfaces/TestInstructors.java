package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testStudents(){
        StringBuilder instuctorIDs = new StringBuilder();
        instuctorIDs.append(Instructors.getInstance().getArray()[0].getId());
        instuctorIDs.append(Instructors.getInstance().getArray()[1].getId());
        instuctorIDs.append(Instructors.getInstance().getArray()[2].getId());
        instuctorIDs.append(Instructors.getInstance().getArray()[3].getId());
        String expetect = "1234";
        String actual = instuctorIDs.toString();
        Assert.assertEquals(expetect,actual);

    }
}
