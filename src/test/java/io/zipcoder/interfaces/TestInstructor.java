package io.zipcoder.interfaces;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

	@Test
	public void testImplementation() {

		Instructor someInstructor = new Instructor("Leon");

		assertTrue(someInstructor instanceof Teacher);

	}

	@Test
	public void testInheritance() {

		Instructor someInstructor = new Instructor("Leon");

		assertTrue(someInstructor instanceof Person);

	}

	@Test
	public void testTeach() {

		Instructor someInstructor = new Instructor("Leon");
		Student a = new Student("Nashae");
		double expectedTotalStudyTime = 3;

		someInstructor.teach(a, 3);

		double actual = a.getTotalStudyTime();

		Assert.assertEquals(expectedTotalStudyTime, actual, 0);

	}

	@Test
	public void testLecture() {

		Instructor someInstructor = new Instructor("Leon");
		
		Student a = new Student("Lee");
		Student b = new Student ("Lu");
		Student c = new Student ("bop");
	

		Student[] myStudentArray = { a, b, c };

		double expected = 1;

		someInstructor.lecture(myStudentArray, 3);
		for (int i = 0; i < myStudentArray.length; i++) {
			
			Student currentStudent = myStudentArray[i];
			double actual = currentStudent.getTotalStudyTime();
			
			Assert.assertEquals(expected, actual,0);
		}

	}

}
