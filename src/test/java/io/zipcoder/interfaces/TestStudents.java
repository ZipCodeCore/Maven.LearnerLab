package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudents {

   Students instance = Students.getInstance();

    @Before
    public void setup(){

    }
    @Test
    public  void test(){
        String expected = "Katrina";
        String actual=instance.findById(2).getName();

        Assert.assertSame(expected,actual);

    }
    @Test
    public void getArrayTest(){
        int expected = 4;
        int actual = instance.getArray().length;

        Assert.assertEquals(expected,actual);

    }




    @Test
    public void getInstance() {


    }
}