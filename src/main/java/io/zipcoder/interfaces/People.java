package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E> {
    List<E> personList = new ArrayList<E>();

    public void add(E person) {
        this.personList.add(person);
    }

    public E findById(Long id) {
        E target = null;
        for (E person: this.personList) {
            if (person.getId().equals(id)) {
                target = person;
                break;
            }
        }
        return target;
    }

    public Boolean contains(E person) {
        Boolean exists = false;
        for (E eachPerson: this.personList) {
            if (eachPerson.getName().equals(person.getName())
                    && eachPerson.getId().equals(person.getId())) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public void remove(E person) {
        if (this.contains(person)) {
            this.personList.remove(person);
        }
    }

    public void remove(Long id) {
        E personToRemove = this.findById(id);
        this.remove(personToRemove);
    }

    public void removeAll() {
        this.personList = new ArrayList<E>();
    }

    public Integer count() {
        return this.personList.size();
    }

    public abstract E[] toArray();
//        Person[] personArray = new Person[this.count()];
//        for (int i = 0; i < this.count(); i++) {
//            personArray[i] = this.personList.get(i);
//        }
//        return personArray;
//    }

    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
