package App;

import io.zipcoder.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZipCodeWilmingtonTest {
    @Test
    public void hostLectureTest() {

        Instructors instructors = Instructors.getInstance();
        ;
        Students students = Students.getInstance();
        ZipCodeWilmington.getInstance().hostLecture(5, 120);

        Student student4 = (Student) students.findById(2);
        Student student5 = (Student) students.findById(6);
        Student student6 = (Student) students.findById(28);

        double expected = 4.0;
        double actual = student4.getTotalStudyTime();
        double actual2 = student5.getTotalStudyTime();
        double actual3 = student6.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.1);
        Assert.assertEquals(expected, actual2, 0.1);
        Assert.assertEquals(expected, actual3, 0.1);

    }
}
