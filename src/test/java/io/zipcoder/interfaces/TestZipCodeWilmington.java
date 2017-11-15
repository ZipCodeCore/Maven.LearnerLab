package io.zipcoder.interfaces;

import org.junit.*;

import java.util.Map;

public class TestZipCodeWilmington {

    ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
    Instructors instructors = Instructors.getInstance();
    Students students = Students.getInstance();
    Educator tariq = Educator.TARIQ;

//    @Test
//    public void hostLectureTest() {
//        Map<Student, Double> preStudyMap = zipCodeWilmington.getMap();
//
//        Student preLesson = students.findById(1);
//
//        double studentsPreStudyTime = preStudyMap.get(preLesson);
//
//        double expected = 1.0;
//
//        Assert.assertEquals(expected, studentsPreStudyTime, .01);
        //ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
//        zipCodeWilmington.hostLecture(1,96);
//        double initialTimeWorked = tariq.getTimeWorked();
//        Double expected = 4.0;
//        Student students = ZipCodeWilmington.students.findById(1);
//        tariq.teach(students,4);
//        Double actual = students.getTotalStudyTime();
//        Assert.assertEquals(expected,actual,0);



    @Test
    public void testHostLecture2(){
        zipCodeWilmington.hostLecture(Educator.TARIQ,3.0);
        Assert.assertEquals(3,Educator.TARIQ.getTimeWorked(),0.00);

    }


//    @Test
//    public void hostLectureTest2(){
//        zipCodeWilmington.hostLecture(1, 24);
//
//        Map<Student, Double> postStudyMap = zipCodeWilmington.getMap();
//
//        Student postLesson =  students.findById(1);
//
//        double otherExpected = 1.0;
//
//        double newStudentsTotalStudyTime = postStudyMap.get(postLesson);
//
//        Assert.assertEquals(otherExpected, newStudentsTotalStudyTime, .01);
//    }

}