package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <E extends Person> implements Iterable<E>{

    List<E> personList = new ArrayList<>();

    public void addPerson (E person){
        this.personList.add(person);
    }

    public E findById (Long id) {
        E target = null;
        for (E person : this.personList) {
            if (person.getId().equals(id)) {
                target = person;
                break;
            }
        }
        return target;
    }

    public Boolean containsPerson (E person) {
         return this.personList.contains(person);
    }

    public Integer count () {
        return personList.size();
    }

    public void removePerson (E person){
        personList.remove(person);
    }

    public void removePersonById (Long id) {
        E personToRemove = findById(id);
        removePerson(personToRemove);
    }


    public void removeAll (){
        personList.clear();
    }

    public abstract E [] listToArray () ;



    @Override
    public Iterator<E> iterator() {
        return this.personList.iterator();
     }
}
