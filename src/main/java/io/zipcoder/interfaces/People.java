package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

    private ArrayList<Person> personList;

    public People(){
        this.personList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void add(Person personToAdd) {
        personList.add(personToAdd);
    }

    public void removeByPerson(Person personToRemove) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).equals(personToRemove)) {
                personList.remove(i);
            }
        }
    }

    public void removeById(long id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId() == id) {
                personList.remove(i);
            }
        }
    }

    public int getCount() {
        return personList.size();
    }

    public Person[] getArray() {
        return (Person[]) personList.toArray();
    }

    public Person findById(long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

}
