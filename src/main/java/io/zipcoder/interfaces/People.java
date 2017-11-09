package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People <E> extends Person {

    ArrayList<Person> personList = new ArrayList<Person>();

    public People(long id) {
        super(id);
    }


    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        /*for (int i =0; i<=personList.size(); i++){
            Person currentPerson = personList.get(i);
            long idCurrent = currentPerson.getId();
            if (idCurrent == id){
                return currentPerson;
            }

        }return null;**/
        for (Person currentPerson: personList){
            if (currentPerson.getId() == id){
                return currentPerson;
            }
        }return null;
    }

    public void remove(Person person){
        personList.remove(person);

    }

    public void remove(long id){
        remove(findById(id));

    }

    public int getCount(){
        return personList.size();

    }

    public Person[] getArray(){
        Person[] persons = new Person[getCount()];
        for(int i=0; i<persons.length; i++) {
            persons[i] = personList.get(i);
        }
        return persons;

    }

    public void removeAll(){

        personList.clear();
    }

}

