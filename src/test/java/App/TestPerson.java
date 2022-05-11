package App;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {

    Person tester;

    @Before
    public void setup() {
        tester = new Person(14545);
    }

    @Test
    public void constructorTest() {
        long expected = 14545;
        long actual = tester.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        tester.setName("George");
        String expected = "George";
        String actual = tester.getName();

        Assert.assertEquals(expected, actual);
    }

}
