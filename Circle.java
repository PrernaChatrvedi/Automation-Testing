package Task10;

public class Circle {
 int r;
public Circle() {
	r=5;
	 System.out.println(r);
}
public Circle(int a, int b) {
	r=a+b;
	 System.out.println(r);
}
public void findcircumference() {
	double circumference = (2 * 3.141 *r);
	System.out.println("Value of circumference " +circumference);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle();
		Circle obj1 = new Circle(5,6);
		obj.findcircumference();
		obj1.findcircumference();
	}

}
