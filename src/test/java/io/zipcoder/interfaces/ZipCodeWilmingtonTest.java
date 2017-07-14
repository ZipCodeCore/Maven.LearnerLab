package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ZipCodeWilmingtonTest {

	@Before
	public void setup() {
		
		ZipCodeWilmington.fireStaff();
	}
	
	@Test
	public void testFireStaff() {
		ZipCodeWilmington.instructorList.isEmpty();
	}
	
	@Test
	public void testHireStaff() {
		
		Instructor instructor = new Instructor("Iyasu");
		
		ZipCodeWilmington.instructorList.contains(instructor);	
	
	}
	
}
