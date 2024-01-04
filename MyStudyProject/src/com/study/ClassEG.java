package com.study;

import java.util.Scanner;

public class ClassEG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ClassEF aobj = new ClassEF();

        System.out.println("Enter Employee Name: ");
        aobj.setEmpName(sc.next());
        System.out.println("Enter Employee ID: ");
        aobj.setEmpId(sc.nextInt());
        System.out.println("Enter Employee Sal: ");
        aobj.setEmpSal(sc.nextInt());
        System.out.println("Enter Employee years of exp.: ");
        aobj.setEmpYearsOfExperience(sc.nextInt());

        aobj.increaseSalary();

        System.out.println("\n<<<Employee Detail>>>");
        System.out.println("Employee Name: " + aobj.getEmpName());
        System.out.println("Employee ID: " + aobj.getEmpId());
        System.out.println("Employee Years of Exp.: " + aobj.getEmpYearsOfExperience());
        System.out.println("Employee Sal: $" + aobj.getEmpSal());

        sc.close();
    }
}