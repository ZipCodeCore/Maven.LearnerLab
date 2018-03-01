package App;

import java.util.ArrayList;
import java.util.List;

public abstract class People <E extends Person> {

    public List<E> personList = new ArrayList<>();

    public void addPerson(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        for (E person : this.personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void remove(long id) {
        personList.remove(findById(id));
    }

    public void remove(E person) {
        personList.remove(person);
    }

    public int getCount() {
        return personList.size();
    }

    public abstract E[] getArray();

    public void removeAll() {
        personList.clear();
    }
}
