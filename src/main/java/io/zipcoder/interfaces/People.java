package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class People implements Iterable {
    List<Person> personList = new ArrayList<>();

    public void add(Person person){
        personList.add(person);

    }
    public Person findById(long id){
        Person person = new Person(123, "lll");
        for (Person pep : personList){
            if (pep.getId() == id){
                person = pep;
            }
        }
        return person;
    }

    public boolean contains(Person person){
       return personList.contains(person);
//        for(Person po : personList) {
//              if(personList.contains(person) ){
//                return true;
//            }
//        }
//        return false;
}

    public void remove(Person person){
        personList.remove(person);
    }

    public void removeById(long id ){
//        Person removePerson = findById(id);
//        personList.remove(removePerson);
         for (Person pep : personList){
             if(pep.getId() == id){
                 personList.remove(pep);
             }
         }
    }

    public void removeAll(){
        personList.removeAll(personList);
       // personList.clear();
    }

    public int count (){
        return personList.size();
    }

    public Person[] toArray() {
        return new Person[0]; // change or remove this

    }


    @Override
    public Iterator iterator() {
        return personList.iterator();
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}
