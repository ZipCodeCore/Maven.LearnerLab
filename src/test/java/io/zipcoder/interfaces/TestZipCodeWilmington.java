package io.zipcoder.interfaces;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestZipCodeWilmington {


	@Before
	public void setUp(){		
		ZipCodeWilmington.fireStaff();
	}

	@Test
	public void testFireStaff() {
	
	
	Assert.assertTrue(ZipCodeWilmington.getInstructorList().isEmpty());
	
	}
	
	@Test
	public void testHireStaff() {
		
		

		//if
		Instructor someInstructor = new Instructor("someInstructor");
		Instructor someOtherOne= new Instructor("someOtherOne");

        //when
		
		ZipCodeWilmington.hire(someInstructor);
		ZipCodeWilmington.hire(someOtherOne);

	    double actual = ZipCodeWilmington.getInstructorList().size();
				
        double expected = 2;


        //Assert

        Assert.assertEquals(expected,  actual, 0);

        
	}

}
