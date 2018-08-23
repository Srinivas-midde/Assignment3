package com.capgemini.ICICI.domain;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double medical;
	private double hra;
	private double pf;
	private double grossSalary;
	private double netSalary;
	private static double PT=200;
	
	Employee(){
	}	
		
	public Employee(int employeeId,String employeeName){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		
		
	}
	public double calHra(double input) {
		double result= (input*(0.5));
		return result;
	}
	public double salaryCalculation(int basic, int medical) {
		
		this.basicSalary=basic;
		this.medical=medical;
		hra=calHra(basicSalary);
		pf=calPf(basicSalary);
		grossSalary=basicSalary+hra+this.medical;
		netSalary=grossSalary-(pf+PT);
		System.out.println("Employee-ID:"+ employeeId);
		System.out.println("Employee-Name:"+ employeeName);
		System.out.println("Net Salary:"+netSalary);
		
		// TODO Auto-generated method stub
		return netSalary;
	}
	public double calPf(double basic) {
		double result=basic*(0.12);
		// TODO Auto-generated method stub
		return result;
	}

}
