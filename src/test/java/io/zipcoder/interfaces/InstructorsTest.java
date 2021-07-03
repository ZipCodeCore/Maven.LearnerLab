package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class InstructorsTest {



    @Test
    public void instructorsTest() {
        //Given
        Student spanky = new Student(69);
        Educator.LEON.teach(spanky,0);
        Educator.TARIQ.teach(spanky,0);
        Educator.FROILAN.teach(spanky,0);



        //When
        int expected = 3;
        int actual = Instructors.getInstance().getCount();

        //Then
        Assert.assertEquals(expected, actual);


    }


}


