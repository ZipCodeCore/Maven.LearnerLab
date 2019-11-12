package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    private List<Person> personList;

    public People() {
        this.personList = new ArrayList<Person>();
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public Person findById(Long id) {
        Person target = null;
        for (Person person: this.personList) {
            if (person.getId().equals(id)) {
                target = person;
                break;
            }
        }
        return target;
    }

    public Boolean contains(Person person) {
        Boolean exists = false;
        for (Person eachperson: this.personList) {
            if (eachperson.getName().equals(person.getName())
                && eachperson.getId().equals(person.getId())) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public void remove(Person person) {
        if (this.contains(person)) {
            this.personList.remove(person);
        }
    }

    public void remove(Long id) {
        Person personToRemove = this.findById(id);
        this.remove(personToRemove);
    }

    public void removeAll() {
        this.personList = new ArrayList<Person>();
    }

    public Integer count() {
        return this.personList.size();
    }

    public Person[] toArray() {
        Person[] personArray = new Person[this.count()];
        for (int i = 0; i < this.count(); i++) {
            personArray[i] = this.personList.get(i);
        }
        return personArray;
    }

    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
