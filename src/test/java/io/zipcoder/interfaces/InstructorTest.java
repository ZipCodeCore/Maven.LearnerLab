package io.zipcoder.interfaces;
import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

	@Test
	
	public void testImplementation(){
		
		//Given
		
		Instructor testInstructor = new Instructor("Brendan");
		
		//Then
		
		Assert.assertTrue(testInstructor instanceof Person);
	}
	
	@Test
	
	public void InheritanceTets(){
		
		//Given
		
		Instructor testInstructor = new Instructor("Brendan");
		
		//Then
		Assert.assertTrue(testInstructor instanceof Teacher);
		
	}
	
	@Test
	
	public void TeachTest(){
		
		//Given
		Instructor testInstructor = new Instructor("Brendan");
		Student testStudent = new Student("Joe", 10);
		double numberOfHours = 10;
		double expected = 20;
		
		//When
		
		testInstructor.teach(testStudent, numberOfHours);
		
		//Then
		Assert.assertTrue(testStudent.getTotalStudytime() == expected);
		
		
		
	}
	
	@Test
	
	public void lectureTest(){
		
		//Given
		Instructor testInstructor = new Instructor("Brendan");
		double numberOfHours = 30;
		Student [] student = new Student[3];
		Student testStudent1 = new Student("Bob", 10);
		Student testStudent2 = new Student("Joe", 10);
		Student testStudent3 = new Student("Mary" , 20);
		student[0] = testStudent1;
		student[1] = testStudent2;
		student[2] = testStudent3;
		
		
		//When
		testInstructor.lecture(student, numberOfHours);
		
		//Then
		Assert.assertTrue(student[0].getTotalStudytime() == 20);
		Assert.assertTrue(student[1].getTotalStudytime() == 20);
		Assert.assertTrue(student[2].getTotalStudytime() == 30);
	}
	
	
}
