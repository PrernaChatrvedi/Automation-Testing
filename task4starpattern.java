package controlsttm;
import java.util.Scanner;

public class task4starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner myobj = new Scanner(System.in);
System.out.println("Enter the number o line you want to print");
int linenum = myobj.nextInt();
for (int i = 1; i<=linenum; i++) {
	for (int j=1; j<i; j++) {
		System.out.print(" ");
	}
	for (int j = i; j <= linenum; j++) {
	System.out.print("*"+" ");
	}
	System.out.println();
}
   for(int i = linenum-1; i>=1; i--) {
	for(int j=1; j<i;j++)
	{
		System.out.print(" ");
	}
	for(int j =i; j<=linenum; j++) {
		System.out.print("*"+" ");
	}
	System.out.println();
}

	}
}
	

