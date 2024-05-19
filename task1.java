package JavaIntro;
import java.util.Scanner;  // Import the Scanner class

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Enter the value of a, b,c, d");
		int a = myObj.nextInt(); 
		int b = myObj.nextInt(); 
		int c = myObj.nextInt(); 
		int d = myObj.nextInt(); 
		 System.out.println("a: " + a); 
		 System.out.println("b: " + b);
		 System.out.println("c: " + c);
		 System.out.println("d: " + d);// Output user input

int sumab, sumcd;
sumab = a+b;
System.out.println(sumab);
sumcd = c+d;
System.out.println(sumcd);
if(sumab>sumcd) {
	System.out.println("Sum of a+b is greater than c+d");
}else {
	System.out.println("Sum of c+d is greater than a+b");
}

	}

}
