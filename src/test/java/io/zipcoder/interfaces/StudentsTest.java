package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;


public class StudentsTest {

    @Test
    public void getInstance() {
        Students testStudents = Students.getInstance();
        Student student1 = new Student(32L,"Joe");
        Student student2 = new Student(31L,"Jack");

        testStudents.add(student1);
        testStudents.add(student2);

        for (Student eachS : testStudents){
            System.out.println(eachS.getName() + " - " + eachS.getId());
        }

        Integer expected = 2;
        Integer actual = testStudents.count();
        Assert.assertEquals(expected,actual);
    }
}