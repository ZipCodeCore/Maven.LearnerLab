package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testStudents(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < Instructors.getInstance().getPersonList().size(); i++) {
            stringBuilder.append(Instructors.getInstance().getPersonList().get(i).getId());
        }
        String expected = "9898987699998888";
        String actual = stringBuilder.toString();
        Assert.assertEquals(expected,actual);
    }

}
