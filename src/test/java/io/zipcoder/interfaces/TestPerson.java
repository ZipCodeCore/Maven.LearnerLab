package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

@Test
  public void constructorTest(){
//given

  Long expectedId=Long.MIN_VALUE;
  String expectedName="Usha";
    Person person = new Person(Long.MIN_VALUE,"Usha");
    String actualName = person.getName();
    Long actualId = person.getId();
    Assert.assertEquals(expectedName,actualName);
    Assert.assertEquals(expectedId,actualId);

}
@Test
  public void setNameTest(){
  Long expectedId=Long.MIN_VALUE;
  String expectedName="";
  Person person=new Person(expectedId,expectedName);
  String actualName=person.getName();
  Assert.assertEquals(expectedName,actualName);
}

}
