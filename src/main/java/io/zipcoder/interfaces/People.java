package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public abstract class People<E extends Person> implements Iterable<E>{
    public List<E> personList = new ArrayList<>();
    
    public void add(E person){
        this.personList.add(person);
    }
    
    public E findByID(Long id){
        for(E p : personList){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }
    
    public Boolean contains(Person person){
        for(Person p : personList){
            if(p.toString().equals(person.toString())){
                return true;
            }
        }
        return false;
    }
    
    public void remove(E person){
        this.personList.remove(person);
    }
    
    public void remove(Long id){
        Person p = findByID(id);
        this.personList.remove(p);
    }
    
    public void removeAll(){
        this.personList.clear();
    }
    
    public Integer count(){
        return personList.size();
    }
    
    public abstract E[] toArray();

    public Iterator<E> iterator() {
        return personList.iterator();
    }

    public void forEach(Consumer<? super E> action) {

    }

    public Spliterator<E> spliterator() {
        return null;
    }
}
