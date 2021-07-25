package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentSTest {
    @Test
    public void test(){
        Students students = Students.getInstance();
        Student john = new Student(5,"John");
        students.add(john);
        //when
        Person retrieved1 = students.findById(5);
        //then
        Assert.assertEquals(john,retrieved1);
        students.removePerson(john);
    }

    @Test
    public void realTest(){
        //given
        Students students = Students.getInstance();
        //when
        Student nateCopy = students.findById(0);
        boolean hasNate = students.contains(nateCopy);
        //then
        Assert.assertTrue(hasNate);

    }


}
