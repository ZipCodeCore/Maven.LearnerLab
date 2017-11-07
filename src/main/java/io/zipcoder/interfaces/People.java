package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

    ArrayList<Person> personList = new ArrayList<Person>();

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
        return (Person[]) personList.toArray();

    }

    public void removeAll(){
        personList.clear();
    }

}

