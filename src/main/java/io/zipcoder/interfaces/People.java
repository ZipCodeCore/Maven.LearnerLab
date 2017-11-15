package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People
    {
    ArrayList<Person> personList = new ArrayList<>();


    public void add(Person person) {

        personList.add(person);
    }



    public Person findByID(long id)
    {
        for (Person person : personList) {
            if (person.id == id) {
                return person;
            }
        }

        return null;
    }



    public void remove(Person person)
    {
            if(personList.contains(person))
            personList.remove(person);
                }

    public void remove(long id)
    {

        for(int i =0; i < personList.size(); i++){

            if(personList.get(i).getID() == id) personList.remove(personList.get(i));
        }
    }

    public int getCount()
    {
        return personList.size();
    }

    public  Person[] getArray()
    {
        return personList.toArray(new Person[personList.size()]);
    }

    public void removeAll()
    {
        personList.clear();
    }


}
