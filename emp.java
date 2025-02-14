package com.sunbeam;

import java.util.Scanner;

class Employee
{
	//Fields 
	private int empid; //Instance variable 
	private String name; //Instance variable 
	private float salary; //Instance Variable 
	//Methods 
	// this = emp 
	public void acceptRecord( )
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Name : ");
		this.name = sc.nextLine();
		System.out.println("Empid : ");
		this.empid = sc.nextInt(); 
		System.out.println("Salary : ");
		this.salary = sc.nextFloat(); 
	}
	//this = emp 
	public void printRecord( )
	{
		System.out.println("Name : "+this.name);
		System.out.println("Empid : "+this.empid);
		System.out.println("Salary : "+this.salary);
	}
}
public class Program {
	
	
	public static void main(String[] args) {
		Employee emp = new Employee(); 
		emp.acceptRecord(); // emp.acceptRecord(emp); 
		emp.printRecord(); //emp.printRecord(emp); 

	}

}
