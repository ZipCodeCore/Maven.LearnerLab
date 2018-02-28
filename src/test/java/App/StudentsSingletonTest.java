package App;

import org.junit.Assert;
import org.junit.Test;

public class StudentsSingletonTest {

    @Test
    public void getInstanceTest() {
        int expected = 30;
        int actual = Students.getInstance().getCount();

        Assert.assertEquals(expected, actual);

    }

}
