package JavaIntro;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Enter the value of a, b");
		int a = myObj.nextInt();
		int b = myObj.nextInt();
		int swap;
		swap = a;
		a = b;
		b = swap;
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
