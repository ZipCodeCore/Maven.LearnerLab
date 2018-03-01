package io.zipcoder.interfaces;

public class PeopleConcrete extends People<Person>{

    public Person[] getArray() {
        return personList.toArray(new Person[personList.size()]);
    }
}
