package com.stackroute.excercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConsecutiveNumbersTest {
	ConsecutiveNumbers obj = new ConsecutiveNumbers();

	@Test
	void test() {
		assertEquals("Consecutive numbers", obj.isCheck("98,99,100"));
	}
	void test1() {
		assertEquals("not Consecutive numbers", obj.isCheck("100,1,100"));
	}

}
