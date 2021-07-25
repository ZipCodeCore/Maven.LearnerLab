package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class TestPeople {

    @After
    public void tearDown() {
        Students students = Students.getInstance();
        students.remove(30);
        students.remove(40);
        students.remove(50);
    }

    @Test
    public void addTest() {
        // Given
        Students students = Students.getInstance();
        Student personNamedBill = new Student(30, "Bill");
        Student personNamedAllen = new Student(40, "Allen");
        Student personNamedTom = new Student(50, "Tom");
        List<Student> expectedListOfPeople = new ArrayList<>(Arrays.asList(
                personNamedBill, personNamedAllen, personNamedTom));

        // When
        students.add(personNamedBill);
        students.add(personNamedAllen);
        students.add(personNamedTom);
        List<Student> actualListOfPeople = new ArrayList<>(Arrays.asList(students.findById(30), students.findById(40), students.findById(50)));

        // Then
        Assert.assertEquals(expectedListOfPeople, actualListOfPeople);
    }

    @Test
    public void findByIdTest() {
        // Given
        Students students = Students.getInstance();
        Student personNamedBill = new Student(30, "Bill");
        Student expectedPersonNamedAllen = new Student(40, "Allen");
        Student personNamedTom = new Student(50, "Tom");
        Long allensId = expectedPersonNamedAllen.getId();

        // When
        students.add(personNamedBill);
        students.add(expectedPersonNamedAllen);
        students.add(personNamedTom);
        Student actualPersonNamedAllen = students.findById(allensId);

        // Then
        Assert.assertEquals(expectedPersonNamedAllen, actualPersonNamedAllen);
    }

    @Test
    public void removeTest() {
        // Given
        Students students = Students.getInstance();
        Student personNamedBill = new Student(30, "Bill");
        Student personNamedAllen = new Student(40, "Allen");
        Student personNamedTom = new Student(50, "Tom");
        List<Student> expectedListOfPeople = new ArrayList<>(Arrays.asList(
                personNamedBill, personNamedAllen));
        Integer expectedNumberOfPeople = 20;

        // When
        Integer actualNumberOfPeople = (students.personList.size()) + 2;
        students.add(personNamedBill);
        students.add(personNamedAllen);
        students.add(personNamedTom);
        students.remove(personNamedTom);
        List<Student> actualListOfPeople = new ArrayList<>(Arrays.asList(students.findById(30), students.findById(40), students.findById(50)));

        // Then
        Assert.assertEquals(expectedNumberOfPeople, actualNumberOfPeople);
    }
}
