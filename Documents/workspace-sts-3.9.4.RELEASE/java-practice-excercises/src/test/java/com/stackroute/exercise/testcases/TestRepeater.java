package com.stackroute.exercise.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.excercise.Repeater;

class TestRepeater {	
	Repeater obj = new Repeater();

@Test
void test() {
	assertEquals("stackrouterouterouterouterouterouteroute", obj.stringRepeater("stackroute", 5));
}
}
