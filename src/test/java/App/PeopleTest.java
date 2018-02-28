package App;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PeopleTest {

    People people;
    Person person1;
    Person person2;

    @Before
    public void setup() {
        people = new People();
        person1 = new Person(1555);
        person2 = new Person(1666);
    }

    @Test
    public void addPersonTest() {
        people.addPerson(person1);
        double expected = 1555;
        double actual = people.personList.get(0).getId();

        Assert.assertEquals(expected, actual, .001);
    }

    @Test
    public void findByIdTest() {
        people.addPerson(person1);
        people.addPerson(person2);

        Person expected = person2;
        Person actual = people.findById(1666);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeTest() {
        people.addPerson(person1);
        people.addPerson(person2);

        people.remove(person1);

        int expected = 1;
        int actual = people.personList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCountTest() {
        people.addPerson(person1);
        people.addPerson(person2);

        int expected = 2;
        int actual = people.getCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getArrayTest() {

        people.addPerson(person1);
        people.addPerson(person2);

        Object[] expected = {person1, person2};
        Object[] actual = people.getArray();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeAllTest() {
        people.addPerson(person1);
        people.addPerson(person2);

        people.removeAll();

        int expected = 0;
        int actual = people.personList.size();
    }

}
