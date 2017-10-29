package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;


public class TestZipCodeWilmington {
	
@Before
	public void setup(){	
	
	ZipCodeWilmington.fireStaff();
	
	
}

@Test
public void testFireStaff(){
	
	ZipCodeWilmington.instructorList.isEmpty();
}

@Test
public void testHireStaff(){
	
	//given
	Instructor instructor = new Instructor("Leon");
	
	//when
	ZipCodeWilmington.instructorList.contains(instructor);

}
}