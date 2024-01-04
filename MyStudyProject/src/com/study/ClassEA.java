package com.study;

public class ClassEA 

{
void meth1()
{
System.out.println("String vs StrungBuffer vs StringBuilder\n");
	String s1=new String ("java");
	StringBuffer buffer1=new StringBuffer("java");
	StringBuilder builder1=new StringBuilder("java");
	
	System.out.println("=======Before============");
	
	System.out.println("String class :" +s1);
	System.out.println("StringBuffer class:"+buffer1);
	System.out.println("StringBuilder class:"+builder1);
	
	String data=s1.concat("is awesome");
	s1.concat("is awesome");
	buffer1.append("is awesome");
	builder1.append("is awesome");
	
	System.out.println("\n=========After=======");
	
	System.out.println("String class: "+s1);
	System.out.println("StringBuffer class:"+buffer1);
	System.out.println("StringBuilder class :"+builder1);
	System.out.println("data:"+data);
	System.out.println(s1);
	
	
}
public static void main(String[] args) {
	ClassEA aobj=new ClassEA();
	aobj.meth1();

}


}
