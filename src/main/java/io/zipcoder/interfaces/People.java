package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class People {
    private List<Person> peopleList = new ArrayList<Person>(128);

    public void add(Person person) {
        peopleList.add(person);
    }

    public void remove(Person person) {
        peopleList.remove(person);
    }

    public void remove(long id) {
        Person personToRemove = null;
        for(Person person: peopleList) {
            if(person.getId() == id) {
                personToRemove = person;
            }
        }
        remove(personToRemove);
    }

    public void removeAll() {
        peopleList.clear();
    }

    public Person findById(long id) {
        for(Person person: peopleList) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public int getCount() {
        return peopleList.size();
    }

    public Person[] getArray() {
        return peopleList.toArray(new Person[getCount()]);
    }

    public long assignNextId() {
        Random rand = new Random();
        long nextId;
        do {
            nextId = rand.nextLong();
            if(nextId < 0) {
                nextId *= -1;
            }
        } while(this.findById(nextId) != null);

        return nextId;
    }
}
