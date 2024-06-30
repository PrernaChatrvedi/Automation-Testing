package Task11;

public class Arrayoutofindex {
	
	public static void arrayoutofindex() {
		try {
			int ary[] = {1,5,7,9,0,4};
			System.out.println(ary[7]); // accessing element which is not available in array
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void stringoutofindex() {
try {
			String a = "ILOVEMYINDIA";
			System.out.println(a.charAt(0));
			System.out.println(a.charAt(20));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()); // accessing Character which is not available in string
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrayoutofindex obj  = new Arrayoutofindex();
		obj.arrayoutofindex();
		obj.stringoutofindex();
	}
}
