package io.zipcoder.interfaces;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEducators {


    @Test
    public void testImplementation(){
        Assert.assertTrue(Educator.KRIS instanceof Teacher);
    }
    @Test
    public void testTimeWorked(){
        Student s1 = new Student(8);
        Student s2 = new Student(9);
        Student s3 = new Student(10);
        //create new array bc the method lecture takes in a "learner []"

        Student[] stuArr = new Student[3];
        stuArr[0] = s1;
        stuArr[1] = s2;
        stuArr[2] = s3;
        // entered new students into array in order for them to be lectured

        double numOfHoursWorkedBeforeLecturing = Educator.TARIQ.getTimeWorked();
        Educator.TARIQ.lecture(stuArr, 9);
        double numOfHoursWorkedAfterLecturing = Educator.TARIQ.getTimeWorked();
        Assert.assertEquals(numOfHoursWorkedBeforeLecturing, numOfHoursWorkedAfterLecturing, 0);

    }

    @Test
    public void testTeach(){
        Student jess = new Student(4);
        Educator.NHU.teach(jess, 8);
        // Syntax for how to call an ENUM Class Method
    }
    @Test
    public void testLecture(){
        Student student1 = new Student(1);
        Student student2 = new Student(2);
        Student student3 = new Student(3);
        //create three new students for array

        Student[] stuArr = {student1, student2, student3};
        //create new student array with students in it

        double numberOfHoursOfLecture = 9;
        Educator.LEON.lecture(stuArr, numberOfHoursOfLecture);

        double expected = 3;
        double actual = student1.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 3);
    }

}
