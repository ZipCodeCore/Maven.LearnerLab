package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testImplementation() {
        Educator educator = Educator.Leon;
        Assert.assertTrue(educator instanceof Teacher);
    }
//
//    @Test
//    public void teachTest(){
//        Educator educator= Educator.Leon;
//        Student student=new Student(2l,"sitara",6.0);
//
//    }
}


