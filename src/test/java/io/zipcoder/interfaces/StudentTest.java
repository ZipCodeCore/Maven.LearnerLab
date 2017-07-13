package io.zipcoder.interfaces;
import org.junit.Assert;
import org.junit.Test;


public class StudentTest {
	
	
	@Test
	
	public void inheritanceTest(){
		
		//Given
		
		Student testStudent = new Student("Brendan", 10);
		
		//When
		
		//Then
		Assert.assertTrue(testStudent instanceof Person);
	}
	
	@Test
	
	public void implementationTest(){
		
		//Given
		
		Student testStudent = new Student("Brendan" , 10 );
		
		//Then
		
		Assert.assertTrue(testStudent instanceof Lerner);
	}
	
	
	
	@Test
	
	public void getTotalStudyTimeTest(){
		
		//Given
		Student testStudent = new Student("Brendan", 10);
		double expected = 10;
		
		
		
		//When
		double actual = testStudent.getTotalStudytime();
		
		//Then
		Assert.assertEquals(expected, actual, 0);
		
		
	}
	
	
	
	
	
	@Test

	public void learnTest(){
		
		//Given
		Student testStudent = new Student("Brendan", 10);
		
		
		//When
		
		testStudent.learn(10);
		
		//Then
		Assert.assertTrue(testStudent.getTotalStudytime() == 20);
	}

}
