package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {
    @Test
    public void testZipCodeWilmington(){
        ZipCodeWilmington testInstance1 = ZipCodeWilmington.getInstance();
        ZipCodeWilmington testInstance2 = ZipCodeWilmington.getInstance();

        Assert.assertEquals(testInstance1, testInstance2);
    }





}
//public class InstructorsTest {
//    @Test
//    public void testInstructors(){
//
//        Instructors testInstance1 = Instructors.getInstance();
//        Instructors testInstance2 = Instructors.getInstance();
//
//        testInstance1.add(new Instructor(0L));
//        testInstance2.add(new Instructor(1L));
//
//        Assert.assertEquals(testInstance1, testInstance2);
//    }