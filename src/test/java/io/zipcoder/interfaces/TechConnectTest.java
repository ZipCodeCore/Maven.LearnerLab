package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

public class TechConnectTest {
	
	@Before
	public void setup() {
		
		TechConnect.removeStudents();
	}

	@Test
	public void testRemoveStudents() {
		TechConnect.studentList.isEmpty();
	}
	
	@Test
	public void testRecruitStudent() {
		
		Student student = new Student("Bri");
		
		ZipCodeWilmington.instructorList.contains(student);	
	
	}
	
}
