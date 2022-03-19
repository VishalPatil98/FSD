package com.practice.assertions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("Assertion")
@RunWith(JUnitPlatform.class)
public class Assertions 
{
	@Test
	void tet()
	{
		int a=10;
		int b=2;
		assertFalse(a<b);
		assertNull("hello");
		assertEquals(12, a+b);
	}
	
}
