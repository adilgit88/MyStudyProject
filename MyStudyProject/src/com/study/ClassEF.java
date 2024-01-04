package com.study;
public class ClassEF {
    private String empName;
    private int empId;
    private int empSal;
    private int empYearsOfExperience;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpSal() {
        return empSal;
    }

    public void setEmpSal(int empSal) {
        this.empSal = empSal;
    }

    public int getEmpYearsOfExperience() {
        return empYearsOfExperience;
    }

    public void setEmpYearsOfExperience(int empYearsOfExperience) {
        this.empYearsOfExperience = empYearsOfExperience;
    }

    
    public void increaseSalary() {
        if (empYearsOfExperience >= 5) {
           
            empSal = (int) (empSal * 1.30);
            System.out.println("Congratulations, " + empName + "!");
            System.out.println("Your salary has been increased to: $" + empSal);
        } else {
            System.out.println("Sorry, " + empName + ". Your salary remains unchanged.");
        }
    }
}


