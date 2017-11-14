package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

    //private
    ArrayList<Person> personList = new ArrayList<Person>();

    public void addPerson(Person person) {
        personList.add(person);
    }

    //need to fix this method/ return statement
    public Person findById(long id) {
        //return a Person object with the respective id
        for (Person person: personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        //else method does not find person
        return null;
    }

    public void removePerson(Person person) {
        //do we need to loop through array?
        personList.remove(person);
    }

    public void removePersonId(long id) {
        //need to find the right person with the id...

    }

    public int getCount() {
        return personList.size();
    }

    public Object[] getArray() {
        return personList.toArray();
    }

    public void removeAll(ArrayList<Person> person) {
        personList.removeAll(person);
    }
}
