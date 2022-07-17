package com.bridgelabz.testngProgram;

import org.testng.annotations.Test;

public class TestngPriority {
	
	@Test(priority = 2)
	public void testCase1() {
		System.out.println("I am inside the test case 1");
	}
	
	@Test(priority = 3)
	public void testCase2() {
		System.out.println("I am inside the test case 2");
	}
	
	@Test(priority = 1)
	public void testCase3() {
		System.out.println("I am inside the test case 3");
	}
}
