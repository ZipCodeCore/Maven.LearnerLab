package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {


    public List<Person> personList = new ArrayList<Person>();


    public void addPerson(Person person) {
        personList.add(person);

    }

    public Person findById(Long id) {
        for (Person person : personList) {
            if (person.getId() == id)
                return person;
        }

        return null;
    }

    public boolean containsPerson(Person person) {
        if (personList.contains(person)) {
            return true;
        }
        return false;
    }

    public void removePerson(Person person) {
        personList.remove(person);
    }

    public void removeById(Long id) {
        for (Person person : personList) {
            if (person.getId() == id)
                personList.remove(person);
        }
    }

    public void removeAllPeople() {
        personList.clear();
    }

    public Integer count() {

        return personList.size();
    }

    public Person[] toArray() {
        Person[] people = personList.toArray(new Person[0]);
        return people;
    }

    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}

