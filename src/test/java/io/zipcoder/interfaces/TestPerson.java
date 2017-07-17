package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class TestPerson {
	
	@Test
	public void getNameTest() { 
		
		//if
		String expectedName = "Richa";
		Person somePerson = new Person(expectedName);
		
		
		//when
		String actualName = somePerson.getName();
		
		//Then
		Assert.assertEquals(expectedName, actualName);
	}
	
	@Test
	public void setNameTest() {
		Person somePerson = new Person("Richa");
		String expectedName = "Richa.1";
		
		
		//When
		
		somePerson.setName(expectedName);
		String actualName = somePerson.getName();
		
		//Then
		Assert.assertEquals(expectedName, actualName);
		
	}

}
