package io.zipcoder.interfaces;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;

public class InstructorTest {

	@Test
	public void testImplementation() {
		
		Instructor someInstructor = new Instructor("Julia");
		
		assertTrue(someInstructor instanceof Teacher);
	}
	
	@Test
	public void testInheritance() {
		
		Instructor someInstructor = new Instructor("Julia");
		
		assertTrue(someInstructor instanceof Person);
		
	}
	
	@Test
	public void testTeach() {
		
		Instructor someInstructor = new Instructor("Julia");
		Student student = new Student("Bri");
		
		double expectedTotalStudyTime = 10;
		
		someInstructor.teach(student, expectedTotalStudyTime);
		
		double actualTotalStudyTime = student.getTotalStudyTime();
		
		Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, 0);
	}
	
	@Test
	public void testLecture() {
		
		Instructor someInstructor = new Instructor("Julia");
		Student student = new Student("Bri");
		
		double expectedTotalStudyTime = 10.0;
		
		someInstructor.teach(student,expectedTotalStudyTime);
		
		double actualTotalStudyTime = student.getTotalStudyTime();
		
		Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, 0);
	}
	
}
