package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends Person> {

    public ArrayList<E> personList;

    //in nullary constructor making a personList which is an array of Person objects
    // (or anything that extends Person)
    public People() {
        this.personList = new ArrayList<E>();
    }

    public void add(E ePerson) {
        this.personList.add(ePerson);
    }

    public E findById(long id) {
        for (E person : this.personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public Boolean remove(E person) {
        if (this.personList.remove(person)) {
            return true;
        }
        return false;
    }

    public void removeById(long id) {
        this.personList.remove(this.findById(id));
    }

    public void removeAll() {
        this.personList.clear();
    }

    public int getCount() {
        return this.personList.size();
    }

    public abstract E[] getArray();
}


/**
 * Create a People class.
 * The class should instantiate an ArrayList field of Person objects named personList.
 * The class should define a method named add which adds a Person to the personList.
 * The class should define a method named findById which makes use of a long id parameter to
 * return a Person object with the respective id field.
 * <p>
 * The class should define a method named remove which makes use of a
 * Person person parameter to remove a respective Person object.
 * <p>
 * The class should define a method named remove which makes use of a long id parameter to
 * remove a Person object with the respective id field.
 * The class should define a method named getCount which returns the size of personList.
 * The class should define a method named getArray which returns an array representation of the personList field.
 * The class should define a named removeAll which clears our personList field.   Part 10.1 - Modify People class
 * <p>
 * Part 10.1 - Modify People class
 * <p>
 * Parameterize the People signature to enforce that it is a container for objects of type E such that E is a
 * subclass of Person.
 * Modify the class signature to declare this class abstract.
 * An abstract class cannot be instantiated; Its concrete implementation is deferred to its subclass.
 * Modify people field to enforce that is a container of objects of type E.
 * Modify the add method to ensure that it handles object of type E.
 * Modify the findById method to ensure that it returns an object of type E.
 * Modify the getArray method signature by declaring it abstract of return tyoe E.
 * An abstract method is a subclass's contractual agreement to the deferment of an implementation
 * of a respective method.
 * <p>
 * <p>
 * the only reason I would set up the constructor  with passing the Array into the parameter
 * is so that I can manually set the arraylist. useful for testing but may not be needed
 * public People(ArrayList<Person> personList) {
 * this.personList = personList;
 * }
 * <p>
 * public void removeById(long id){
 * original solution
 * for(Person person : personList) {
 * if (person.getId() == id) {
 * personList.remove(person);
 * }
 * }
 * <p>
 * public Person[] getArray(){
 * original solution required Person[] type but was returning an object so casted as a Person array and it "worked"
 * return (Person[]) personList.toArray();
 * personList is an Arraylist and in order to convert an array we need to provide the memory address where
 * it's going to live aka declare an array.
 * return this.personList.toArray(new Person[0]);
 * }
 */

