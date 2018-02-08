package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People <E extends Person>{

    // public void teach(Learner learner, double numberOfHours);
    //ArrayList<Person> personList;

    //ArrayList<Person> personList = new ArrayList<Person>();

    ArrayList<E> personList = new ArrayList<E>();

    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {

        //personList.equals(id);
        for (E person : personList) {
            if (person.getId() == id) {
                return person ;
            }
        }
        return null;
    }

    public void removeById(long id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId() == id) {
                personList.remove(personList.get(i));
            }
        }
    }

    public void remove(Person person) {
        personList.remove(person);
    }


    public long getCount() {
        return personList.size();
    }

    public abstract E[] getArray();
    // return personList.toArray();


    public void removeAll() {
        personList.clear();
    }
}//