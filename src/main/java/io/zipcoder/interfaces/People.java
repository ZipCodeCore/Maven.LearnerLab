package io.zipcoder.interfaces;

import java.security.PublicKey;
import java.util.ArrayList;

//public class People {         before part 10

        // part 10 change
    public abstract class People <E extends Person> {

    //  ArrayList<Person> personList = new ArrayList<Person>();     before part 10
            ArrayList<E> personList = new ArrayList<E>();           // part 10

    public void add(E person) {     // changed Person to E
        personList.add(person);
    }

    public E findByID(long id) {           // changed Person to E
        for (E person : personList) {
            if (person.getId() == id) {     // getId from person class
                return person;
            }
        }
        return null;
    }


    public void remove(E person) {      // changed Person to E
        personList.remove(person);
    }

    public void remove(long id) {
        personList.remove(id);
    }

    public int getCount() {
        return personList.size();
    }

    public abstract E[] getArray(); /* {
        Person[] personArray = new Person[personList.size()];
        for(int i = 0; i < personArray.length; i++) {
            personArray[i] = personList.get(i);
        }
        return personArray;
    }       */           // before part 10


    public void removeAll() {
        personList.clear();
    }




}