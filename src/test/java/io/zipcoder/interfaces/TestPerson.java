package io.zipcoder.interfaces;

import org.junit.Test;

import junit.framework.Assert;

public class TestPerson {
	
	@Test
	public void testSetName()
	{
		Person Bridget = new Person("Bridget");
		String expected = "Bridget";
		
		Bridget.setName("Bridget");
		
		String actual = Bridget.getName();
		
		System.out.println(Bridget.getName());
		Assert.assertEquals(expected,  actual);
		
	}


	

}
