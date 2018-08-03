package com.stackroute.exercise.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.excercise.NumberLoop;

class TestNumberLoop {

		NumberLoop obj = new NumberLoop();
		
		@Test
		void test() {
			assertEquals("122333",obj.loopCreator(3));
		}

	}
