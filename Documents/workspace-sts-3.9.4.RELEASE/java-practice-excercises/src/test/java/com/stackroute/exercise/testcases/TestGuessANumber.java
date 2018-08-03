package com.stackroute.exercise.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.excercise.GuessANumber;

class TestGuessANumber {

		@Test
		void randomGuessTest() {
			assertEquals("Number guessed is less than original number", GuessANumber.randomGuess(25, 16));
		}

		@Test
		void randomGuessTest1() {
			assertEquals("Number guessed is more than original number", GuessANumber.randomGuess(6, 16));
		}

		@Test
		void randomGuessTest2() {
			assertEquals("Number guessed matches the original number", GuessANumber.randomGuess(16, 16));
		}
}
