package controlsttm;

import java.util.Scanner;

public class newclasspattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter the number of line you want to print");
		int linenum = myobj.nextInt();
		for(int i =1 ; i<=linenum; i++) {
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=linenum; j++) {
				if(j==i || j==linenum) {
					System.out.print("*");
					
				}else {	
				System.out.print(" ");
			}
			//System.out.println();
		}
			System.out.println();
	}
	}
}
