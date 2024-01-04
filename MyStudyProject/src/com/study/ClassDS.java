package com.study;

import java.util.Arrays;
import java.util.Scanner;

public class ClassDS 
{
void meth1()
{
	String s1="Java";
	String s2=new String("Java");
	String s3="Java";
	String s4=new String("Java");

//================ equals()===========
	System.out.println(s1.equals(s2));

	System.out.println(s2.equals("java"));
	System.out.println(s1.equalsIgnoreCase("java"));
	
	System.out.println(s3.equals(s1));
	System.out.println("java".equals("java"));
	System.out.println("java".equals(new String("Java")));
	System.out.println(s4.equals(s1));
	System.out.println(new String("java").equals(new String("java")));
	System.out.println("===========================");
	
//================================================
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s2==s4);
	System.out.println(s4=="java");
	System.out.println("java"=="java");
	System.out.println(new String("java")==new String("java"));
	System.out.println("java"==s1);
}
void meth2()
{
	
	System.out.println("implementing String Class methods");
	String s1="java";
	System.out.println("length() :"+s1.length());
	System.out.println("length() :"+s1.concat("is awesome"));
	System.out.println("s1 :"+s1);
	System.out.println("length() :"+s1.concat(" si awesome").length());
	System.out.println("charAt() :"+s1.charAt(0));
	//System.out.println("CharAt() :"+s1.charAt("Spring".length()));
	System.out.println("CharAt() :"+s1.charAt(6/2));
	
	Scanner sc= new Scanner(System.in);
	System.out.println("please enter your gender : (M/F)");
	char gender =sc.next().charAt(0);
	switch(gender)
	{
	case 'f','F':
		System.out.println("user is female");
	break;
	
	case 'm','M':
		System.out.println("user is Male");
	default:
		System.out.println("invalid input");
		
				
{
sc.close();	

	String s2="java is awesome";
	System.out.println("starsWith () :"+s2.startsWith(s1));
	System.out.println("starsWith () :"+s2.startsWith("java"));
	System.out.println("starsWith () :"+s2.startsWith("J"));
	
	System.out.println("toLowerCase () :"+s2.toLowerCase());
	System.out.println("toUperCase () :"+s2.toUpperCase());
	System.out.println(s2);
	
	//=================substring()=================
	
	System.out.println("substring () :"+s2.substring(8));
	System.out.println("substring () :"+s2.substring(8,11));
	System.out.println("substring () :"+s2.substring(3,9));
	
	String s3="Hello World";
	System.out.println("replace() :"+s3.replace('o', 'O'));
	
	String s4="I Love Java";
	System.out.println(s4.length());
	System.out.println("trim():"+s4.trim().length());
	
	System.out.println("indxOf() :"+s3.indexOf('o'));
	System.out.println("lastindxOf() :"+s3.lastIndexOf('o'));
	
	String s5="ABCDEF";
	byte arr[]=s5.getBytes();
	System.out.println(Arrays.toString(arr));
	for(byte x:arr)
	{
		System.out.print((char)x);
	}
	}
	}
}
public static void main(String[] args) 
{
	
ClassDS aobj=new ClassDS();
//aobj.meth1();
aobj.meth2();
}
}
