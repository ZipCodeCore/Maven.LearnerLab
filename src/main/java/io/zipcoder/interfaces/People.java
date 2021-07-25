package io.zipcoder.interfaces;

import java.util.*;

public abstract class People <SomePerson extends Person> implements Iterable<Person> {

    List<SomePerson> personList = new ArrayList<>();

    public void add(SomePerson person) {
        personList.add(person);
    }

    public SomePerson findById(long id) {
        for (SomePerson person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public boolean contains(SomePerson person) {
        for (SomePerson personToLookFor : personList) {
            if (personToLookFor.getId() == person.getId()
            && personToLookFor.getName().equals(person.getName())) {
                return true;
            }
        }
        return false;
    }

    public void remove(SomePerson person) {
        personList.remove(person);
    }

    public void remove(long id) {
        remove(findById(id));
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public abstract SomePerson[] toArray();

    public Iterator<Person> iterator() {
        Iterator iterator = personList.iterator();
        return iterator;
    }
}
