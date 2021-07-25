package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

/**
 * Create a testImplementation method that asserts that an Instructor is an instanceof a Teacher.
 * Create a testInheritance method that asserts that a Instructor is an instanceof a Person.
 * Create a testTeach method that ensures when an Instructor invokes the teach method, a respective
 *      student's totalStudyTime instance variable is incremented by the specified numberOfHours.
 * Create a testLecture method that ensures when an Instructor invokes the lecture method, a respective
 *      array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.
 */
public class EducatorTest {
    @Test
    public void testTeacherImplementation(){
        Educator leon = Educator.LEON;
        Assert.assertTrue(leon instanceof Teacher);
    }

//    @Test
//    public void testPersonInheritance(){
//        Educator dolio = Educator.DOLIO;
//        Assert.assertTrue(dolio instanceof Person);
//    }

    @Test
    public void testTeach(){
        //given
        Educator dolio = Educator.DOLIO;
        Students students = Students.getInstance();
        Student nate = students.findById(0);
        //when
        dolio.teach(nate,5.0);
        Double expected = 5.0;
        Double actual = nate.getTotalStudyTime();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testLecture(){
        //given
        Educator kris = Educator.KRIS;
        Student[] ourClass = Students.getInstance().toArray();
        //when
        kris.lecture(ourClass,20.0);
        Double actual = Students.getInstance().findById(0).getTotalStudyTime();
        Double expected = 5.0;
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testLectureUsingEducator(){
        //given
        Educator leon = Educator.LEON;
        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
        //when
        zcw.hostLecture(leon,20.0);
        Map<Student, Double> studyMap =  ZipCodeWilmington.getStudyMap();
        Double actual = studyMap.get(ZipCodeWilmington.getStudents().findById(0));
        Double expected = 5.0;
        Double actualTeachTime = leon.getTimeWorked();
        Double expectedTeachTime = 20.0;
        //then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedTeachTime,actualTeachTime);
    }

}
