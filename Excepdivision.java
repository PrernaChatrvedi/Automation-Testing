package Task11;

import java.util.Scanner;
public class Excepdivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner div = new Scanner(System.in);
System.out.println("Enter First Number");
int firstnumber = div.nextInt();
System.out.println("Enter Second Number");
int secondnumber = div.nextInt();

try {
	System.out.println("Division of above numbers are: ");
	System.out.println(firstnumber/secondnumber);
	
}catch(ArithmeticException e){
	System.out.println(e.getMessage());
}
	}

}
