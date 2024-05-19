package JavaIntro;

import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Enter the number");
		 int n = myObj.nextInt();
		 int count = 0; 
		do
		{
			n=n/10;
			count++;	
		}
		while(n!=0);
		System.out.println(count);
			
	}

}
