package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {


    @Test
    public void addTest(){
        Student personOne = new Student(398429847L, "Brian");
        Students newPeople = Students.getInstance();
        newPeople.add(personOne);

        Assert.assertTrue(newPeople.contains(personOne));
    }

    @Test
    public void removebyIDTest(){
        Students newPeople = Students.getInstance();
        Student personOne = new Student(398429847L, "Brian");
        Student personTwo = new Student(242487613L, "Mike");

        newPeople.add(personOne);
        newPeople.add(personTwo);
        newPeople.removeById(242487613L);

        Assert.assertFalse(newPeople.contains(personTwo));
    }

    @Test
    public void removeAllTest(){
        Students newPeople = Students.getInstance();
        Student personOne = new Student(398429847L, "Brian");
        Student personTwo = new Student(242487613L, "Mike");

        int expectedPeeps = 0;
        newPeople.add(personOne);
        newPeople.add(personTwo);
        newPeople.removeAll();
        int actualPeeps = newPeople.count();

        Assert.assertEquals(expectedPeeps, actualPeeps);
    }


    @Test
    public void findByIdTest(){
        Students newPeople = Students.getInstance();
        Student personOne = new Student(398429847L, "Brian");

        long expectedPersonById = 398429847L;
        newPeople.add(personOne);
        long actualPersonById = personOne.getId();

        Assert.assertEquals(expectedPersonById, actualPersonById);
    }

}
