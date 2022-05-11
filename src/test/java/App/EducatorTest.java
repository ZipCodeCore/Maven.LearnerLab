package App;

import io.zipcoder.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {

    @Test
    public void testImplementation() {
        Assert.assertTrue(Educator.Tariq instanceof Teacher);
        Assert.assertTrue(Educator.Froilan instanceof Teacher);
        Assert.assertTrue(Educator.Kris instanceof Teacher);
        Assert.assertTrue(Educator.Leon instanceof Teacher);
        Assert.assertTrue(Educator.Nhu instanceof Teacher);
        Assert.assertTrue(Educator.Wilhem instanceof Teacher);
    }

    @Test
    public void testTeach() {
        Student student = new Student(10);
        Educator.Tariq.teach(student, 10);

        double expected = 10;
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testLecture() {
        Student student1 = new Student(11);
        Student student2 = new Student(12);
        Student student3 = new Student(13);

        Student[] students = new Student[3];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        Educator.Froilan.lecture(students, 45);

        double expected = 15;
        double actual1 = student1.getTotalStudyTime();
        double actual2 = student2.getTotalStudyTime();
        double actual3 = student3.getTotalStudyTime();

        Assert.assertEquals(expected, actual1, 0.1);
        Assert.assertEquals(expected, actual2, 0.1);
        Assert.assertEquals(expected, actual3, 0.1);

    }
}
