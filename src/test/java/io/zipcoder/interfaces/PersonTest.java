package io.zipcoder.interfaces;
import org.junit.*;


public class PersonTest {
    @Test
    public void getIdTest(){
        //Given
        Person person = new Person(12345, "Sally");
        //when
        long expected = 12345;
        //Then
        long actual = person.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){
        //Given
        Person person = new Person(12345, "Sally");
        //when
        String expected = "Sally";
        //Then
        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }

        @Test
    public void setNameTest(){

      //Given
      Person person = new Person(12345, "Sally");
      //when
      String expected = "Anna";
      //Then
      person.setName("Anna");
      String actual = person.getName();

      Assert.assertEquals(expected, actual);
    }


}
