
package Task10;
import java.util.Scanner;

public class Teaclass {


	public void prepareTea() {
		System.out.println("Add hot water with tea leaves");
		
	}
    public void addMilk() {
    	System.out.println("Add milk to the basic tea");
	}
    public void addSugar() {
    	System.out.println("adds sugar to the basic tea");
}
	public static void main(String[] args) {
		Scanner myobj = new Scanner(System.in); //creating scanner object
		System.out.println("Which tea would you like to have press 1 for normal tea, press 2 for BlackTea, press 3 for GreenTea,press 4 for HerbalTea ");
		int teatype = myobj.nextInt();
		if(teatype == 1) {
			Teaclass obj = new Teaclass();
			obj.prepareTea();
			obj.addMilk();
			obj.addSugar();
		}else if(teatype == 2) {
			BlackTea obj1 = new BlackTea();
			obj1.prepareTea();
		}else if(teatype == 3) {
			GreenTea obj2 = new GreenTea();
			obj2.prepareTea();
		}else if(teatype == 4) {
			HerbalTea obj3 = new HerbalTea();
			obj3.prepareTea();
		}else {
			System.out.println("Invalid input try again");
		}
					
	}

}
