package com.study;



public class ClassDY 
{

	public String firstHalf(String str) {
	    
	        return str.substring(0, str.length()/2);
	    }
	
	
	
	public static void main(String[] args) 
	{
	System.out.println(new ClassDY().firstHalf("WooHoo"));	
	}
}
