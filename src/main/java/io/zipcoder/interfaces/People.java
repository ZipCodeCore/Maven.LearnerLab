package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People <E extends Person> {

    private ArrayList<E> personList;
    protected long id;

    public People(){
        this.personList = new ArrayList<E>();
        this.id = 0;
    }

    public void add(E person) {
        personList.add(person);
    }

    public ArrayList<E> getPersonList(){
        return personList;
    }

    public <E extends Person> E findById(long id) {
        this.id = id;
        E person = null;
        for(int i = 0; i<personList.size(); i++) {
            if(personList.get(i).getId() == id) {
                person = (E) personList.get(i);
            }
        }
        return person;
    }

    public void remove(E person) {
        if(personList.contains((E)person)) {
            personList.remove(personList.indexOf((E)person));
        }
    }

    public void remove(long id) {
        for(int i = 0; i<personList.size(); i++) {
            if(id == personList.get(i).getId()) {
                personList.remove(i);
            }
        }
    }

    public int getCount() {
        return personList.size();
    }

    public abstract E[] getArray();

    public void removeAll() {
        personList.clear();
    }

}
