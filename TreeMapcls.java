package task12;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> tmap = new TreeMap<String,Integer>();
		tmap.put("Prerna", 100);
		tmap.put("Amit", 103);
		tmap.put("Sid", 102);
		tmap.put("Mahesh", 101);
		tmap.put("Ram", 105);
		tmap.put("Xoxo", 104);
		for (Map.Entry<String,Integer> e:tmap.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
