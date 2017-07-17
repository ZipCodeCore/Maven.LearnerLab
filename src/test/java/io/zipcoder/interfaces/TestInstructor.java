package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
	
	@Test
	public void testImplemenation(){
		Instructor instructor = new Instructor("");
		Assert.assertTrue(instructor instanceof Teacher);
	}
	
	@Test
	public void testInheritance() {
		Instructor instructor = new Instructor("");
		Assert.assertTrue(instructor instanceof Person);
	}
	
	@Test
	public void testTeach() {
		
		//if
		
		double expectedNumberOfHours = 4;
		Instructor someInstructor = new Instructor("David");
		Student someStudent = new Student("Richa");
		
		//when
		someInstructor.teach(someStudent, expectedNumberOfHours);
		
		double actual = someStudent.getTotalStudyTime();
		
		//Then
		Assert.assertEquals(expectedNumberOfHours, actual,0);


	}
	
	@Test
	public void testLecture() {
	
	//if
	double expectedNumberOfHoursTaught = 4;
	double expectedHoursPerStudent = 4/3.0;
	Instructor someInstructor = new Instructor("David");
	Student someStudent1 = new Student("Richa");
	Student someStudent2 = new Student("Bridget");
	Student someStudent3 = new Student("Julia");
	Student[] classroom = new Student[3];
	classroom[0] = someStudent1;
	classroom[1] = someStudent2;
	classroom[2] = someStudent3;
	
	
	//when 
	someInstructor.lecture(classroom, expectedNumberOfHoursTaught);
	
	
	double actual1 = someStudent1.getTotalStudyTime();
	double actual2 = someStudent2.getTotalStudyTime();
	double actual3 = someStudent3.getTotalStudyTime();
	
	//Then 
	Assert.assertEquals(expectedHoursPerStudent, actual1,0);
	Assert.assertEquals(expectedHoursPerStudent, actual2,0);
	Assert.assertEquals(expectedHoursPerStudent, actual3,0);
	}
	
}
