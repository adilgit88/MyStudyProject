package com.study;

public class ClassBM 
{
public static void main(String[] args) 
{
	int a=34;// a=34
	int b=21;//b=21 a=34
	int c=a++ + ++b;//c=56 a=35 b=22
	
	int d=--a + --b + c--;//d=34+21+56=111 a=34 b=21 c=55
	int e=a + + b + + c + d--;//e=34+21+55+111=221 a=34 b=21 c=55 d=110
	int f=-a + b-- +- c - d++;//f=(-34)+21+(-55)-110=-178   a=34 b=20 c=55 d=111 e=221
	int sum= a+b+c+d+e+f;//sum= 34+20+55+111+221+(-178)=263
	System.out.println("sum ="+sum);//sum =263

}
	
}

