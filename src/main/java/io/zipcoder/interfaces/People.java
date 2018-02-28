package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

    ArrayList<Person> personList = new ArrayList<Person>();


    //methods
    public void add(Person addperson){
        personList.add(addperson);
    }

    public void remove(Person removeperson){
        personList.remove(removeperson);
    }

    public String findById(long id) {
        for (Person p : personList) {
            if (p.getId() == (id)) {
                return p.getName();
            }
        }
        return null;
    }

    public int getCount(){
        return personList.size();
    }

    public Person[] getArray() {
        return personList.toArray(new Person[]{});
    }

    public void removeAll(){
        personList.clear();
    }


}
