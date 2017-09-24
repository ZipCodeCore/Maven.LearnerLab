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
	
	public void fireStaffTest(){
		
		//Given	
		
		//When
		ZipCodeWilmington.fireStaff();
		
		
		//Then
		
		Assert.assertTrue(ZipCodeWilmington.getInstructors().isEmpty());
		
	}
	
	@Test
	
	public void hireStaffTest(){
		
		//Given
		
		Instructor testInstructor = new Instructor("Brendan");
		String expected = "Brendan";
		
		//When
		ZipCodeWilmington.hire(testInstructor);
		String actual = ZipCodeWilmington.getInstructors().get(ZipCodeWilmington.getInstructors().size()-1).getName();
		
		//Then
		Assert.assertEquals(expected, actual);
		
		
	}

}
