package App;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PeopleTest {

    People people = new People() {
        @Override
        public Person[] getArray() {
            return new Person[0];
        }
    };

    @Test
    public void addPersonTest() {
        Person person1 = new Person(1555);
        people.addPerson(person1);
        double expected = 1;
        double actual = people.personList.size();

        Assert.assertEquals(expected, actual, .001);
    }

    @Test
    public void findByIdTest() {
        Person person1 = new Person(1555);
        Person person2 = new Person(1666);

        people.addPerson(person1);
        people.addPerson(person2);

        Person expected = person2;
        Person actual = people.findById(1666);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeTest() {

        Person person1 = new Person(1555);
        Person person2 = new Person(1666);

        people.addPerson(person1);
        people.addPerson(person2);

        people.remove(person1);

        int expected = 1;
        int actual = people.personList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCountTest() {

        Person person1 = new Person(1555);
        Person person2 = new Person(1666);

        people.addPerson(person1);
        people.addPerson(person2);

        int expected = 2;
        int actual = people.getCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAllTest() {

        Person person1 = new Person(1555);
        Person person2 = new Person(1666);

        people.addPerson(person1);
        people.addPerson(person2);

        people.removeAll();

        int expected = 0;
        int actual = people.personList.size();
    }

}
