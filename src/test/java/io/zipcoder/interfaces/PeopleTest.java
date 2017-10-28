package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PeopleTest {

    @Test
    public void addPersonTest() {
        People studyGroup = new People();
        Student student1 = new Student(2, "name");
        Student student2 = new Student(3, "name");
        studyGroup.add(student1);
        studyGroup.add(student2);

        Student[] expected = {student1, student2};
        Student[] actual = Arrays.copyOf(studyGroup.getArray(), studyGroup.getCount(), Student[].class);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removePersonTest() {
        People studyGroup = new People();
        Student student1 = new Student(2, "name");
        Student student2 = new Student(3, "name");
        Student student3 = new Student(4, "name");
        studyGroup.add(student1);
        studyGroup.add(student2);
        studyGroup.add(student3);

        studyGroup.remove(student2);

        Student[] expected = {student1, student3};
        Student[] actual = Arrays.copyOf(studyGroup.getArray(), studyGroup.getCount(), Student[].class);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removePersonByIdTest() {
        People studyGroup = new People();
        Student student1 = new Student(2, "name");
        Student student2 = new Student(3, "name");
        Student student3 = new Student(4, "name");
        studyGroup.add(student1);
        studyGroup.add(student2);
        studyGroup.add(student3);

        studyGroup.remove(2);

        Student[] expected = {student2, student3};
        Student[] actual = Arrays.copyOf(studyGroup.getArray(), studyGroup.getCount(), Student[].class);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removePersonByIdNoIdFoundTest() {
        People studyGroup = new People();
        Student student1 = new Student(2, "name");
        Student student2 = new Student(3, "name");
        Student student3 = new Student(4, "name");
        studyGroup.add(student1);
        studyGroup.add(student2);
        studyGroup.add(student3);

        studyGroup.remove(10);

        Student[] expected = {student1, student2, student3};
        Student[] actual = Arrays.copyOf(studyGroup.getArray(), studyGroup.getCount(), Student[].class);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAllTest() {
        People studyGroup = new People();
        Student student1 = new Student(2, "name");
        Student student2 = new Student(3, "name");
        Student student3 = new Student(4, "name");
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
        People studyGroup = new People();
        Student student1 = new Student(2, "name");
        Student student2 = new Student(3, "name");
        studyGroup.add(student1);
        studyGroup.add(student2);

        Student expected = student1;
        Student actual = (Student) studyGroup.findById(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findByIdReturnsNullTest() {
        People studyGroup = new People();
        Student student1 = new Student(2, "name");
        Student student2 = new Student(3, "name");
        studyGroup.add(student1);
        studyGroup.add(student2);

        Student expected = null;
        Student actual = (Student) studyGroup.findById(4);

        Assert.assertEquals(expected, actual);
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
        for(Person student: array) {
            if(student.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
