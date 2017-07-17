package io.zipcoder.interfaces;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestZipCodeWilmington {
	
	@Before
	public void setup() {
		ZipCodeWilmington.fireStaff();
	}
	
	@Test
	public void testFireStaff(){
		boolean emptyList = ZipCodeWilmington.instructorList.isEmpty();
		
		boolean expectedemptyList = true;
		
		Assert.assertEquals(expectedemptyList, emptyList);
	}
	
	@Test 
	public void testtHireStaff() {
		
		
		ZipCodeWilmington.hire(new Instructor("Carolyn"));
		
		double expected = 1;
		
		double actual = ZipCodeWilmington.getInstructors().size();
		
		Assert.assertEquals(expected, actual);
		
	}

}
