package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void constructorTest() {
        //given
        Person person = new Person(10L,"bob");

        //when
        Long expectedId = 10L;
        Long actualId = person.getId();

        String expectedName = "bob";
        String actualName = person.getName();

        //then
        Assert.assertEquals(expectedId,actualId);
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public void setNameTest() {
        //given
        Person person = new Person(234L, "Jerry");

        //when
        person.setName("Rick");
        String actual = person.getName();
        String expected = "Rick";

        //then
        Assert.assertEquals(expected,actual);

    }

}
