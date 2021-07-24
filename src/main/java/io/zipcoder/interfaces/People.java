package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>{

    List<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }

    public Person findByID(long id) {
        for (Person person : personList)
            if (person.getId() == id)
                return person;
        return null;
    }

    public boolean contains(Person person) {
        if(personList.contains(person))
            return true;
        return false;
    }

    public void remove(Person person) {
        if(contains(person)) {
            personList.remove(person);
        }
    }

    public void removeById(long id) {
        Person person = findByID(id);
        remove(person);
    }

    public void removeAll() {
        personList.clear();
    }

    public Integer count() {
        return personList.size();
    }

    public Person[] toArray() {
        return (Person[]) personList.toArray();
    }

    public Iterator<Person> iterator() {
        return personList.iterator();
    }

}
