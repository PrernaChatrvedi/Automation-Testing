package Task10;

import java.util.Scanner;


public class Employee {
	
	public static void raiseSalary() {
		 Scanner obj = new Scanner(System.in);
	     System.out.println("Enter your ID");
	     int ID =obj.nextInt();
	     System.out.println("Enter your First Name");
	     String firstname=obj.next();
	     System.out.println("Enter your Last Name");
	     String lastname=obj.next();
	     System.out.println("Enter your Salary");
	     double salary= obj.nextDouble();
	     System.out.println("Enter your appraisal rting");
	     float appraisal = obj.nextFloat();
		if(appraisal>=1 && appraisal<=5) {
			salary = salary+((salary *10)/100);
		}else if (appraisal>=6 && appraisal<=8) {
			salary = salary+((salary *20)/100);
		}else if (appraisal>=9 && appraisal<=10) {
			salary = salary+((salary *25)/100);
		}
		System.out.println("Your incremented Salary "+ salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee();
		obj.raiseSalary();
	}

}
