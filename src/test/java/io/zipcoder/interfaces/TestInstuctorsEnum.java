package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstuctorsEnum {

    @Test
     public void testImplementation() {
        //given
        Educator instructor = Educator.KRIS;

        //then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testLecture(){
        //given
        Educator educator = Educator.LEON;
        Double hourstaught = 34.0;
        Student[] zipcoders = Students.getInstance().getArray();

        //when
        educator.lecture(zipcoders, hourstaught);
        Student testStudent = Students.getInstance().findById(645L);
        Double actual = testStudent.getTotalStudyTime();
        Double expected = 2.0;

        //
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testTeach(){
        //given
        Educator educator = Educator.DOLIO;
        Double expected = 3.0;
        Student student1 = new Student(34L, "Yasmine");
        Student student2 = new Student(45L, "Ssst");

        //when
        educator.teach(student1, 1.5);
        educator.teach(student2, 1.5);

        //then
        Double actual = educator.getTimeWorked();
        Assert.assertEquals(expected, actual);


    }

//    public void testInheritance(){
//        //given
//        Educator instructor = Educator.DOLIO;
//
//        //then
//        Assert.assertTrue(instructor instanceof  Person);
//    }
}
