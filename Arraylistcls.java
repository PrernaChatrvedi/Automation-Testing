package task12;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> strary = new ArrayList<String>();
strary.add("Ram");
strary.add("Shyam");
strary.add("Vinay");
strary.add("Kareena");
strary.add("krish");
strary.add("Ramesh");
strary.add("Prabha");
//System.out.println(strary);
//strary.clear();
//System.out.println(strary);
Iterator<String> itr = strary.iterator();
System.out.println("Arraylst using Iterators");
while (itr.hasNext()) {
	System.out.println(itr.next());
}


	}

}
