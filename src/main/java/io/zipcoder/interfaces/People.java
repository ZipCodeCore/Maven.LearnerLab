package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People  implements Iterable<Person>{

    List<Person> personList = new ArrayList<>();

    public void addPerson (Person person){
        this.personList.add(person);
    }

    public Person findById (Long id) {
        Person target = null;
        for (Person person : this.personList) {
            if (person.getId().equals(id)) {
                target = person;
                break;
            }
        }
        return target;
    }

    public Boolean containsPerson (Person person) {
         return this.personList.contains(person);
    }

    public Integer count () {
        return personList.size();
    }

    public void removePerson (Person person){
        personList.remove(person);
    }

    public void removePersonById (Long id) {
        Person personToRemove = findById(id);
        removePerson(personToRemove);
    }


    public void removeAll (){
        personList.clear();
    }

    public Person [] listToArray () {
        Person [] myPeople = new Person [this.personList.size()];
        myPeople = this.personList.toArray(myPeople);
        return myPeople;
    }

    @Override
    public Iterator<Person> iterator() {
        return null;
     }
}
