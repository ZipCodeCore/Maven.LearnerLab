package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLectureTest() {
        ZipCodeWilmington currentCohort = ZipCodeWilmington.getINSTANCE();
        Person[] currentInstructors = currentCohort.getInstructors().getArray();
        Instructor currentInstructor = (Instructor) currentInstructors[0];
        Student[] currentStudents = Arrays.copyOf(currentCohort.getStudents().getArray(), currentCohort.getStudents().getCount(), Student[].class);

        currentCohort.hostLecture(currentInstructor, 8);
        boolean actual = true;
        for(Student student: currentStudents) {
            if(student.getTotalStudyTime() != 8) {
                actual = false;
                break;
            }
        }

        Assert.assertTrue(actual);
    }

    @Test
    public void hostLectureByIdTest() {
        ZipCodeWilmington currentCohort = ZipCodeWilmington.getINSTANCE();
        Person[] currentInstructors = currentCohort.getInstructors().getArray();
        Instructor currentInstructor = (Instructor) currentInstructors[0];
        Student[] currentStudents = Arrays.copyOf(currentCohort.getStudents().getArray(), currentCohort.getStudents().getCount(), Student[].class);

        currentCohort.hostLecture(currentInstructor.getId(), 8);
        boolean actual = true;
        for(Student student: currentStudents) {
            if(student.getTotalStudyTime() != 8) {
                actual = false;
                break;
            }
        }

        Assert.assertTrue(actual);
    }

}
