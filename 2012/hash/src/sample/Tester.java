package sample;

import java.util.HashMap;

public class Tester {
	
	public static void main(String[] args)
	{
		HashMap hm = new HashMap();
		
		hm.put("john", 7);
		hm.put("kate", 8.0);
		hm.put("kate", 9);
		
		System.out.println(hm.get("kate"));
		System.out.println(10>9);
		
		
	}

}
