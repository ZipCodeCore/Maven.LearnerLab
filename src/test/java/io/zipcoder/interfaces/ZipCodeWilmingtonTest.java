package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLecture() {
        Students studentInstance = Students.getInstance();

        Student student1 = new Student(32401298);
        Student student2 = new Student(22324329);
        Student student3 = new Student(98722112);
        Student student4 = new Student(23424542);
        Student student5 = new Student(32442346);
        Student student6 = new Student(35566742);

        studentInstance.add(student1);
        studentInstance.add(student2);
        studentInstance.add(student3);
        studentInstance.add(student4);
        studentInstance.add(student5);
        studentInstance.add(student6);

        Instructor leon = new Instructor(223234);

        ZipCodeWilmington.hostLecture(leon, 60);

        double expected = 10;
        double actual = student1.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.05);
    }

    @Test
    public void testHostLectureEducator() {
        Students studentInstance = Students.getInstance();

        Student student1 = new Student(32401298);
        Student student2 = new Student(22324329);
        Student student3 = new Student(98722112);
        Student student4 = new Student(23424542);
        Student student5 = new Student(32442346);
        Student student6 = new Student(35566742);

        studentInstance.add(student1);
        studentInstance.add(student2);
        studentInstance.add(student3);
        studentInstance.add(student4);
        studentInstance.add(student5);
        studentInstance.add(student6);

        ZipCodeWilmington.hostLecture(Educator.TARIQ, 60);

        double expected = 10;
        double actual = student1.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.05);
    }

}
