package io.zipcoder.singletons;

import io.zipcoder.Educator;
import io.zipcoder.Student;
import io.zipcoder.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    ZipCodeWilmington zcw;

    @Before
    public void setup(){
        zcw = new ZipCodeWilmington();
    }

    @Test
    public void hostLectureByTeacherTest(){
        Teacher tariq = (Teacher)zcw.instructors.getArray()[0];
        Student tempStudent = (Student)zcw.students.getArray()[0];
        double expected = tempStudent.getTotalStudyTime() + 1;
        zcw.hostLecture(tariq, 8);
        double actual = tempStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void hostLectureByIDTest(){
        Student tempStudent = (Student)zcw.students.getArray()[0];
        double expected = tempStudent.getTotalStudyTime() + 1;
        zcw.hostLecture(0000L, 8);
        double actual = tempStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void hostLectureByEducatorTest(){
        Student tempStudent = zcw.students.getArray()[0];
        double expected = tempStudent.getTotalStudyTime() + 1;
        zcw.hostLecture(Educator.TARIQ, 8);
        double actual = tempStudent.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void hostLectureByEducatorHoursTest(){
        double expected = Educator.TARIQ.getTimeWorked() + 8;
        zcw.hostLecture(Educator.TARIQ, 8);
        double actual = Educator.TARIQ.getTimeWorked();
        Assert.assertEquals(expected, actual, 0);
    }

}
