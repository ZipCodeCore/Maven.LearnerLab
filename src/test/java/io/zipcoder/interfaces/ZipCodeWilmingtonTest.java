package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLectureTest() {
        ZipCodeWilmington currentCohort = ZipCodeWilmington.getINSTANCE();
        Instructor[] currentInstructors = currentCohort.getInstructors().getArray();
        Instructor currentInstructor = currentInstructors[0];
        Student[] currentStudents = currentCohort.getStudents().getArray();

        Double[] initialTotalStudyTime = new Double[currentStudents.length];
        for(int i = 0; i < initialTotalStudyTime.length; i++){
            initialTotalStudyTime[i] = currentStudents[i].getTotalStudyTime();
        }

        currentCohort.hostLecture(currentInstructor, 8);
        boolean actual = true;
        for(int i = 0; i < initialTotalStudyTime.length; i++) {
            if(currentStudents[i].getTotalStudyTime() != 8 + initialTotalStudyTime[i]) {
                actual = false;
                break;
            }
        }

        Assert.assertTrue(actual);
    }

    @Test
    public void hostLectureByIdTest() {
        ZipCodeWilmington currentCohort = ZipCodeWilmington.getINSTANCE();
        Instructor[] currentInstructors = currentCohort.getInstructors().getArray();
        Instructor currentInstructor = currentInstructors[0];
        Student[] currentStudents = currentCohort.getStudents().getArray();

        Double[] initialTotalStudyTime = new Double[currentStudents.length];
        for(int i = 0; i < initialTotalStudyTime.length; i++){
            initialTotalStudyTime[i] = currentStudents[i].getTotalStudyTime();
        }

        currentCohort.hostLecture(currentInstructor.getId(), 8);
        boolean actual = true;
        for(int i = 0; i < initialTotalStudyTime.length; i++) {
            if(currentStudents[i].getTotalStudyTime() != 8 + initialTotalStudyTime[i]) {
                actual = false;
                break;
            }
        }

        Assert.assertTrue(actual);
    }

    @Test
    public void hostLectureEducatorTest() {
        ZipCodeWilmington currentCohort = ZipCodeWilmington.getINSTANCE();
        Educator currentEducator = Educator.DOLIO;
        Student[] currentStudents = currentCohort.getStudents().getArray();

        Double[] initialTotalStudyTime = new Double[currentStudents.length];
        for(int i = 0; i < initialTotalStudyTime.length; i++){
            initialTotalStudyTime[i] = currentStudents[i].getTotalStudyTime();
        }

        currentCohort.hostLecture(currentEducator, 8);
        boolean actual = true;
        for(int i = 0; i < initialTotalStudyTime.length; i++) {
            if(currentStudents[i].getTotalStudyTime() != 8 + initialTotalStudyTime[i]) {
                actual = false;
                break;
            }
        }

        Assert.assertTrue(actual);
    }

}
