package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {
    private ArrayList<Person>  personList = new ArrayList<Person>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id) {
        //look through each item
        // if that item's property is what we are looking for
        // then keep it, and return it

        for(Person element: personList){
            if(element.getId() == id){
                return element;
            }
        }

        return null;

    }

    public void remove(Person person){
        System.out.println("Removing this person");
        personList.remove(person);

    }

    public void remove(long id){
        //ORRRRRR just remove.(findbyId(id));
        Person person = findById(id);
        this.remove(person);
    }

    public int getCount(){
        return personList.size();
    }

    public Person[] getArray(){
        Person[] persons = new Person[personList.size()];
        for(int i = 0; i<persons.length; i++){
            Person currentPerson = personList.get(i);
            persons[i]= currentPerson;
        }
        return persons;
        //OORRRRRN return (Person[]) personList.toArray();
    }

    public void removeAll(){
        personList.clear();
    }


}
