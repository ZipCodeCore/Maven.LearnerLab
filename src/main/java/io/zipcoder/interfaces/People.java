package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {
    private ArrayList<Person> personList;

    public People(ArrayList personList) {
        this.personList = personList;
    }
    public People(){

    }

    public boolean add(Person thePerson) {
        if ( this.personList == null  ||!this.personList.contains(thePerson)) {
            return personList.add(thePerson);
        }
        return false;
    }

    public boolean remove(Person thePerson) {
        if (this.personList.contains(thePerson)) {
            return this.personList.remove(thePerson);
        }
        return false;
    }

    public boolean removeById(long id) {
        Person p = findById(id);
        if (p != null)
            return this.personList.remove(p);
        return false;
    }


    public Person findById(long id) {
        for (Person person : this.personList) {
            if (person.getid() == id)
                return person;
        }
        return null;
    }

    public int getCount() {
        return this.personList.size();
    }

    public Person[] getPersonAsArray() {
        Person[] person = personList.toArray(new Person[0]);
        return person;
    }
    public void clearList(){
        this.personList.clear();
    }

}
