package io.zipcoder.interfaces;

import io.zipcoder.interfaces.donald.fountain.classroomLab.Instructor;
import io.zipcoder.interfaces.donald.fountain.classroomLab.Person;
import io.zipcoder.interfaces.donald.fountain.classroomLab.Student;
import io.zipcoder.interfaces.donald.fountain.classroomLab.Teacher;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestInstructor {

    long idNumber = 100000;

    @Test
    public void testImplementation() {
        //: Given
        Instructor instructor = new Instructor(idNumber);

        //: Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        //: Given
        Instructor leon = new Instructor(idNumber);

        //: When
        Assert.assertTrue(leon instanceof Person);
    }

    @Test
    public void testConstructor(){
        //: Given
        Instructor leon = new Instructor(idNumber);
        String name = "Leon";
        String expected = name + leon.getId();

        //: When
        leon.setName(name);
        String actual = leon.getName() + leon.getId();

        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTeach(){
        //: Given
        Instructor leon = new Instructor(idNumber);
        double teachingHours = 90;
        double expected = 30;


        //: When
        Student donald = new Student(idNumber), jeff = new Student(idNumber), sam = new Student(idNumber);
        Student[] students = {donald, sam, jeff};
        leon.lecture(students, teachingHours);
        double actual = donald.getTotalStudyTime();

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }
}
