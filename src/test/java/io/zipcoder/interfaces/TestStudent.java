package io.zipcoder.interfaces;

import static org.junit.Assert.*;
import org.junit.Assert;

import org.junit.Test;

public class TestStudent {

	@Test
	public void testImplementation() {

		Student someStudent = new Student("Nashae");

		assertTrue(someStudent instanceof Learner);

	}

	@Test
	public void testInheritance() {

		Student someStudent = new Student("Nashae");

		assertTrue(someStudent instanceof Person);

	}

	@SuppressWarnings("deprecation")
	@Test
	public void testLearn() {

		Student someStudent = new Student("Nashae");

		double expectedTotalStudyTime = 1;

		someStudent.learn(1);

		double actualTotalStudyTime = someStudent.getTotalStudyTime();

		Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime,0);

	}
}