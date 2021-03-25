package io.zipcoder.interfaces;

import java.util.ArrayList;

//The E generic is a placeholder for anything that extends Person class...i.e. Student, Instructor

public abstract class People <E extends Person>
{
    protected ArrayList<E> personList = new ArrayList<E>();

    public void add(E person)
    {
        personList.add(person);
    }

    //Should be type Person because it returns Person
    public E findById(long id)
    {
        //Iterate through entire ArrayList<Person> personList
        //look through each item
        //if that item's property is what we are looking for, then keep it; return that
        for (E person : personList)
        {
            if (person.getId() == id)
            {
                return person;
            }

        }

        return null;
    }

    //Overloaded remove method
    public void remove(E person)
    {
        personList.remove(person);
    }

    public void remove(long id)
    {
        personList.remove(findById(id));

        /*
        OR

        Person person = findById(id);
        this.remove(person)

        OR
        remove(findById(id));

         */

    }

    public int getCount()
    {
        return personList.size();
    }

    public abstract E[] getArray();


    public Student[] getArrayOfStudents()
    {
        Student [] students = new Student[personList.size()];

        for (int i = 0; i < students.length; i++)
        {
            students[i] = (Student) personList.get(i);
        }
        return students;
    }

    public void removeAll()
    {
        //List is cleared, but still exists
        personList.clear();
    }


}
