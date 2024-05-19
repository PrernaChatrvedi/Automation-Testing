package JavaIntro;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Enter the number:");
		int a = myObj.nextInt();
		if(a%2==0)
		{
			 System.out.println("Entered the is even number");
		}else {
			 System.out.println("Entered the is old number");
		}
	}

}
