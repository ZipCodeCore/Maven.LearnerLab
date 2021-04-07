package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople {
    @Test
    public void testAdd(){
        Student mike =new Student(309423809);
        Student pete = new Student(3244);
        People test = new PeopleConcrete();

        test.add(mike);
        test.add(pete);
        Person[] expected = {mike, pete};
        Person[] actual = test.getArray();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemove(){
        Student craig = new Student(53244);
        Student mike =new Student(309423809);
        Student pete = new Student(3244);
        People test = new PeopleConcrete();
        test.add(craig);
        test.add(mike);
        test.add(pete);
        test.remove(pete);
        Person[] expected = {craig, mike};
        Person[] actual = test.getArray();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFindById(){
        Student mike =new Student(309423809);
        Student pete = new Student(324412312);
        PeopleConcrete test = new PeopleConcrete();
        test.add(mike);
        test.add(pete);
        Person expected = mike;
        Person actual = test.findById(309423809);
        Assert.assertEquals(expected, actual);
    }
}
