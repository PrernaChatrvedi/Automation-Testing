package controlsttm;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner myobj = new Scanner(System.in);
System.out.println("Please enter the string");
String name = myobj.nextLine();
String reversename =""; char ch;
for(int i=0; i<name.length(); i++)
{
	ch = name.charAt(i);
	reversename = ch+ reversename;

	}
System.out.println(reversename);
}

}
