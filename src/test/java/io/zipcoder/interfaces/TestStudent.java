package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

	@Test
	public void testImplementation() {
		Student Bridget = new Student("");
		Assert.assertTrue(Bridget instanceof Learner);
	}
	
	@Test
	public void testInheritance() {
		Student Bridget = new Student("");
		Assert.assertTrue(Bridget instanceof Person);
	}
	
	@Test
	public void testLearn()
	{
		//Given
		double expectedNumberOfHours = 40;
		Student aRandoStudent = new Student ("Bridget");
		
		//When
		aRandoStudent.learn(40);
		double actual = aRandoStudent.getTotalStudyTime();
		
		//Then
		Assert.assertEquals(expectedNumberOfHours, actual, 0);
	}

}
