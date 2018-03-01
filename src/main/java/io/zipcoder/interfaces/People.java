package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

    public ArrayList<Person> personList;

    public People(){
        this.personList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        Person person = new Person(7);
        for(int i = 0; i<personList.size(); i++) {
            if(personList.get(i).getId() == id) {
                person = personList.get(i);
            }
        }
        return person;
    }

    public void remove(Person person) {
        if(personList.contains(person)) {
            personList.remove(personList.indexOf(person));
        }
    }

    public void remove(long id) {
        for(int i = 0; i<personList.size(); i++) {
            if(id == personList.get(i).getId()) {
                personList.remove(i);
            }
        }
    }

    public int getCount() {
        return personList.size();
    }

    public Person[] getArray(){
        Person[] personArray = new Person[personList.size()];
        for(int i = 0; i<personList.size(); i++) {
            personArray[i] = personList.get(i);
        }
        return personArray;
    }

    public void removeAll() {
        personList.clear();
    }

}
