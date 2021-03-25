package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void existenceTest(){
       // Instructor t=new Instructor(Long.MIN_VALUE,"");
        Instructors instructors=Instructors.getInstance();
        /*Instructor t1=new Instructor(101L,"Christopher");
        Instructor t2=new Instructor(102L,"Dolio");
        Instructor t3=new Instructor(103L,"Roberto");
        Instructor t4=new Instructor(104L,"Chris");
        Instructor t5=new Instructor(105L,"Sian");

        instructors.add(t1);
        instructors.add(t2);
        instructors.add(t3);
        instructors.add(t4);
        instructors.add(t5);*/
        Assert.assertEquals("Christopher",instructors.getInstance().findById(101L).getName());
        Assert.assertEquals("Dolio",instructors.getInstance().findById(102L).getName());
        Assert.assertEquals("Roberto",instructors.getInstance().findById(103L).getName());
        Assert.assertEquals("Chris",instructors.getInstance().findById(104L).getName());
        Assert.assertEquals("Sian",instructors.getInstance().findById(105L).getName());




    }
}
