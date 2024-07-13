package task12;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Convertcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<String>();
		list.add("Hello");
		list.add("Sumit");
		list.add("how");
		list.add("are");
		list.add("you?");
		System.out.println("Printing list elements:");
		for (String y :list)
			System.out.println(y);
		
		String [] arry = new String[list.size()]; //defining array 
		for(int i = 0; i< list.size(); i++) //
			arry[i] = list.get(i); // reading list elements
		System.out.println("Printing Array elements:");
		for (String x : arry)
			System.out.println(x);
	}

}
