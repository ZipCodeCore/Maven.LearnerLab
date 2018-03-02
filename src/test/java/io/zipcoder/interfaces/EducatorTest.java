package io.zipcoder.interfaces;

import com.sun.tools.javac.code.Type;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EducatorTest
{
    Educator tariq;
    Educator kris;
    Educator nhu;
    Educator leon;
    Educator froilan;
    Educator wilhem;

    Student student1;
    Student student2;
    Student student3;

    Students instance;

    @Before
    public void setup()
    {
        tariq = Educator.TARIQ;
        kris = Educator.KRIS;
        nhu = Educator.NHU;
        leon = Educator.LEON;
        froilan = Educator.FROILAN;
        wilhem = Educator.WILHEM;

        student1 = new Student("Bill", 4L);
        student2 = new Student("Jake", 5L);
        student3 = new Student("Molly", 6L);


        instance = Students.getInstance();

        //the add method is in People which Students extends
        instance.add(student1);
        instance.add(student2);
        instance.add(student3);




    }

    @Test
    public void testTeach() {
        Educator.KRIS.teach(student1, 60);

        double expected = 60;
        double actual = Educator.KRIS.hours;

        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testLecture()
    {
        Educator.TARIQ.lecture(instance.getArray(), 30);

        double expected = 30;
        double actual = Educator.TARIQ.hours;

        Assert.assertEquals(expected, actual, 0);
    }

}
