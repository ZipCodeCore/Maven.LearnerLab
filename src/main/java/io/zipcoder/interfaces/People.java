package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Create a People class.
 * The class should instantiate a List field of Person objects named personList.
 * The class should define a method named add which adds a Person to the personList.
 * The class should define a method named findById which makes use of a long id parameter 
 * to return a Person object with the respective id field.
 * The class should define a method named contains which makes use of a Person person parameter to
 * return true if the personList contains the respective Person object.
 * The class should define a method named remove which makes use of a Person person parameter 
 * to remove a respective Person object.
 * The class should define a method named remove which makes use of a long id parameter to 
 * remove a Person object with the respective id field.
 * The class should define a named removeAll which clears our personList field.
 * The class should define a method named count which returns the size of personList.
 * The class should define a method named toArray which returns an array representation of the 
 * personList field.
 *
 * The class should implement Iterable<E> and define a method named iterator which makes use of 
 * the personList field to generate a new a Iterator<E>.
 * 
 */
public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    private List<PersonType> personList;

    public People() {
        this.personList = new ArrayList<PersonType>();
    }
    
    public void add(PersonType person){
        personList.add(person);
    }
    
    public PersonType findById(long id){
        for(PersonType person:personList){
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public boolean contains(PersonType person){
        if(personList.contains(person)){
            return true;
        }
        return false;
    }

    //Should only remove - not return a string
    public void removePerson(PersonType person){
        if(personList.contains(person)){
            personList.remove(person);
        } else {
            throw new UnsupportedOperationException("That person is not here");
        }
    }

    public void removeById(long id){
        personList.removeIf(person -> person.getId() == id);
    }

    public void removeAll(){
        personList.clear();
    }

    public Integer count(){
        return personList.size();
    }

    public abstract PersonType[] toArray();

    @Override
    public Iterator iterator() {
        return personList.iterator();
    }

    public List<PersonType> getPersonList() {
        return personList;
    }
}
