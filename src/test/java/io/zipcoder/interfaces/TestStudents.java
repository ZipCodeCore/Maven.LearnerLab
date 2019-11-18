package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void testExistence(){
Student s=new Student(Long.MIN_VALUE,"",0);
Students students= Students.getInstance();
       /* Student s1= new Student(1L, "Julia", 4);
        Student s2 = new Student(2L, "Miral", 5);
        Student s3 = new Student(3L, "Chris", 3);
        Student s4 = new Student(4L, "Mike", 4);
        Student s5 = new Student(5L, "Grace", 7);
        Student s6 = new Student(6L, "Ron", 4);
        Student s7 = new Student(7L, "Usha", 4);
        Student s8 = new Student(8L, "Kane", 4);
        Student s9 = new Student(9L, "Val", 4);
        Student s10 = new Student(10L, "Ryan", 4);
        Student s11 = new Student(11L, "Brian", 4);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);
        students.add(s11);*/





       Assert.assertEquals("Chris",students.getInstance().findById(3L).getName());
       Assert.assertEquals("Usha",students.getInstance().findById(7L).getName());
        Assert.assertEquals("Brian",students.getInstance().findById(11L).getName());
        Assert.assertNotEquals("Chris",students.getInstance().findById(8L).getName());
        Assert.assertEquals("Miral",students.getInstance().findById(2L).getName());



    }
}
