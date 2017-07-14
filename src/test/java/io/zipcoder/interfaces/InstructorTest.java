package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InstructorTest {

    private Instructor Laurent;

    @Before
    public void initialize(){
        this.Laurent = new Instructor("Laurent");
    }

    @Test
    public void testImplementation() {
        Assert.assertTrue(Laurent instanceof Teacher);
    }


    @Test
    public void testInheritance() {
        Assert.assertTrue(Laurent instanceof Person);
    }

    @Test
    public void testTeach() {

        Student student = new Student("Jade");
        Laurent.teach(student, 20);

        //ask leon how to test this, if possible.
    }

    @Test
    public void testLecture() {
        Student[] student = {
                new Student("Laurent"),
                new Student("Kes"),
                new Student("Harry")
        };

        Laurent.lecture(student,50);
    }
}
