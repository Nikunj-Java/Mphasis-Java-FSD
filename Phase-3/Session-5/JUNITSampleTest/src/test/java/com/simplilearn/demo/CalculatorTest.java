package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator calc;
	
	@BeforeEach
	public void setup() {
		calc= new Calculator();
		System.out.println("Calculator Initiated");
	}
	
	@AfterEach
	public void tearDown() {
		calc=null;
		System.out.println("Calculator Closed");
	}
	@Test
	public void addtest() {
		assertEquals(7, calc.add(4, 3));
	}
	@Test
	public void subtest() {
		assertEquals(9, calc.sub(12, 3));
		assertNotEquals(7, calc.sub(12, 3));
	}
	
	@Test
	public void multiplytest() {
		assertEquals(12, calc.multiply(4, 3));
		assertNotEquals(30, calc.multiply(12, 3));
	}
	
	@Test
	public void dividetest() {
		assertEquals(10, calc.divide(100, 10));
		assertNotEquals(30, calc.divide(12, 3));
	}

}
