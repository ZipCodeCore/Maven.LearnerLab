package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

    protected ArrayList<Person> personList;

    public People() {
        this.personList = new ArrayList<Person>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        for (Person person : personList) {
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

    public Person[] getArray() {
        Person[] personArray = new Person[personList.size()];
        personArray = personList.toArray(personArray);
        return personArray;
    }

    public void removeAll() {
        personList.clear();
    }

}
