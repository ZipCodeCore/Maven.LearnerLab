package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void whereAllMyProfsAt() {
        Instructors instructors = Instructors.getInstance();

        Instructor dolio = (new Instructor(101L, "Dolio"));
        Instructor leon = (new Instructor(102L, "Leon"));
        Instructor kris = (new Instructor(103L, "Kris"));

        int expected = 3;
        int actual = instructors.count();

        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void whereProfId() {
//        Instructors instructors = Instructors.getInstance();
//
//        Instructor dolio = (new Instructor(1L, "Dolio"));
//        Instructor leon = (new Instructor(2L, "Leon"));
//        Instructor kris = (new Instructor(3L, "Kris"));
//
//        Person actual2 = instructors.findById(2L);
//        Person expected2 = leon;
//
//        Assert.assertEquals(expected2, actual2);
//    } @@@@singleton always diff id
}
