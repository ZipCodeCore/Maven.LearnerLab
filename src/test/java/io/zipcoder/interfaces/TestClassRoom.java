package io.zipcoder.interfaces;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class TestClassRoom {

	@Test
	public void testClassRoom() {
		
		HashMap<String, Person> map = ClassRoom.getRoster();

		Assert.assertTrue(map.values().containsAll(ZipCodeWilmington.getInstructorList()));
		


}
	
	@Test
	public void testClassRoom2() {
		
		HashMap<String, Person> map = ClassRoom.getRoster();

		
		Assert.assertTrue(map.values().containsAll(TechConnect.getStudents()));


}
}
