package controlsttm;
import java.util.Scanner;

public class gradingsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj = new Scanner(System.in);
System.out.println("Enter your marks here:");
  int marks = obj.nextInt();
  if(marks>100) {
	  System.out.println("Invalid Input");
  }else if(marks==100)  {
	  System.out.println("Grade S");
  }else if(marks>=90)  {
	  System.out.println("Grade A");
  }else if(marks>=80)  {
	  System.out.println("Grade B");
  }else if(marks>=70)  {
	  System.out.println("Grade C");
  }else if(marks>=60)  {
	  System.out.println("Grade D");
  }else if(marks>=50)  {
	  System.out.println("Grade E");
  }else if(marks<50)  {
	  System.out.println("Grade F");
  }
	}

}
