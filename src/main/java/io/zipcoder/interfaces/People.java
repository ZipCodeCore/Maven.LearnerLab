package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class People<E> implements Iterable<E>{

    List<Person> personList;

    public People () {
        this.personList = new ArrayList<>();
    }

    public void add (Person person) {
        personList.add(person);
    }

    public Person findById (long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public Boolean containsPerson (Person person) {
        return personList.contains(person);
    }

    public void removePerson (Person person) {
        personList.remove(person);
    }

    public void removePerson (long id) {

    }

    public void removeAll () {
        personList.removeAll(personList);
    }

    public Integer count () {
        return personList.size();
    }

    public Array[] toArray () {
        return (Array[]) personList.toArray();
    }

    public Iterator<E> iterator() {
        return (Iterator<E>) personList.iterator();
    }

}
