package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPeople {

    @Test
    public void testAdd() {
        // Given
        List<Person> personList = new ArrayList<>();
        Person person1;

        // When
        personList.add(person1 = new Person(null, "Jawn"));

        // Then
        Assert.assertTrue(personList.contains(person1));
    }

    @Test
    public void testRemove() {
        // Given
        List<Person> personList = new ArrayList<>();
        Person person1;
        Person person2;
        personList.add(person1 = new Person(null, "Jawn"));
        personList.add(person2 = new Person(null, "Jawnay"));

        // When
        personList.remove(person1);

        // Then
        Assert.assertFalse(personList.contains(person1));
        Assert.assertTrue(personList.contains(person2));
    }

    @Test
    public void testFindById() {
        // Given
        Students student = Students.getInstance();
        Long expectedId = 122L;
        String expectedName = "Manny";

        // When
        Student actualStudent = student.findById(122L);
        String actualName = actualStudent.getName();
        Long actualId = actualStudent.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);

    }
}
