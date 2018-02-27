package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

    private ArrayList<Person> personList = new ArrayList<Person>();



    public void addPerson(Person person){
        this.personList.add(person);
    }

    public Person findById(long id){
        for (Person p : personList) {
            if (p.getId() == (id)) {
                return p;
            }
        }
        return null;
    }

    public void removePerson(Person person) {
        this.personList.remove(person);


    }

    public void removePersonById(long id) {
        this.personList.remove(this.findById(id));


    }

    public double getCount() {
        return this.personList.size();
    }

    public Person[] getArray() {
        Person[] temp = new Person[this.personList.size()];
        return this.personList.toArray(temp);
    }


    public void removeAll() {
        this.personList.clear();


    }

}
