package Task11;
import java.util.Scanner;

public class loginpagecls{
	static String user = "RajuSharma";
	static String pwa = "ILoveMyIndia@24";
	public static void checkCredentials(){
		Scanner logscr = new Scanner(System.in);
		System.out.println("Enter your User Name");
		String username = logscr.next();
		System.out.println("Enter your Password");
		String userpwa = logscr.next();
			if((user == username)&&(pwa == userpwa)) {
				System.out.println("Login Successfully");
			}else {
				//System.out.println("User name and password is not same ");
				throw new RuntimeException("User name and password is not same ");
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  loginpagecls obj = new loginpagecls();
		obj.checkCredentials();
	}
}
