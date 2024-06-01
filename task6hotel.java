package controlsttm;
import java.util.Scanner;
public class task6hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float amount=0;
Scanner obj = new Scanner(System.in);
System.out.println("Enter number of month");
int month = obj.nextInt();
System.out.println("Enter room rent");
float rent = obj.nextFloat();
System.out.println("Enter number of days you want to stay");
int days = obj.nextInt();
if (month<1 || month>12) {
	System.out.println("Invalid input");
}else if((month>=4 && month<=6) || (month==11 && month==12)) {
	 amount = ((rent * days)+(rent*20/100));
		System.out.println("Total amount to be paid: "+ amount);
}else {
	amount = (rent * days);
	System.out.println("Total amount to be paid: "+ amount);
}
	}

}
