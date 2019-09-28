package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People <E extends Person> {

    ArrayList<E> personList;

    public People() {
        this.personList = new ArrayList<E>();
    }

    public void addPerson(E person){
        this.personList.add(person);
    }

    public E findById(long id){
        for (E p : personList) {
            if (p.getId() == (id)) {
                return p;
            }
        }
        return null;
    }

    public void removePerson(E person) {
        this.personList.remove(person);


    }

    public void removePersonById(long id) {
        this.personList.remove(this.findById(id));


    }

    public double getCount() {
        return this.personList.size();
    }

    public abstract E[] getArray();
//        E[] temp = new E[this.personList.size()];
//        return this.personList.toArray(temp);



    public void removeAll() {
        this.personList.clear();


    }

}
