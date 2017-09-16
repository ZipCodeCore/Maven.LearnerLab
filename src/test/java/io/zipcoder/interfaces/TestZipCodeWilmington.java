package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class TestZipCodeWilmington {

	@Before
	public void setup()
	{
		
		ZipCodeWilmington.fireStaff();
		

	}
	
	@Test
	public void testFireStaff()
	{
		boolean actual = ZipCodeWilmington.instructorList.isEmpty();
		boolean expected = true;
	

		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testNewHire()
	{
		Instructor someInstructor = new Instructor ("Jade");
		String expected = "Jade";
		
		ZipCodeWilmington.hire(someInstructor);
		
		String actual = ZipCodeWilmington.getInstructors().get(0).getName();
		
		System.out.println(actual);
		Assert.assertEquals (expected, actual);
		
	}
	
	
	

}
