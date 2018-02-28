package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {



    @Test
    public void testStudents(){
        StringBuilder studentIDs = new StringBuilder();
        studentIDs.append(Students.getInstance().getArray()[0].getId());
        studentIDs.append(Students.getInstance().getArray()[1].getId());
        studentIDs.append(Students.getInstance().getArray()[2].getId());
        studentIDs.append(Students.getInstance().getArray()[3].getId());
        String expetect = "1234";
        String actual = studentIDs.toString();
        Assert.assertEquals(expetect,actual);

    }


}
