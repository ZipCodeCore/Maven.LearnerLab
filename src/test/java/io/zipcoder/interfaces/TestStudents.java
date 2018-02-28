package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testStudents(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < Students.getInstance().getPersonList().size(); i++) {
            stringBuilder.append(Students.getInstance().getPersonList().get(i).getId());
        }
        String expected = "10011111222233334444";
        String actual = stringBuilder.toString();
        Assert.assertEquals(expected,actual);
    }

}