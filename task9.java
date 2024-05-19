package JavaIntro;

import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Enter the age of the person:");
		int age = myObj.nextInt();
		if(age>60) {
			System.out.println(" Person is senior");
		}else {
			System.out.println(" Person is not senior");
		}
	}

}
