package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void existenceTest(){
        Instructor t=new Instructor(Long.MIN_VALUE,"");
        Instructors instructors=Instructors.getInstance();
        Instructor t1=new Instructor(101L,"Christopher");
        Instructor t2=new Instructor(102L,"Dolio");
        Instructor t3=new Instructor(103L,"Roberto");
        Instructor t4=new Instructor(104L,"Chris");
        Instructor t5=new Instructor(105L,"Sian");

        instructors.add(t1);
        instructors.add(t2);
        instructors.add(t3);
        instructors.add(t4);
        instructors.add(t5);
        Assert.assertEquals(t1,instructors.getInstance().findById(101L));
        Assert.assertEquals(t2,instructors.getInstance().findById(102L));
        Assert.assertEquals(t3,instructors.getInstance().findById(103L));
        Assert.assertEquals(t4,instructors.getInstance().findById(104L));
        Assert.assertEquals(t5,instructors.getInstance().findById(105L));




    }
}
