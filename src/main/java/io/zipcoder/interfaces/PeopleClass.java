package io.zipcoder.interfaces;

public class PeopleClass extends People<Person>{

        public Person[] getArray() {
            return personList.toArray(new Person[0]);

        }
}
