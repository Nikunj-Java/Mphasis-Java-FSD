package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

class DynamicTestCase {

	@TestFactory
	Collection<DynamicTest> dynamicTestDemo(){
		
		return Arrays.asList(
				dynamicTest("Test 1", ()->assertTrue(12>0)),
				dynamicTest("Test 2", ()->assertFalse(0>1)),
				dynamicTest("Test 3", ()->assertEquals(12,8+4)),
				dynamicTest("Test 4", ()->assertNull(null)),
				dynamicTest("Test 5", ()->assertThrows(RuntimeException.class,
						()->{throw new RuntimeException("Not Valid");})),
				dynamicTest("Test 6", new MyExecutable())
		);
	}
	
	class MyExecutable implements Executable
	{

		@Override
		public void execute() throws Throwable {
			System.out.println("From My  Executable Class");
			
		}
		
	}

}
