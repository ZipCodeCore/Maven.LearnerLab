package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testImplementation() {


        Assert.assertTrue(Educator.ORACLE instanceof Teacher);
    }


    @Test
    public void teach() {
        Educator instructor = Educator.ORACLE;
        Student student = new Student(11, "John");
        Double expected = 8.0;

        instructor.teach(student, 8);
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture() {
        //Given
        Educator instructor = Educator.ORACLE;
        Student student1 = new Student(11, "John");
        Student student2 = new Student(12, "JoJo");
        Student student3 = new Student(13, "Mikey");
        Student student4 = new Student(14, "Blake");

        //When
        Student[] array = {student1, student2, student3, student4};
        instructor.lecture(array, 8);
        Double expected1 = 2.0;
        Double actual1 = student1.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected1, actual1);


    }
}
