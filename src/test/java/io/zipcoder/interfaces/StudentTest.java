package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
	
	@Test
	public void testImplemenation(){
		Student student = new Student("");
		Assert.assertTrue(student instanceof Learner);
	}
	
	@Test
	public void testInheritance() {
		Student student = new Student("");
		Assert.assertTrue(student instanceof Person);
		
	}
	
	@Test 
	public void testLearn() { 
		
		//if
		double expectedNumberOfHours = 3;
		Student someStudent = new Student("Richa");
		
		
		//when
		someStudent.learn(3);
		
		double actual = someStudent.getTotalStudyTime();
		
		//Then
		Assert.assertEquals(expectedNumberOfHours, actual,0);
	}
	
	

}
