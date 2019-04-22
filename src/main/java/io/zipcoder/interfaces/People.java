package io.zipcoder.interfaces;
import java.util.ArrayList;

public class People extends Person {

    private ArrayList<Person> personList;

    public People() {
        personList = new ArrayList<>();
    }

    public People(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public Person findPersonById(long id) {
        Person p1 = null;
        for (Person p : personList) {
            if (p.getId() == (id)) {
                p1 = p;
            }
        }
        return p1;
    }

    public void removePersonByName(String name) {
        if (personList.contains(name)) {
            personList.remove(name);
        }
    }

    public void removePersonById(long id) {
        Person p1 = findPersonById(id);
        personList.remove(p1);
    }

    public Integer getCountOfList() {
        return personList.size();
    }

    public Student[] getListAsArray() {
        return personList.toArray(new Student[personList.size()]);
    }

    public void removeAllEntries() {
        personList.removeAll(personList);


    }
}

