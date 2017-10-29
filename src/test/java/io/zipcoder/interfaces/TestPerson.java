package io.zipcoder.interfaces;

import org.junit.Test;

import junit.framework.Assert;
//import org.junit.Assert;

public class TestPerson {
	
	@Test
	public void testsetName(){
		//given
		Person person = new Person("Julia");
		String expected = "Julia";
		
		
		//when
		person.setName("Julia");
		String actual = person.getName();
		
		//then
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void testContructor(){
		//set the name to a different name
		//get the name of the old person and see if it changes the name of the old person
	//given
		Person Cperson = new Person("Julia");
		String expectedName = "Julia";
		
	//when
		String actualName = Cperson.getName();
	
	//then
		Assert.assertEquals(expectedName,actualName);
	}
	
	
	
}
