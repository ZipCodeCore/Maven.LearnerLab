package io.zipcoder.interfaces;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TechConnectTest {
	
	@Before
	public  void setup(){
		
		TechConnect.removeStudents();
		
	}
	
	@Test
	
	public void removeStudentsTest(){
		
		//Given	
		
		//When
		TechConnect.removeStudents();		
				
		//Then
				
		Assert.assertTrue(TechConnect.getStudents().isEmpty());
	}
	
	@Test
	
	public void recruitStudentTest(){
		
		//Given
		Student testStudent = new Student("BillyBob");
		String expected = "BillyBob";
		
		//When
		TechConnect.recruitStudent(testStudent);
		String actual = TechConnect.getStudents().get(TechConnect.getStudents().size() - 1).getName();
		
		
		//Then
		
		Assert.assertEquals(expected, actual);
	}
	
	

}
