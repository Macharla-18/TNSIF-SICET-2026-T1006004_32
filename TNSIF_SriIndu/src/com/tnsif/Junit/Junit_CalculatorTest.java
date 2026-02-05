package com.tnsif.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Junit_CalculatorTest {

	static Junit_Calculator c;
	
	@BeforeAll
	static void beforeAll() {
		c=new Junit_Calculator();
		System.out.println("Before All Tests");
	}
	@BeforeEach
	void beforeEach() {
		System.out.println("Before Each Test");
	}
	@Test
	void testAdd() {
		assertEquals(10,c.add(5, 5));
		assertNotEquals(5,c.add(3, 3));
	}
	@Test
	void testDivide() {
		assertEquals(2,c.divide(10, 5));
	}
	@Test
	void testException() {
		assertThrows(ArithmeticException.class,()->{c.divide(10, 0);});
	}
	@Test
	void testString() {
		assertNotNull(c.getName());
		assertEquals("Junit",c.getName());
		assertTrue(c.getName().startsWith("J"));
		assertFalse(c.getName().isEmpty());
	}
	@Test
	void testMultipleAssertions() {
		assertAll(
				()->assertEquals(4,c.add(2, 2)),
				()->assertTrue(c.add(3, 3)==6),
				()->assertNotNull(c)
				);
	}
	@Disabled("Under Development")
	@Test
	void disabledTest() {
		fail("This test is disabled");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("After Each Test");
	}
	@AfterAll
	static void afterAll() {
		System.out.println("After All Tests");
	}
}
