package com.study;

public class ClassDT 
{
	public String helloName(String name) {
	    return "Hello " + name + "!";//1st way
	    //return "hello""+name"!";//2nd way
	    //return "Hello".concat(name)+"!";//3rd way
	}
public static void main(String[] args) 
{
	
	System.out.println(new ClassDT().helloName("Bob"));	
	
}
	
}
