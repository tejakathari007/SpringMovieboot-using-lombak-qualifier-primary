package com.stackroute.exercise.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.excercise.ConditionalCheck;

class TestConditionalCheck {
	ConditionalCheck obj=new ConditionalCheck();
	@Test
	void test() {
		assertEquals("Tom", obj.isConditional(25));
	}

}
