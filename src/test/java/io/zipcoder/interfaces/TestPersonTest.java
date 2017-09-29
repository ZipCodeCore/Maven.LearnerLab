package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Jade on 7/13/17.
 */
public class TestPersonTest {

    @Test
    public void testSetName() {


        Person Jade = new Person("Murphy");
        Jade.setName("Jade");
        String expected = "Jade";
        String actual = Jade.getName();
        Assert.assertEquals(expected,actual);

        System.out.println(Jade.getName());
    }



    public void testConstructor() {
    }

}