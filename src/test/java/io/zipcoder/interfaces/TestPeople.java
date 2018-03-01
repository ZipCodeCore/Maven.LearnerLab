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
        test.remove(3244);
        Person[] expected = {craig, mike, null};
        Person[] actual = test.getArray();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFindById(){
        Student mike =new Student(309423809);
        Student pete = new Student(3244);
        People test = new PeopleConcrete();
        test.add(mike);
        test.add(pete);
        Person expected = pete;
        Person actual = test.findById(3244);
        Assert.assertEquals(expected, actual);
    }
}
