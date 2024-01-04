package com.study;
//<<<<<**********Encapsulation(ClassED + ClassEE)**********>>>>>//
import java.util.Scanner;

public class ClassEE 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	
	ClassED aobj=new ClassED();//creating an object for another class present in same package.
	
	/*//<<<<we are getting an compile time error becouse we are accessing private variable>>>
	
	String name=sc.next();//1st way 
	aobj.empName=name;
	
	
	***2nd way***
	System.out.println("Enter Employee Name: ");
	aobj.empName(sc.next());//C.E error
	System.out.println("Enter Employee ID: ");
	aobj.empId(sc.nextInt());
	System.out.println("Enter Employee Dept.: ");
	aobj.empDept(sc.next());
	System.out.println("Enter Employee Sal: ");
	aobj.empSal(sc.nextInt());
	
	*System.out.println("\n<<<Employee Detail>>>");
	
	System.out.println("Employee Name: "+ aobj.empName());
	
	System.out.println("Enter Employee ID: "+aobj.empId());
	
	System.out.println("Enter Employee Dept.: "+aobj.empDept());

	System.out.println("Enter Employee Sal: "+aobj.empSal());
	*
	*
	*/
	
	System.out.println("Enter Employee Name: ");
	aobj.setEmpName(sc.next());
	System.out.println("Enter Employee ID: ");
	aobj.setEmpId(sc.nextInt());
	System.out.println("Enter Employee Dept.: ");
	aobj.setEmpDept(sc.next());
	System.out.println("Enter Employee Sal: ");
	aobj.setEmpSal(sc.nextInt());
	
	System.out.println("\n<<<Employee Detail>>>");
	
	System.out.println("Employee Name: "+ aobj.getEmpName());
	
	System.out.println("Enter Employee ID: "+aobj.getEmpId());
	
	System.out.println("Enter Employee Dept.: "+aobj.getEmpDept());

	System.out.println("Enter Employee Sal: "+aobj.getEmpSal());

	sc.close();
	
	
}
	
}
