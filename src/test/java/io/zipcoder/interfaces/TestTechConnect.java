package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestTechConnect {
	
	@Before
	public void setup() {
		TechConnect.removeStudents();
	}
	
	@Test
	public void testRemoveStudents(){
		boolean emptyList = TechConnect.studentList.isEmpty();
		
		boolean expectedemptyList = true;
		
		Assert.assertEquals(expectedemptyList, emptyList);
	}
	
	@Test 
	public void testRecruitStudent() {
		
		TechConnect.recruitStudent(new Student("Richa"));
		
		double expected = 1;
		
		double actual = TechConnect.getStudents().size();
		
		Assert.assertEquals(expected,actual);
		
		
		
	}

}
