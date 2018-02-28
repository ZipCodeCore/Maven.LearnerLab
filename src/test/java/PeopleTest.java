import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PeopleTest {

    People peopleTest;
    Person archer;
    Person lana;
    Person figgis;

    @Before
    public void setUp(){
        peopleTest = new People();
        archer = new Person(1111);
        lana = new Person(2222);
        figgis = new Person(3333);
        peopleTest.add(archer);
        peopleTest.add(lana);
        peopleTest.add(figgis);
    }
    @Test
    public void testAdd(){
        int expected = 3;
        int actual = peopleTest.getCount();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFindById(){
        Person expected = archer;
        Person actual = peopleTest.findById(1111);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemovePerson(){
        int expected = 2;
        peopleTest.remove(archer);
        int actual = peopleTest.getCount();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemoveId(){
        int expected = 2;
        peopleTest.remove(2222);
        int actual = peopleTest.getCount();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemoveAll(){
        int expected = 0;
        peopleTest.removeAll();
        int actual = peopleTest.getCount();
        Assert.assertEquals(expected,actual);
    }

}
