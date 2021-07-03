package io.zipcoder.interfaces;

public class PeopleConcrete extends People<Person> {
    public Person[] getArray() {
        return this.personList.toArray(new Person[0]);
    }
}
