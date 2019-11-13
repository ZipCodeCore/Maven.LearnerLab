package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void getInstanceTest(){

        Students test = Students.getInstance();
        int actual = test.personList.size();

        Assert.assertEquals(2,actual);

    }
    @Test
    public void getInstanceTest2(){

        Students testTwo = Students.getInstance();

        boolean personOne = false;
        boolean personTwo = false;

        for(Person person : testTwo.personList){
            if(person.getId().equals(212242L) && person.getName().equals("Brian"))
                personOne = true;

            if(person.getId().equals(121231L) && person.getName().equals("Kievina"))
                personTwo = true;
        }

        Assert.assertTrue(personOne);
        Assert.assertTrue(personTwo);

    }
}
