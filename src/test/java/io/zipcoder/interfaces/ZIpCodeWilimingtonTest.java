package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZIpCodeWilimingtonTest {

    @Test
    public void testHostLecture(){
        Students students = Students.getINSTANCE();
        Instructors instructors = Instructors.getINSTANCE();
        ZipCodeWilmington zipcoders = ZipCodeWilmington.getINSTANCE();

        double expected = 3;

        Student student1 = new Student(98);
        Student student2 = new Student(43);
        Instructor instructor = new Instructor(123);


        students.addPerson(student1);
        students.addPerson(student2);
     //   instructors.addPerson(instructor);


        zipcoders.hostLecture(instructor, 6);

        double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);

    }
}
