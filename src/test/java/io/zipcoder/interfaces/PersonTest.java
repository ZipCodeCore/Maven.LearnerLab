package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

	@Test
	public void testSetName() {
		// Given:
		Person person = new Person("Bri");
		String expected = "Bri";

		// When:
		person.setName("Bri");
		String actual = person.getName();

		// Then:
		Assert.assertEquals(expected, actual);
	}


}
