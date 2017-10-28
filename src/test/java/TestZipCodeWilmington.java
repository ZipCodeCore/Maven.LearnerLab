import io.zipcoder.interfaces.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestZipCodeWilmington {


    @Before
    public void setUp(){
        ZipCodeWilmington.getInstance();
        Students.getInstance();
        Instructors.getInstance();
    }

    @Test
    public void testHostLecture(){
        Person person1 = Instructors.findById(1);
        Instructor instructor = (Instructor)person1;

        ZipCodeWilmington.hostLecture(instructor, 2500);

        Person person2 = Students.getArray()[1];
        Student student = (Student)person2;

        Double expectedTime = 100d;
        Double actualTime = student.getTotalStudyTime();

        Assert.assertEquals(expectedTime, actualTime);
    }

}
