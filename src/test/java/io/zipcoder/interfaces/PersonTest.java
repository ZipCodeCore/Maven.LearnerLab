//Create a TestPerson class.
//        Create a testConstructor method which ensures that a Person object's id field is being set upon construction.
//        Create a testSetName method which ensures that a Person object's name variable is being set by invoking
//        the .setName method.
//        Create a testConstructor method which ensures that a Person object's name variable is being set by invoking
//        the Person constructor.

package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class PersonTest {


    @Test
    public void testConstructor() {
        //given
        Person person = new Person(1234);
        long expected = 1234;

        //when
        long actual = person.getId();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName(){
        //given
        Person person = new Person(9999);
        String expected = "Nancy";

        //when
        person.setName("Nancy");
        String actual = person.getName();


        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testConstructorWithNameParameter(){
        Person person = new Person(123, "Jim");
        String expected = "Jim";

        String actual = person.getName();

        Assert.assertEquals(expected,actual);

    }

}
