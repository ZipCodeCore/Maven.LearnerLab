package io.zipcoder.interfaces;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;

public class TestInstructor {

	@Test
	public void testImplementation(){
		
		Instructor instructor = new Instructor("Leon");
		assertTrue(instructor instanceof Teacher);
	}
	
	@Test
	public void testInheritance() {
		Instructor instructor = new Instructor("Leon");
		assertTrue(instructor instanceof Person);
		
	}
	
	
		@Test
	public void testTeach(){
			Instructor instructor = new Instructor("Leon");
			Student student = new Student("Julia");
			
			double expectedTotalStudyTime = 8;
			instructor.teach(student, expectedTotalStudyTime);
			
			double actualTotalStudyTime = student.getTotalStudyTime();
			
			Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, 0);
		}
		
	@Test
	public void testLecture() {
		Instructor instructor = new Instructor("Leon");
		Student student = new Student("Julia");
		
		double expectedTotalStudyTime = 8;
		instructor.teach(student, expectedTotalStudyTime);
		
		double actualTotalStudyTime = student.getTotalStudyTime();
		
		Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, 0);
	}
		
}
