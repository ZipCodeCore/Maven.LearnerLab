package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {

    Educator tariq;
    Educator kris;
    Educator leon;
    Educator froilan;
    Educator nu;
    Educator wilhem;

    Student student1;
    Student student2;
    Students instance;

    @Before
    public void setup(){
        tariq =Educator.TARIQ;
        kris = Educator.KRIS;
        leon= Educator.LEON;
        froilan =Educator.FROILAN;
        nu = Educator.NU;
        wilhem =Educator.WILHEM;

        student1 = new Student("Jess",100);
        student2 = new Student("Joe",101);
        instance = Students.getInstance();
        instance.add(student1);
        instance.add(student2);

    }
    @Test
    public void teach() {

        Educator.TARIQ.teach(student1,50);

        double expected = 50;
        double actual = Educator.TARIQ.workHours;

        Assert.assertEquals(expected,actual,0.01);



    }

    @Test
    public void lecture() {

        Educator.KRIS.lecture(instance.getArray(),100);

        double expected = 100;
        double actual = Educator.KRIS.workHours;

        Assert.assertEquals(expected,actual,0.01);
    }
}