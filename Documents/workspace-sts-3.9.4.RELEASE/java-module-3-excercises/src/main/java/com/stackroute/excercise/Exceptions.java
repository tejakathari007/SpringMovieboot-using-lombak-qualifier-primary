package com.stackroute.excercise;

public class Exceptions {
	    Exceptions(String msg) {
	        String message = "this is bound to execute";
	        System.out.println(message);
	    }
	 
	    public static void main(String[] args) throws Exception {
	        try {
	        	System.out.println("In try block");
	            throw new Exception();
	        }
	        catch (Exception e) {
	            System.out.println("In catch block "+e.getMessage());
	        } 
	        finally {
	            System.out.println("In finally Block");
	        }
	 
	    }
	}


