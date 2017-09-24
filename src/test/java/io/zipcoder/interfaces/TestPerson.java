package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

	@Test

	public void getNameTest() {

		// Given

		Person testPerson = new Person("Brendan");
		String expected = "Brendan";

		// When

		String actual = testPerson.getName();
		// Then

		Assert.assertEquals(expected, actual);
	}

@Test

	public void setNameTest(){
	//Given
	Person testPerson = new Person("Brendan");
	
	//When
	testPerson.setName("Brendan");
	
	//Then
	Assert.assertTrue(testPerson.getName().equals("Brendan"));
	
	
}

}
