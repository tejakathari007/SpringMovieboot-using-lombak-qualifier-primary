package com.stackroute.exercise.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.excercise.InputCheck;

class TestInputCheck {

	InputCheck obj = new InputCheck();
	@Test
	void test() {
		assertEquals("Digit",obj.check("5"));
	}

}
