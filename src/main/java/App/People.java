package App;

import io.zipcoder.interfaces.Learner;

import java.util.ArrayList;

public class People {

    public ArrayList<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        for (Person person : this.personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void remove(long id) {
        remove(findById(id));
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public int getCount() {
        return personList.size();
    }

    public Student[] getArray() {
        Student[] personArray = personList.toArray(new Student[personList.size()]);
        return personArray;
    }

    public void removeAll() {
        personList.clear();
    }
}
