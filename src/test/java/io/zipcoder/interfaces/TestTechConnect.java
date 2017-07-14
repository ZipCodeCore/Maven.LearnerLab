package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTechConnect {

	@Before
	public void setup()
	{
		
		TechConnect.removeStudents();
		

	}
	
	@Test
	public void testRemoveStudents()
	{
		boolean actual = TechConnect.studentList.isEmpty();
		boolean expected = true;
	

		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testRecruitStudent()
	{
		Student someStudent = new Student ("Bridget");
		String expected = "Bridget";
		
		TechConnect.recruitStudent(someStudent);
		
		String actual = TechConnect.getStudents().get(0).getName();
		
		System.out.println(actual);
		Assert.assertEquals (expected, actual);
		
	}

}
