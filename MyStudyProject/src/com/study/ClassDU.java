package com.study;

public class ClassDU
{
	public String makeAbba(String a, String b) 
	{
	    return a + b + b + a;
}
public static void main(String[] args) 
{
System.out.println(new ClassDU().makeAbba("HI", "Bye"));
}
}