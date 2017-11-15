package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class People<E extends Person> {
    private List<E> peopleList = new ArrayList<E>(128);

    public void add(E person) {
        peopleList.add(person);
    }

    public void remove(E person) {
        peopleList.remove(person);
    }

    public void remove(long id) {
        E personToRemove = null;
        for(E person: peopleList) {
            if(person.getId() == id) {
                personToRemove = person;
            }
        }
        remove(personToRemove);
    }

    public void removeAll() {
        peopleList.clear();
    }

    public E findById(long id) {
        for(E person: peopleList) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public int getCount() {
        return peopleList.size();
    }

    public abstract E[] getArray();

    public List<E> getArrayList() {
        return peopleList;
    };

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
