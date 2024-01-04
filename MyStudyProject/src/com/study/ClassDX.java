package com.study;

public class ClassDX 
{

	public String extraEnd(String str) {
	    if (str.length() >= 2) {
	        String s = str.substring(str.length() - 2);
	        return s + s + s;
	    } else {
	        return "String length should be at least 2";
	    }
	}
public static void main(String[] args) 
{
System.out.println(new ClassDX().extraEnd("Hello"));	
}
}

