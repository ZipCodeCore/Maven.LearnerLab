package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public abstract class People< E extends Person> implements Iterable {

    List<E> personList;

    public People(){
        this.personList = new ArrayList<E>();

    }

    public void add(E person){
        this.personList.add(person);

    }
    public E findById(long id){

        Iterator<E> name = iterator();
        while(name.hasNext()) {
           E per = name.next();
            if (per.getId() == id) {
                return per;
            }
        }
        return null;


    }




    public boolean contains(E person){
       return personList.contains(person);
//        for(Person po : personList) {
//              if(personList.contains(person) ){
//                return true;
//            }
//        }
//        return false;
}

    public void remove(E person){
        personList.remove(person);
    }

    public void removeById(long id ){

         for (Person pep : personList){
             if(pep.getId() == id){
                 personList.remove(pep);
             }
         }
    }

    public void removeAll(){
       // personList.removeAll(personList);
        personList.clear();
    }

    public int count (){
        return personList.size();
    }


    public abstract E[] toArray();


    @Override
    public Iterator<E> iterator() {
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
