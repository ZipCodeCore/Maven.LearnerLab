package io.zipcoder.interfaces.donald.fountain.classroomLab;

import java.util.ArrayList;


public class People {

    ArrayList<Person> personList = new ArrayList<Person>();

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void removeByName(Person person) {
        personList.remove(person);
    }

    public void removeByIdNumber(long idNumber) {
        for(Person person: personList)
            if(idNumber == person.getId())
        personList.remove(person);
    }

    public Person findById(long idNumber) {
        for (Person person : personList) {
            if (person.getId() == idNumber)
                return person;
        }
        return null;
    }

    public int getCount(ArrayList<Person> people) {
        int count = people.size();
        return count;
    }

    public Person[] getArray(ArrayList<Person> people){
        Person[] personList = (Person[]) people.toArray();
        return personList;
    }

    public void removeAll(ArrayList people){
        people.removeAll(people);
    }
}
