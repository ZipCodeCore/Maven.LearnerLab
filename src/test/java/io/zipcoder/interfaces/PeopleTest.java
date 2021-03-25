package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PeopleTest {

private People people;
private Person tp1, tp2, tp3, tp4;

@Before
public void setup () {
    people = new ConcretePeople();
    tp1 = new Person (8734L, "Pete");
    tp2 = new Person (3847L, "Sammi");
    tp3 = new Person (2234L, "Rachel");
    tp4 = new Person (9987L, "Steven");
    people.addPerson(tp1);
    people.addPerson(tp2);
    people.addPerson(tp3);

}

    @Test
    public void addPerson() {
        people.addPerson(tp4);
        Assert.assertTrue(people.containsPerson(tp4));
    }

    @Test
    public void addPerson2() {
        Integer expected = 4;
        people.addPerson(tp4);
        Integer actual = people.count();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findById() {
    Person expected = tp2;
    Person actual = people.findById(3847L);
    Assert.assertEquals(expected, actual);
    }

    @Test
    public void contains() {
    Assert.assertTrue(people.containsPerson(tp3));
    }

    @Test
    public void count() {
    Integer expected = 3;
    Integer actual = people.count();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removePerson() {
    people.removePerson(tp1);
    Assert.assertFalse(people.containsPerson(tp1));
    }

    @Test
    public void removePersonById() {
    people.removePersonById(tp1.getId());
    Assert.assertFalse(people.containsPerson(tp1));
    }

    @Test
    public void removeAll() {
    people.removeAll();
    Integer expected = 0;
    Assert.assertEquals(expected, people.count());
    }

    @Test
    public void listToArray() {
    Integer expected = 3;
    Person [] personArray = people.listToArray();
    Integer actual = personArray.length;
    Assert.assertEquals(expected, actual);
    }
}
