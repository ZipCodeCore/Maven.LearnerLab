package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends Person> {

    protected ArrayList<E> personList;

    public People() {
        this.personList = new ArrayList<E>();
    }

    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        for (E person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void removeByPerson(Person person) {
        personList.remove(person);
    }

    public void removeById(long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                personList.remove(person);
                break;
            }
        }
    }

    public int getCount() {
        return personList.size();
    }

    public abstract E[] getArray();
    // Modified in part 10
//    public Person[] getArray() {
//        Person[] personArray = new Person[personList.size()];
//        personArray = personList.toArray(personArray);
//        return personArray;
//    }

    public void removeAll() {
        personList.clear();
    }

}
