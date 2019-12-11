import io.zipcoder.interfaces.Instructor;
import io.zipcoder.interfaces.Instructors;
import io.zipcoder.interfaces.Students;
import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void testSingleton () {
        Instructors testSingleton = Instructors.getInstance();
        Integer expected = 5;
        Assert.assertEquals(expected, testSingleton.count());
    }
}
