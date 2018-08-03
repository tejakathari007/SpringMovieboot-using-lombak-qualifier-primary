package com.stackroute.exercise.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.excercise.StringReverse;

class TestStringReverse {
	StringReverse obj = new StringReverse();
	@Test
	void Reversetest() {
		assertEquals("ias",obj.reverse("sai"));
	}

	@Test
	void test() {
		assertEquals("ias1",obj.reverse("1sai"));
	}

}
