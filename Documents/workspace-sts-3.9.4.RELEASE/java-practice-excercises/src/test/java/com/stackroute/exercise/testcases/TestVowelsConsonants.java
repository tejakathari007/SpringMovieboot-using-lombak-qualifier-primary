package com.stackroute.exercise.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.excercise.VowelsConsonants;

class TestVowelsConsonants {

	@Test
	 void test() {
	assertEquals("VowelVowel",VowelsConsonants.vowelConsonantCheck("ae"));
	}

}
