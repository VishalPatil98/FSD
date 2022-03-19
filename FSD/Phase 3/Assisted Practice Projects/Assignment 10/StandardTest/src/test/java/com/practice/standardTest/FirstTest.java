package com.practice.standardTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("First Testdeemo")
@RunWith(JUnitPlatform.class)
public class FirstTest 
{
	Calculator cal=null;	
	@BeforeAll
	static void setUpForAll()
	{
		System.out.println("This is Before All Test");
	}
	@AfterAll
	static void tearDownForAll()
	{
		System.out.println("This is After All Test");
	}
	
	@BeforeEach
	void setUp()
	{
		cal= new Calculator();
		System.out.println("Object created");
	}
	@AfterEach
	void tearDown()
	{
		cal=null;
		System.out.println("object Destroyed");
	}

	@Test
	void addMethod()
	{
		System.out.println("Test One executed");
		Calculator cal=new Calculator();
		assertEquals(6, cal.add(5, 1));
		
	}

	@Test
	void subMethod()
	{
		System.out.println("Second Test");
		Calculator cal=new Calculator();
		assertNotEquals(1, cal.sub(8, 5));
	}

}
