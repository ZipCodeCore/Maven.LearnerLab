package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

    private ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person passedPerson){
        personList.add(passedPerson);
    }

    public Person findById(long searchForThisId){
        for (Person p : personList)
        {
            if (p.getId()==searchForThisId)
            {
                return p;
            }
        }
        return null;
    }

    public void remove(Person person){
        personList.remove(person);


    }

    public void remove(long searchForThisId){
        remove(findById(searchForThisId));
    }

    public int personCount(){
        return personList.size();
    }

    public Person[] getArray(){
        Person[] p;
        p=new Person[personList.size()];

        return(personList.toArray(p));
    }

    public void removeAll(){
        personList.clear();
    }

}
