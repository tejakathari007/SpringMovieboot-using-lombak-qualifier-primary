package com.stackroute.exercise.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.excercise.Sorting;

class TetstSorting {

	Sorting obj = new Sorting();
	@Test
	void sortTest() {
		assertEquals(3444566,obj.sort(4364654));
	}

	@Test
	void evenSumTest() {
		assertEquals(24,obj.evenSum(4364654));
	}

	@Test
	void checkSumTest() {
		assertEquals(true,obj.checkSum(24));
	}

}
