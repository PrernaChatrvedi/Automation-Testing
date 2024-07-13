package com.example.hr;
import java.util.Scanner;

public class Employee {
private String empname;
private int empid;
private double salary;
Scanner scr = new Scanner(System.in);

 public void printName() {
	 System.out.println("Enter Your Name:");
	 String name = scr.next();
	 System.out.println("Enter Your Employee ID:");
	 int id = scr.nextInt();
	 System.out.println("Your Employee ID:" + "  " + id + "Your name is: " + "  "+ name);
	 }
 public void printSalary() {
	 System.out.println("Enter Your Salary:");
	 double salary = scr.nextDouble();
	 System.out.println("Your Salary is:"+ salary);
 }
 

}
