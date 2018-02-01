package io.zipcoder.interfaces;

import io.zipcoder.interfaces.donald.fountain.classroomLab.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestInstructor {

    long idNumber = 1;

    @Test
    public void testImplementation() {
        //: Given
//        Instructor instructor = new Instructor(idNumber);

        //: Then
        Assert.assertTrue(Instructors.getInstance().findById(007) instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        //: Given

        //: When
        Assert.assertTrue(Instructors.getInstance().findById(007) instanceof Person);
    }

    @Test
    public void testConstructor(){
        //: Given
//        Instructor leon = new Instructor(idNumber);
//        String name = "Leon";
        String expected = "Dolio" + "7";

        //: When
//        leon.setName(name);
        String actual = Instructors.getInstance().findById(007).getName() + Instructors.getInstance().findById(007).getId();

        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTeach(){
        //: Given
//        Instructor leon = new Instructor(idNumber);
        double teachingHoursExpected = 4;


        //: When
//        Student donald = new Student(idNumber), jeff = new Student(idNumber), sam = new Student(idNumber);
//        Student[] students = Students.getInstance().getArray();
        Instructors.getInstance().findById(007).teach(Students.getInstance().findById(1), teachingHoursExpected);
        double actual = Students.getInstance().findById(1).getTotalStudyTime();

        //: Then
        Assert.assertEquals(teachingHoursExpected, actual, 0);
    }
}
