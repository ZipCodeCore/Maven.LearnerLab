package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

//    private Instructor tariq;
    private Instructor froilan;
    private Instructor leon;
    private Instructor wilhem;
    private Instructors testInstructors;
    private Student marky;
    private Student ricky;
    private Student danny;
    private Student terri;
    private Students testStudents;
    private ZipCodeWilmington testZcw;

    @Before
    public void setup() {
//        tariq = new Instructor(1);
        froilan = new Instructor(2);
        leon = new Instructor(3);
        wilhem = new Instructor(4);
        testInstructors = Instructors.getInstance();
//        testInstructors.add(tariq);
        testInstructors.add(froilan);
        testInstructors.add(leon);
        testInstructors.add(wilhem);
        marky = new Student(11);
        ricky = new Student(12);
        danny = new Student(13);
        terri = new Student(14);
        testStudents = Students.getInstance();
        testStudents.add(marky);
        testStudents.add(ricky);
        testStudents.add(danny);
        testStudents.add(terri);
        testZcw = ZipCodeWilmington.getInstance();
    }

    @Test
    public void zipCodeWilmingtonTest1() {
        testZcw.hostLecture(Educator.TARIQ, 100);
        double expected = 25;
        double actual = ricky.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.005);
    }


}
