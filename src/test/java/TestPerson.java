
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {

    Person testPerson;

    @Before
    public void setUp(){
        testPerson = new Person(777);
    }


    @Test
    public void testConstructor(){
        long expected = 777;
        long actual =testPerson.getId();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetName(){
        testPerson.setName("Paul");
        String expected = "Paul";
        String actual = testPerson.getName();
        Assert.assertEquals(expected,actual);
    }

}
