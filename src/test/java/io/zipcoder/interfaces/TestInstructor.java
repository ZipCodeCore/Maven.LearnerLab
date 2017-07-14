package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

	@Test
	public void testImplementation() {
		Instructor Leon = new Instructor("");
		Assert.assertTrue(Leon instanceof Teacher);
		
	}
	
	@Test
	public void testInheritance() {
		Instructor Leon = new Instructor("");
		Assert.assertTrue(Leon instanceof Person);
	}
	
	@Test
	public void testTeach()
	{
		//Given
		double expectedNumberOfHours = 40;
		Student aRandoStudent = new Student ("Bridget");
		Instructor someInstructor = new Instructor ("David");
		
		//When
		someInstructor.teach(aRandoStudent, 20);
		double actual = aRandoStudent.getTotalStudyTime();
		
		//Then
		Assert.assertEquals(expectedNumberOfHours, actual, 20);
	}
	

	
	@Test
	public void testLecture()
	{
		//Given
		double expectedNumberOfHours = 30;
		Instructor someInstructor = new Instructor("David");
		Student aCoolStudent1 = new Student("Bridget");
		Student aCoolStudent2 = new Student("Richa");
		Student aCoolStudent3 = new Student("Julia");
		Student[] classroom = new Student[3];
		classroom[0] = aCoolStudent1;
		classroom[1] = aCoolStudent2;
		classroom[2] = aCoolStudent3;
		
		//When
		someInstructor.lecture(classroom, 20.0);
		
		double totalTime = 0;
		
		for (int i=0; i<classroom.length; i++)
		{
			double s = classroom[i].getTotalStudyTime();
			totalTime += s;
			
		}
		
		double actual = totalTime;
		
		
		//Then
		Assert.assertEquals(expectedNumberOfHours, actual, 10);
	}

}
