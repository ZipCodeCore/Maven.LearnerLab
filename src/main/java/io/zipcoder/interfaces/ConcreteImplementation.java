package io.zipcoder.interfaces;

public class ConcreteImplementation extends People<Person>{

    public Person[] getArray() {
        return personList.toArray(new Person[personList.size()]);
    }
}
