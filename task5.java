package JavaIntro;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Enter the number");
		int a = myObj.nextInt();
		int flag =0;
		for(int i=1; i<=a; i++) {
		if(a%i==0) {
			flag++;
		}
		}
		if (flag<=2)
		{
		
			 System.out.println("Entered the number is prime");
		}
			 else {
				 System.out.println("Entered the number is not prime");
			 }
			 }
	}


