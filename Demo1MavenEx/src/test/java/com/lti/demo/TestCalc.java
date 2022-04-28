package com.lti.demo;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;



class TestCalc {
	
	Calculator c= new Calculator();
	
	
	@Disabled
	@Test
	public void  testHello()
	{
		Assertions.assertEquals("hello world", c.sayHello());
	}
	
	
	@Test
	public void testAddition()
	{
		Assertions.assertEquals(300, c.addNos(300, 200));
	}
	
	@Test
	public void testSubtract() {
		Assertions.assertEquals(100,c.subNos(200,100),"check the code again  ");		
	}
	
	@Disabled
	@Test
	void testAssertFalse() {	
		Assertions.assertFalse("Meenal".length() == 10);
		Assertions.assertFalse(10 > 20, "assertion message");
	}
	
	@Test
	void testAssertNull() {
	     String str1 = null;
		 String str2 = "abc";
		 Assertions.assertNull(str1);         // str 1 is null - condition is ok  test case ok 
		 Assertions.assertNotNull(str2);	 // str2 - notnull ? - condtion is ok - test case ok 
	}
	
	@Test
	public void testEmptyArrayList() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Assertions.assertEquals(0, al.size());
		Assertions.assertTrue(al.isEmpty()); // assertTrue Method
		al.add(100);
		al.add(200);		
		Assertions.assertEquals(2, al.size());
		// assertFalse(al.isEmpty());
	}
	

}
