package com.stackroute.exercise.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.stackroute.excercise.Palindrome;

class TestPalindrome {
	Palindrome obj= new Palindrome();

	 @Test
	 void test() {
	assertEquals("The given number is a palindrome and even sum is :8",
	 obj.isPalindrome(1441));
	}

	

}
