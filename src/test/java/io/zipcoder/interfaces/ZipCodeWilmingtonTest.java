package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
        public void hostLectureTest(){
        Students instance = Students.getInstance();
        Student student = new Student(345);
        Student student1 = new Student( 456);
        instance.add(student);
        instance.add(student1);
        Instructors instructors = Instructors.getInstance();
        Instructor instructor = new Instructor(344);
        instructors.add(instructor);
        ZipCodeWilmington.getInstance().hostLecture(344, 10);

        double expected =  instance.getArray()[0].getTotalStudyTime();
        double actual = instance.getArray()[1].getTotalStudyTime();

        Assert.assertEquals(expected,actual, .001);


    }

    @Test
    public void hostLectureTest1(){
        //Given

        ZipCodeWilmington.getInstance().hostLecture(Educator.FROILAN, 30);


        //When
        double expected = 30;
        double actual = Educator.FROILAN.getTimeWorked();

        //Then
        Assert.assertEquals(expected, actual, .001);
    }
}












