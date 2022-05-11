import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PeopleTest extends People{


    People peopleTest;
    Person archer;
    Person lana;
    Person figgis;
    PeopleTest peopleTest1;
    @Before
    public void setUp(){
        peopleTest1 = new PeopleTest();
        archer = new Person(1111);
        lana = new Person(2222);
        figgis = new Person(3333);
        peopleTest1.add(archer);
        peopleTest1.add(lana);
        peopleTest1.add(figgis);
    }
    @Test
    public void testAdd(){
        int expected = 3;
        int actual = peopleTest1.getCount();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFindById(){
        Person expected = archer;
        Person actual = peopleTest1.findById(1111);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemovePerson(){
        int expected = 2;
        peopleTest1.remove(archer);
        int actual = peopleTest1.getCount();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemoveId(){
        int expected = 2;
        peopleTest1.remove(2222);
        int actual = peopleTest1.getCount();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemoveAll(){
        int expected = 0;
        peopleTest1.removeAll();
        int actual = peopleTest1.getCount();
        Assert.assertEquals(expected,actual);
    }

    @Override
    public Person[] getArray() {
        return new Person[0];
    }
}
