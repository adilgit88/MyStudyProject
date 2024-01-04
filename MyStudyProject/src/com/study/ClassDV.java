package com.study;

public class ClassDV
{
	public String makeOutWord(String out, String word) 
	{
		return out.substring(0,2)+word+out.substring(2);
		
		/*
		String start = out.substring(0, 2);
	    String end = out.substring(2);
	    return start + word + end;
		*/
}
public static void main(String[] args) 
{
System.out.println(new ClassDV().makeOutWord("<<>>", "yah"));
}
	
}
