package io.zipcoder.interfaces;
import static org.junit.Assert.*;

import org.junit.Test;
import junit.framework.Assert;

public class TestStudent {
	@Test
	public void testImplementation(){
		Student student = new Student("Julia");
		
		assertTrue(student instanceof Person);
	}
	
	@Test
	public void testInheritance(){
		Student student = new Student("Julia");
		
		assertTrue(student instanceof Learner);
		
	}
	@Test
	public void testLearn() {
		Student student = new Student("Julia");
		
		double expectedTotalStudyTime = 7;
		
		student.learn(7); //this is for the actual
		
		double actualTotalStudyTime = student.getTotalStudyTime();
		
		Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, 0);
	}
}
