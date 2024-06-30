package Task11;
import java.util.Scanner;

public class Agecheckcls {
	
	public static void InvalidAgeException(){
		Scanner agecheck = new Scanner(System.in);
		System.out.println("Enter your Age");
		int age = agecheck.nextInt();
		if(age>18) {
			System.out.println("Access Granted");
		}else
		{
			throw new ArithmeticException("Access Decline");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agecheckcls obj = new Agecheckcls();
		obj.InvalidAgeException();
		
	}

}
