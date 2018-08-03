package com.stackroute.excercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatrixTest {
	Matrix obj = new Matrix();

	@Test
	void test() {
		int[][] arr1= {{1,2},{1,2}};
		int[][] arr2= {{1,2},{1,2}};
		int[][] arr3= {{2,4},{2,4}};
assertArrayEquals(arr3, obj.matrixAdd(arr1,arr2,2,2));
	}

}
