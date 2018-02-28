package io.zipcoder.interfaces;


import java.util.ArrayList;

public class People<E>  {


    ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person){
        personList.add(person);

    }

    public Person findById(long id){
        for (Person p : personList){
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

    public Person [] getArray(){
        Person [] personArray = new Person[getCount()];
        return personList.toArray(personArray);
    }

    public void removeAll(){
        personList.clear();
    }
}
