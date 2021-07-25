package io.zipcoder.interfaces;

import java.util.Iterator;
import java.util.List;

public class People<E> implements Iterable<E>{
    private List<Person> personList;

    public People(List<Person> personList) {
        this.personList = personList;
    }

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        for (int i = 0; i < personList.size(); i++) {
             if(personList.get(i).getId()==id){
                 return personList.get(i);
             }
        }
        return null;
    }

    public boolean contains(Person person){
            if(personList.contains(person))
                return true;
            return false;
    }

    public void remove(Person person){
        if(personList.contains(person))
            personList.remove(person);
    }

    public void removeAll(){
        personList.removeAll(personList);
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }

    public Iterator<E> iterator() {
        return (Iterator<E>) personList.iterator();
    }
}
