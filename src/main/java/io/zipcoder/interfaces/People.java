package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable{
    private List<Person> personList;

    public People() {
        personList = new ArrayList<Person>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        for (Person p : personList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        return personList.contains(person);
    }

    public boolean remove(Person person){
        personList.remove(person);
        return false;
    }
    public boolean removeById(long id){
        Person person = findById(id);
        personList.remove(person);
        return false;
    }
    public void removeAll(){
        personList.clear();
    }
    public int count(){
        return personList.size();
    }
    public Person[] toArray(){
        Person[] arr = new Person[personList.size()];
        return personList.toArray(arr);
    }

    public Iterator iterator() {
        return personList.iterator();
    }
}
