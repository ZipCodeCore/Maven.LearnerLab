package io.zipcoder.interfaces;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class ClassRoomTest {
	
	@Test
	
	public void getRosterTest(){
		
		//Given
		HashMap<String, Person> testRoster = new HashMap<String, Person>();
		
		//when
		
		testRoster = ClassRoom.getRoster();
		
		//Then
		
		for(int i = 0; i <= (TechConnect.getStudents().size() -1); i++){
			System.out.println(TechConnect.getStudents().get(i).getName());
			
			Assert.assertTrue(testRoster.containsKey(TechConnect.getStudents().get(i).getName()));
			
		}
		
		for(int i=0; i<=ZipCodeWilmington.getInstructors().size() -1; i++){
			
			Assert.assertTrue(testRoster.containsKey(ZipCodeWilmington.getInstructors().get(i).getName())&& testRoster.get(ZipCodeWilmington.getInstructors().get(i).getName()) !=null);
		}
		
	}

}
