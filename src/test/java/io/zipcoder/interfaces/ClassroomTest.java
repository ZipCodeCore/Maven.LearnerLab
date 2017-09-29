package io.zipcoder.interfaces;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;

/*
Assert that the HashMapping returned by getRoster, returns a valueSet containing each of the Person objects in ZipCodeWilmington's instructorList and TechConnect's studentList.
 */


public class ClassroomTest {

    @Test
    public void testClassroom() {

        HashMap<String, Person> map = Classroom.getRoster();

        //Assert.assertTrue(map.values().containsAll(TechConnect.getStudents()));

        Assert.assertTrue(map.values().containsAll(ZipCodeWilmington.getInstructorList()));

        for(Student s:TechConnect.getStudents().toArray(new Student[0])){
            //System.out.println(map.get(s.getName()));
            System.out.println("Checking: " + s.getName());
            Assert.assertTrue(map.containsValue(s));
        }

    }




}
