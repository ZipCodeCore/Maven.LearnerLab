package io.zipcoder.interfaces;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class StudentTest {

	@Test
	public void testImplementation() {

		Student someStudent = new Student("Bri");
		
		assertTrue(someStudent instanceof Person);

	}
	
	@Test
	public void testInheritance() {

		Student someStudent = new Student("Bri");
		
		assertTrue(someStudent instanceof Learner);

	}
	
	@Test
	public void testLearn() {

		Student someStudent = new Student("Bri");
		
		double expectedTotalStudyTime = 5;
		
		someStudent.learn(5);
		
		double actualTotalStudyTime = someStudent.getTotalStudyTime();
		
		Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime,0);
		
		
	}
	
}
