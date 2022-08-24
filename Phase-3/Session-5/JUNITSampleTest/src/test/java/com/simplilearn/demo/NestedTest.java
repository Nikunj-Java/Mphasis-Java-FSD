package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All from OUTER");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All from OUTER");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each from OUTER");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each from OUTER");
	}

	@Test
	@DisplayName("Outer Test from OUTER")
	void testOuter() {
		System.out.println("Test Cases from OUTER");
	}
	
	@Nested
	class Inner{
		
		@BeforeEach
		void setUp() throws Exception {
			System.out.println("Before Each from INNER");
		}

		@AfterEach
		void tearDown() throws Exception {
			System.out.println("After Each from INNER");
		}

		@Test
		@DisplayName("Inner Test")
		void testInner() {
			System.out.println("Test Cases from INNER");
		}
		@Nested
		class Whenx{
			
			@BeforeEach
			void setUp() throws Exception {
				System.out.println("Before Each from WHENX");
			}

			@AfterEach
			void tearDown() throws Exception {
				System.out.println("After Each from WHENX");
			}

			@Test
			@DisplayName("Inner Test")
			void testWhenX() {
				System.out.println("Test Cases from WHENX");
			}
			
		}
		
	}

}
