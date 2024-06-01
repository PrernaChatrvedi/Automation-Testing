package controlsttm;
import java.util.Scanner;
public class task3printpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =1;
Scanner myobj = new Scanner(System.in);
System.out.println("Enter the number of lines you want to print");
int numline = myobj.nextInt();
for(int i =1; i<=numline; i++) {
	for (int j=1; j<=i; j++){
		System.out.print(num+ "  ");
		num++;
	}
	System.out.println();
}
	}
}
