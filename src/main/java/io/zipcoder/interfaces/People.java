package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People <E extends Person>{

    protected ArrayList<E> personList = new ArrayList<>();

    public void add(E passedPerson){
        personList.add(passedPerson);
    }

    public E findById(long searchForThisId){

        return personList.stream().filter(p->p.getId()==searchForThisId).findAny().get();

    }

    public void remove(E person){
        personList.remove(person);


    }

    public void remove(long searchForThisId){
        personList.remove(findById(searchForThisId));
    }

    public int getCount(){
        return personList.size();
    }

    public abstract E[] getArray();

    public void removeAll(){
        personList.clear();
    }

}
