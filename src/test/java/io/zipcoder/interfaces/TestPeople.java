package io.zipcoder.interfaces;

import io.zipcoder.interfaces.donald.fountain.classroomLab.People;
import io.zipcoder.interfaces.donald.fountain.classroomLab.Person;
import io.zipcoder.interfaces.donald.fountain.classroomLab.Student;
import io.zipcoder.interfaces.donald.fountain.classroomLab.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    long idNumber1 = 1;
    long idNumber2 = 2;
    long idNumber3 = 3;
    Student donald = new Student(idNumber1);
    Student jeff = new Student(idNumber2);
    Student sam = new Student(idNumber3);
    People zipcode = new People<Person>() {

        @Override
        public Person[] getArray() {
            Person[] students = new Student[personList.size()];
            for(int i = 0; i < personList.size(); i++){
                students[i] = personList.get(i);
            }
            return students;
        }
    };

    @Test
    public void testAdd(){
        //: Given
        zipcode.addPerson(donald);
        zipcode.addPerson(jeff);
        zipcode.addPerson(sam);

        //: When
        Person expected = zipcode.findById(1);

        //: Then
        Assert.assertEquals(donald, expected);
    }

    @Test
    public void testRemove(){
        //: Given
        zipcode.addPerson(donald);
        zipcode.addPerson(jeff);
        zipcode.addPerson(sam);

        //: When
        zipcode.removeByIdNumber(2);

        //: Then
        Assert.assertNull(zipcode.findById(2));
    }

    @Test
    public void testFindBy(){
        zipcode.addPerson(jeff);
        zipcode.addPerson(donald);
        zipcode.addPerson(sam);

        //: When
        //zipcode.findById(0);

        //: Then
        Assert.assertNull(zipcode.findById(0));
    }
}
