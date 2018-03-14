package com.sample.maven.ex;

import org.junit.Assert;
import org.junit.Test;

import com.sample.maven.ex.App;

public class AppTest {

	@Test
	public void testLengthOfTheUniqueKey() {

		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());

	}
}
