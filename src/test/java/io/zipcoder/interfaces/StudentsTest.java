package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void test() {
        //Create a test method which ensures that each of
        // the students in your current cohort are in your Students singleton.
        //Given
        //Since we can't create a new student we ask the class Students to grab an instance of the student we created
        //for us
        Students instance1 = Students.getInstance();
        Students instance3 = Students.getInstance();

        //so we have Students now we need to fill it with students
        instance1.add(new Student(1L));
        instance3.add(new Student(2L));
        //When
        instance1.findById(1L).setName("Katrice");
//        instance3.findById(2L).setName("Katrice");

        //Then
        //So do I need to compare every aspect of Student
        //first compare the two students against each other
        Assert.assertEquals(instance1, instance3);
        Assert.assertEquals(instance1.findById(1L).getName(), instance3.findById(1L).getName());
    }
}