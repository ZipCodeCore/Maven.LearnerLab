package io.zipcoder.interfaces;


import java.util.ArrayList;

public abstract class People<E extends Person> {


    ArrayList<E> personList = new ArrayList<E>();

    public void add(E person){
        personList.add(person);

    }

    public E findById(long id){
        for (E p : personList){
            if (p.getId() == id){
                return p;
            }
        }

        return null;
    }

    public void remove (Person person){
        personList.remove(person);
    }

    public void remove (long id){
        personList.remove(findById(id));
    }

    public int getCount(){
        return personList.size();
    }

    public abstract E[] getArray();

//    {
//        Person [] personArray = new Person[getCount()];
//        return personList.toArray(personArray);
//    }

    public void removeAll(){
        personList.clear();
    }
}
