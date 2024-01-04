package com.study;

public class ClassDZ
{
	public String doubleChar(String str) {
	    char result = new har();

	    for (int i = 0; i < str.length(); i++) {
	        
	        result.append(str.charAt(i)).append(str.charAt(i));
	    }

	    return result.toString();
	}
public static void main(String[] args) 
{
System.out.println(new ClassDZ().doubleChar("The"));	
}
	
}
