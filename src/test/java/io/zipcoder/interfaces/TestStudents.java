package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestStudents {


    @Test
    public void siOhNo(){

   Students siEstan = Students.getInstance();


        Boolean Tati = siEstan.contains(siEstan.findById(9098));
       Boolean jen = siEstan.contains(siEstan.findById(8383));
        Boolean John = siEstan.contains(siEstan.findById(4242));



       Assert.assertTrue(Tati);
       Assert.assertTrue(jen);
        Assert.assertTrue(John);

    }



}























//        String actualName = siEstan.findById(9098).getName();
//        String expectedName = "Tati";
//        Assert.assertEquals(expectedName, actualName);