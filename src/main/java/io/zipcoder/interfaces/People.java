package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {
    //The class should instantiate an ArrayList field of Person objects named personList.
    private ArrayList<Person> personList = new ArrayList<Person>();




    public void add(Person person){
        this.personList.add(person);
    }

    public Person findById(long id){
        //so what we are doing here is saying for type Person person in the personlists array
        //if the id equals the persons id then return the id.
        for(Person person : personList){
            if(id==person.getId()){
                return person;
            }
        }
        return null;
    }

    public void remove(Person person){
        //go in the list
        //and remove the person
        personList.remove(person);
    }

    public void removeId(long id){
        //remove Person object w/ the same id field
        //just like above

        for(Person person : personList){
            if(id==person.getId()){
                remove(person);
            }
        }
    }

    public int getCount(){

        return personList.size();
    }

    public Person[] getArray(){
        Person[] personArray = new Person[personList.size()];
        return personList.toArray(personArray);
    }

    public void removeAll(){
        personList.clear();
    }
}
