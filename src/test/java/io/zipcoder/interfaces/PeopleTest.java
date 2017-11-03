package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PeopleTest {

    Students studyGroup;
    Student student1;
    Student student2;
    Student student3;

    @Before
    public void initialize() {
        studyGroup = Students.getInstance();
        student1 = new Student(2, "name");
        student2 = new Student(3, "name");
        student3 = new Student(4, "name");
    }

    @Test
    public void addPersonTest() {
        studyGroup.add(student1);
        studyGroup.add(student2);

        Student[] expected = {student1, student2};
        Student[] actual = studyGroup.getArray();

        Assert.assertEquals(expected, actual);

        studyGroup.remove(student1);
        studyGroup.remove(student2);
        // studyGroup empty at end of test
    }

    @Test
    public void removePersonTest() {
        studyGroup.add(student1);
        studyGroup.add(student2);
        studyGroup.add(student3);

        studyGroup.remove(student2);

        Student[] expected = {student1, student3};
        Student[] actual = {studyGroup.getArray()[studyGroup.getCount() - 2], studyGroup.getArray()[studyGroup.getCount() - 1]};

        Assert.assertEquals(expected, actual);

        studyGroup.remove(student1);
        studyGroup.remove(student3);
        // studyGroup empty at end of test
    }

    @Test
    public void removePersonByIdTest() {
        studyGroup.add(student1);
        studyGroup.add(student2);
        studyGroup.add(student3);

        studyGroup.remove(2);

        Student[] expected = {student2, student3};
        Student[] actual = {studyGroup.getArray()[studyGroup.getCount() - 2], studyGroup.getArray()[studyGroup.getCount() - 1]};

        Assert.assertEquals(expected, actual);

        studyGroup.remove(student1);
        studyGroup.remove(student3);
        // studyGroup empty at end of test
    }

    @Test
    public void removePersonByIdNoIdFoundTest() {
        studyGroup.add(student1);
        studyGroup.add(student2);

        studyGroup.remove(10);

        Student[] expected = {student1, student2};
        Student[] actual = {studyGroup.getArray()[studyGroup.getCount() - 2], studyGroup.getArray()[studyGroup.getCount() - 1]};

        Assert.assertEquals(expected, actual);

        studyGroup.remove(student1);
        studyGroup.remove(student2);
        // studyGroup empty at end of test
    }

//    Students is singleton, don't use removeall method
//    in testing, it will break tests in the students test
//    class because you cannot create a new instance of
//    the students class

    @Test
    public void removeAllTest() {
        studyGroup.add(student1);
        studyGroup.add(student2);
        studyGroup.add(student3);

        studyGroup.removeAll();

        int expected = 0;
        int actual = studyGroup.getCount();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void findByIdTest() {
        studyGroup.add(student1);
        studyGroup.add(student2);

        Student expected = student1;
        Student actual = studyGroup.findById(2);

        Assert.assertEquals(expected, actual);

        studyGroup.remove(student1);
        studyGroup.remove(student2);
        // studyGroup empty at end of test
    }

    @Test
    public void findByIdReturnsNullTest() {
        studyGroup.add(student1);
        studyGroup.add(student2);

        Student expected = null;
        Student actual = studyGroup.findById(4);

        Assert.assertEquals(expected, actual);

        studyGroup.remove(student1);
        studyGroup.remove(student2);
        // studyGroup empty at end of test
    }

    public boolean allNamesInArray(String[] names, Person[] array) {
        for(String name: names) {
            if(!isNameInArray(name, array)) {
                return false;
            }
        }
        return true;
    }

    public boolean isNameInArray(String name, Person[] array) {
        for(Person person: array) {
            if(person.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
