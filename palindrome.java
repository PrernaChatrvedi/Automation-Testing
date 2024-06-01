package controlsttm;
import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		String rev="";  char ch;
    Scanner myobj = new Scanner(System.in);
    System.out.println("Please enter the string");
    String str = myobj.nextLine();
    for(int i=0; i<str.length(); i++) {
    	ch = str.charAt(i);
         rev = ch+rev;
    }
    System.out.println(rev);
    if(str.equals(rev)) {
    	System.out.println("String is palindrom");
    }else {
    		System.out.println("String is not palindrom");
    	     }
    }
    
	}

