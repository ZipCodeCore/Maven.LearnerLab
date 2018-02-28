package App;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void getInstanceTest() {
        int expected = 6;
        int actual = Instructors.getInstance().getCount();

        Assert.assertEquals(expected, actual);
    }

}
