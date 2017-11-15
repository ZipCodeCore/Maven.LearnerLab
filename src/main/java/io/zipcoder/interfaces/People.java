package io.zipcoder.interfaces;

import java.util.*;

public abstract class People<E extends Person> {
    //ArrayList<Person> personList = new ArrayList<Person>();
    public ArrayList<E> personList;

    public People (){
        personList = new ArrayList<E>();
    }

    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        E returnPerson = null;

        for (E p1 : personList) {
            if (p1.getId() == id) {
                returnPerson = p1;
                //break;
            }
        }
        return returnPerson;
    }

    public void remove(Person person) {

        personList.remove(person);
    }

    public void remove(long id) {

        for (Person p1 : personList) {
            if (p1.getId() == id) {
                remove(p1);
                break;
            }
        }

    }

    public int getCount() {

        return personList.size();
    }

    public abstract E[] getStudentArray() ;
//        E[] personArray = new E[personList.size()];
//        for (int i = 0; i < personList.size(); i++) {
//            personArray[i] = personList.get(i);
//        }
//        return personArray;


    public void removeAll(){

        personList.removeAll(personList);
    }
}

