package io.zipcoder.interfaces;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

//    Parameterize the People signature to enforce that it is a container for objects of type E such
// that E is a subclass of Person.
//            Modify the class signature to declare this class abstract.
//        An abstract class cannot be instantiated; Its concrete implementation is deferred to its subclass.
//        Modify people field to enforce that is a container of objects of type E.
//        Modify the add method to ensure that it handles object of type E.
//        Modify the findById method to ensure that it returns an object of type E.
//        Modify the getArray method signature by declaring it abstract of return tyoe E.
//        An abstract method is a subclass's contractual agreement to the deferment of an
// implementation of a respective method.


public abstract class People<E extends Person> {


    ArrayList<E> personList = new ArrayList<>();


    public void add(E person) {

        personList.add( person);
    }



    public void remove(Person person) {

        personList.remove(person);
    }

    public E findById(long id) {
        E person = null;


        for (int i = 0; i < personList.size(); i++) {

            if (id == personList.get(i).getId())


                person = personList.get(i);


        }
        return person;
    }


    public void remove(long id) {
        E person = findById(id);
        personList.remove(person);
    }

    public int getCount() {
        return personList.size();
    }

    public abstract E[] getArray();

    public void removeAll() {
        personList.removeAll(personList);
    }


}

