package io.zipcoder.interfaces.donald.fountain.classroomLab;

import java.util.ArrayList;


public abstract class People<E extends Person> {

    protected ArrayList<E> personList = new ArrayList<>();

    public void addPerson(E person) { personList.add(person);
    }

    public void removeByName(E person) {
        personList.remove(person);
    }

    public void removeByIdNumber(long idNumber) {
        for(E person: personList)
            if(idNumber == person.getId())
        personList.remove(person);
    }

    public E findById(long idNumber) {
        for (E person : personList) {
            if (person.getId() == idNumber)
                return person;
        }
        return null;
    }

    public int getCount() { return personList.size(); }

    public abstract E[] getArray();

    public void removeAll(){ personList.clear();
    }
}
