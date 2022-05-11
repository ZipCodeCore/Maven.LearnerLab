package io.zipcoder.interfaces;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Collection;

public abstract class People <E extends Person> {

    ArrayList<E> personList = new ArrayList<>();

    public People() {
    }

    public Boolean add(E person) {
        return personList.add(person);
    }

    public E findById(long id) {
        for (E person : personList) {
            if (id == person.getId()) {
                return person;
                // for every person in the personList if the id is equal to the id in
                //the parameters then use person.getId and return the person associated
                // with that ID number
            }
        }
        return null;
    }

    public void remove(long id) {
        personList.remove(id);
    }

    public int getCount() {
        return personList.size();
    }

    public abstract E[] getArray();//{
//       E[] person =  personList.toArray(new E[0]);
//       // have to cast to person []
//        return person;
//    }
// have to comment out bc method doesnt know if the variable that we are entering is able to be instantiated upon
    public void removeAll() {
        personList.clear();
    }
}
