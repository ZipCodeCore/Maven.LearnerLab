package io.zipcoder.interfaces;

import java.util.*;

public abstract class People <E extends Person>{
    ArrayList<E> personList = new ArrayList<E>();

    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        for (E person : personList) {
            if (person.getId() == id)
                return person;
        }
        return null;
    }

    public void remove(E person) {
        if (personList.contains(person)) personList.remove(person);
    }

    public void remove(long id) {
//        Person personRemove = null;
//        for (Person person : personList) {
//            if (person.getId() == id) personRemove = person;
//        }
//        personList.remove(personRemove);
//    }
        //regular for loop will work with the remove method better
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId() == id) personList.remove(personList.get(i));
        }
    }


    public int getCount() {
        return personList.size();
    }

    public abstract E[] getArray();
       // return personList.toArray(new Person[personList.size()]);


    public void removeAll() {
        personList.clear();
    }
}
