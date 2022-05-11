import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {

    @Test
    public void singletonTestCount(){
        int expected = 10;
        int actual = Students.getInstance().getCount();
        Assert.assertEquals(expected, actual);
    }
}
