package controlsttm;
import java.util.Scanner;
public class task7greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj = new Scanner(System.in);
System.out.println("Enter first number");
int num1 = obj.nextInt();
System.out.println("Enter second number");
int num2 = obj.nextInt();
System.out.println("Enter third number");
int num3 = obj.nextInt();
if (num1>num2 && num1>num3) {
	System.out.println("Num1 is greatest: " + num1);
}else if (num2>num1 && num2>num3) {
	System.out.println("Num2 is greatest: " + num2);
}else if (num3>num1 && num3>num2) {
	System.out.println("Num3 is greatest: " + num3);
	}else if (num2==num1 && num3 == num1) {
	System.out.println("All 3 numbers are same");
	}
	}
}
