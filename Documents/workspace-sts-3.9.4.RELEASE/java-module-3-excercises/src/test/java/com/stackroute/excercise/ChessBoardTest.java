package com.stackroute.excercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChessBoardTest {
	ChessBoard obj=new ChessBoard();

	@Test
	void test() {
		String[][] arr1= {{"WW|","BB|"},{"BB|","WW|"}};
       assertArrayEquals(arr1, obj.printingBoard(2));
	}

}
