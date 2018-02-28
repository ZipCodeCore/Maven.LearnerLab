import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void testGetInstance(){
        StringBuilder singletonInstructor = new StringBuilder();
        singletonInstructor.append(Instructors.getInstance().getArray()[0].getId());
        String expected = "0";
        String actual = singletonInstructor.toString();
        Assert.assertEquals(expected, actual);
    }
}
