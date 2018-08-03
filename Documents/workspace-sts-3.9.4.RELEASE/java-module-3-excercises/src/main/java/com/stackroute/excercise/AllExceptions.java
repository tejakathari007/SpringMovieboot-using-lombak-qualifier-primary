package com.stackroute.excercise;

public class AllExceptions {
	public static void main(String[] args) {
		AllExceptions ex = new AllExceptions();
        ex.outOfBounds();
        ex.negativeArraySize();
        ex.nullPointer();
    }

    /**
     * method to handle nullpointerException
     */
    public void nullPointer() {
        try {
            int[] array = null;
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } catch (NullPointerException e) {
            System.out.println("tried to access null element");
        }
    }

    /**
     * method to handle negativeArraySizeException
     */
    public void negativeArraySize() {
        try {
            int n = -1;
            int[] array = new int[n];
        } catch (NegativeArraySizeException e) {
            System.out.println("array size is negative");
        }
    }

    /**
     * method to handle ArrayOutOfBoundException
     */
    public void outOfBounds() {
        try {
            int n = 1;
            int[] array = new int[1];
            array[2] = 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("tried accessing more elements than available");

        }
    }
}