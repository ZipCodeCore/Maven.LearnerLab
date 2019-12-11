package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class ZipCodeWilmingtonTest {
//    Double numberOfHours;
//    Double totalStudyTime;
//    Students students = Students.getInstance();
//    //Instructors instructors = Instructors.getInstance();
//    Teacher teacher;
//    Student student;
//    ZipCodeWilmington zipCodeWilmington;

    @Before
    public void setUp() throws Exception {
        Students students = Students.getInstance();
        for (Student student : students){
            student.setTotalStudyTime(0.0);
        }


    }

    @Test
    public void testHostLecture() {
        Student student = Students.getInstance().findById(2L);
        Instructor myInstructor = Instructors.getInstance().findById(2L);
        ZipCodeWilmington.hostLecture(myInstructor, 35D);
        Double expected = 1D;
        Map<Student, Double> studyMap = ZipCodeWilmington.getStudyMap();
        Double actual = studyMap.get(student);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSingleton() {
        Student student = Students.getInstance().findById(2L);
        Instructor myInstructor = Instructors.getInstance().findById(2L);
        ZipCodeWilmington.hostLecture(myInstructor, 35D);
        Map<Student, Double> studyMap = ZipCodeWilmington.getStudyMap();
        StringBuilder output = new StringBuilder();
        for (Student someStudent : studyMap.keySet()) {
            output.append(String.format("%s\t%s\n", someStudent.getName(), studyMap.get(someStudent)));
        }
        String actual = output.toString();
        String expected = "STUDENT0\t1.0\n" + "STUDENT1\t1.0\n" + "STUDENT2\t1.0\n" + "STUDENT3\t1.0\n" +
                "STUDENT4\t1.0\n" + "STUDENT5\t1.0\n" + "STUDENT6\t1.0\n" + "STUDENT7\t1.0\n" + "STUDENT8\t1.0\n" +
                "STUDENT9\t1.0\n" + "STUDENT10\t1.0\n" + "STUDENT11\t1.0\n" + "STUDENT12\t1.0\n" + "STUDENT13\t1.0\n" +
                "STUDENT14\t1.0\n" + "STUDENT15\t1.0\n" + "STUDENT16\t1.0\n" + "STUDENT17\t1.0\n" + "STUDENT18\t1.0\n" +
                "STUDENT19\t1.0\n" + "STUDENT20\t1.0\n" + "STUDENT21\t1.0\n" + "STUDENT22\t1.0\n" + "STUDENT23\t1.0\n" +
                "STUDENT24\t1.0\n" + "STUDENT25\t1.0\n" + "STUDENT26\t1.0\n" + "STUDENT27\t1.0\n" + "STUDENT28\t1.0\n" +
                "STUDENT29\t1.0\n" + "STUDENT30\t1.0\n" + "STUDENT31\t1.0\n" + "STUDENT32\t1.0\n" + "STUDENT33\t1.0\n" + "STUDENT34\t1.0\n";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hostLectureByEnum () {
        Student student = Students.getInstance().findById(2L);
        Educator educator = Educator.ROBERTO;
        ZipCodeWilmington.hostLecture(educator, 35D);
        Double expected = 1D;
        Map<Student, Double> studyMap = ZipCodeWilmington.getStudyMap();
        Double actual = studyMap.get(student);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hostLectureByEnumId () {
        Student student = Students.getInstance().findById(2L);
        ZipCodeWilmington.hostLectureById(4L, 35D);
        Double expected = 1D;
        Map<Student, Double> studyMap = ZipCodeWilmington.getStudyMap();
        Double actual = studyMap.get(student);
        Assert.assertEquals(expected, actual);
    }

}
