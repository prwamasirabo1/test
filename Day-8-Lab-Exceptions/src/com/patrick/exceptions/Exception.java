package com.patrick.exceptions;

//public class EvenNumberException extends Exception {
	
//}
	public class EvenNumberException extends Exception{
	    @Override
	    public String getMessage() {
	        return "You cannot input an even number.";
	    }

}
