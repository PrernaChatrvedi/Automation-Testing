package JavaIntro;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Enter the number");
		int fact =1;
		int a = myObj.nextInt();
		for(int i=1; i<=a; i++) {
		fact = fact*i;
			}
			System.out.println(fact);
		}
			
	}


