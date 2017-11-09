package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class TestPerson {
    @Test
    public void testConstructor(){
        Person personobj= new Person(1675,"Merin");
        String expected= "Merin";
        String actual= personobj.getName();
        Assert.assertEquals(actual,expected);
        long expected1= 1675;
        long actual1= personobj.getId();
        Assert.assertEquals(actual1,expected1);
        String expeted2= "Lina";
        personobj.setName("Lina");
        String actual2= personobj.getName();
        System.out.println(actual+" "+actual2);
        Assert.assertEquals(expeted2,actual2);

    }

}
