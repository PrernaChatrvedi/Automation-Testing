package Task10;

public class Person {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person obj = new Person("Rahul",21);
System.out.println(obj.getName());
System.out.println(obj.getAge());
	}

}
