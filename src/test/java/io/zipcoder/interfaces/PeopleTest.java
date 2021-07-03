package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class PeopleTest {

    Instructor smellyPeter;
    Student stinkyPete;
    Student curlyCarlton;
    Student jankyJoe;
    People test;

    @Before
    public void setUp(){
        smellyPeter = new Instructor(10);
        stinkyPete = new Student(20);
        curlyCarlton = new Student(30);
        jankyJoe = new Student(40);
        test = new PeopleConcrete();
    }

    @Test
    public void addTest(){
        //Given
        test.add(smellyPeter);
        test.add(stinkyPete);
        test.add(curlyCarlton);
        test.add(jankyJoe);

        //When
        Person[] expected = {smellyPeter,stinkyPete,curlyCarlton,jankyJoe};
        Person[] actual = test.getArray();

        //Then
        Assert.assertTrue(Arrays.equals(expected,actual));
    }

    @Test
    public void removeByNameTest(){
        //Given
        test.add(smellyPeter);
        test.add(stinkyPete);
        test.add(curlyCarlton);
        test.add(jankyJoe);

        //When
        test.remove(jankyJoe);
        Person[] expected = {smellyPeter,stinkyPete,curlyCarlton};
        Person[] actual = test.getArray();

        //Then
        Assert.assertTrue(Arrays.equals(expected,actual));
    }

    @Test
    public void removeByIDTest(){
        //Given
        test.add(smellyPeter);
        test.add(stinkyPete);
        test.add(curlyCarlton);
        test.add(jankyJoe);

        //When
        test.remove(40);
        Person[] expected = {smellyPeter,stinkyPete,curlyCarlton};
        Person[] actual = test.getArray();

        //Then
        Assert.assertTrue(Arrays.equals(expected,actual));
    }

    @Test
    public void removeAllTest(){
        //Given
        test.add(smellyPeter);
        test.add(stinkyPete);
        test.add(curlyCarlton);
        test.add(jankyJoe);

        //When
        test.removeAll();
        int expected = 0;
        int actual = test.getCount();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findByIDTest(){
        //Given
        test.add(smellyPeter);
        test.add(stinkyPete);
        test.add(curlyCarlton);
        test.add(jankyJoe);

        //When
        Person expected = jankyJoe;
        Person actual = test.findByID(40);

        //Then
        Assert.assertEquals(expected,actual);
    }

}
