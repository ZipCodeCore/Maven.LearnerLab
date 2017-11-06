package io.zipcoder.interfaces;

//Part 7.0 - Test Students singleton
//
//        Create a TestStudents class.
//        Create a test method which ensures that each of the students in your current cohort are in your Students
//        singleton.

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class StudentsTest {


    @Test
    public void StudentsINSTANCETest(){

    Students cohort = Students.getINSTANCE();

    Student lina = new Student(1231, "Lina");
    Student abrar = new Student(1232, "Abrar");
    Student raul = new Student(1235, "Raul");
    cohort.addPerson(raul);
    cohort.addPerson(lina);
    cohort.addPerson(abrar);

    Students anotherCohort = Students.getINSTANCE();

    Student kathryn = new Student(1237, "Kathryn");
    Student andrea = new Student(1238, "Andrea");
    Student gabriela = new Student(1239, "Gabriela");
    anotherCohort.addPerson(kathryn);
    anotherCohort.addPerson(andrea);
    anotherCohort.addPerson(gabriela);

    int expected = 6;
    int actual = cohort.getArray().length;

    Assert.assertEquals(expected,actual);


    }
}
