package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People<E> {
    ArrayList<Person> personList = new ArrayList<Person>();


    public void add(Person aPerson){
        personList.add(aPerson);
    }

    public Person findById(long id){
        for (Person aPerson : personList) {
            if (aPerson.id == id) {
                return aPerson;
            }
        }
        return null;
    }

    public void remove(Person person) {
        for (Person aPerson : personList) {
            if (person.equals(aPerson)) {
                personList.remove(aPerson);
            }
        }
    }

    public void remove(long id) {
        for (Person aPerson : personList) {
            if (aPerson.id == id) {
                personList.remove(aPerson);
            }
        }
    }

    public int getCount() {
        return personList.size();
    }

    public Person[] getArray(){

        Person[] arrayPersonList = personList.toArray(new Person[personList.size()]);

        return arrayPersonList;
    }

    public void removeAll() {
        personList.removeAll(personList);
    }
}
