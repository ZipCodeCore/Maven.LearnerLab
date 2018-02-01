package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static io.zipcoder.interfaces.Educator.*;

public class TestEducator {


        Educator testEducator = Educator.TARIQ_HOOK;
        Student testStudent = new Student(0, "Phil");

        @Test
        public void testImplementation() {

            boolean expected = true;
            boolean actual = (testEducator instanceof Teacher);

            Assert.assertEquals(expected,actual);

        }

        @Test
        public void testTeach(){

            double expected = 5000;
            testEducator.teach(testStudent, 5000);

            double actual = testStudent.getTotalStudyTime();

            Assert.assertEquals(expected,actual,0);

        }

        @Test
        public void testLecture(){

            Student testStudent2 = new Student(3,"Ted");

            ArrayList<Student> students = new ArrayList<>();
            students.add(testStudent);
            students.add(testStudent2);

            double expected = 50;
            testEducator.lecture(students, 100);
            double actual = testStudent.getTotalStudyTime();

            Assert.assertEquals(expected,actual,0);

        }

    }




