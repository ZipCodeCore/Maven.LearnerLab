package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TestStudents extends TestCase {

    @Test
    public void test(){
        //given
        int expectedValue=5;
        Students instance=Students.getInstance();
        //when
        int actualValue=instance.personList.size();
        //then
        Assert.assertEquals(expectedValue,actualValue);
    }

}