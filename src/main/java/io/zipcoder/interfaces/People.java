package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E> {

    List<E> personList;

    public People(){
        personList= new ArrayList<E>();
    }

    public void addPerson(E person){
        personList.add(person);
    }

    public Person findById(Long id){
        Person personFinder = null;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId()==id){
                personFinder = personList.get(i);
            }
        }return personFinder;
    }

    public Boolean contains(E person){
        return personList.contains(person);
    }

    public void removePerson(E person){
        personList.remove(person);
    }

    public void removeById(Long id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId() == id) {
                personList.remove(personList.get(i));
            }
        }
    }
    public void removeAll(){
        personList.removeAll(personList);
    }

    public int count(){
        return personList.size();
    }

    public abstract E[] toArray();



    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
