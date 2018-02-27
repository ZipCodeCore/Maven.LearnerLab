package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PeopleTest {

    Instructor toughTariq;
    Student determinedDan;
    Student eliteEric;
    Student gentleJoe;
    People test;


@Before
    public void setUp() {
    toughTariq = new Instructor(45);
    determinedDan = new Student(1);
    eliteEric = new Student(2);
    gentleJoe = new Student(5);
    test = new People();

}

@Test
    public void testAdd() {
    //Given
    test.addPerson(toughTariq);
    test.addPerson(determinedDan);
    test.addPerson(eliteEric);
    test.addPerson(gentleJoe);


    //When
    Person[] expected = {toughTariq, determinedDan, eliteEric, gentleJoe};
    Person[] actual = test.getArray();


    //Then
    Assert.assertTrue(Arrays.equals(expected, actual));

}

@Test
    public void testRemovePerson() {

    //Given
    test.addPerson(toughTariq);
    test.addPerson(determinedDan);
    test.addPerson(eliteEric);
    test.addPerson(gentleJoe);
    test.removePerson(toughTariq);


    //When
    Person[] expected = {determinedDan, eliteEric, gentleJoe};
    Person[] actual = test.getArray();


    //Then
    Assert.assertTrue(Arrays.equals(expected, actual));
}

@Test
    public void testFindById() {
    //Given
    test.addPerson(toughTariq);
    test.addPerson(determinedDan);
    test.addPerson(eliteEric);
    test.addPerson(gentleJoe);


    //When
    Person expected = determinedDan;
    Person actual = test.findById(1);

    //Then
    Assert.assertEquals(expected, actual);


}

    @Test
    public void testRemoveAll() {

        //Given
        test.addPerson(toughTariq);
        test.addPerson(determinedDan);
        test.addPerson(eliteEric);
        test.addPerson(gentleJoe);
        test.removeAll();


        //When
        Person[] expected = {};
        Person[] actual = test.getArray();


        //Then
        Assert.assertTrue(Arrays.equals(expected, actual));
    }


}