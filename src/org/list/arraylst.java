package org.list;

import java.util.ArrayList;
import java.util.List;

public class arraylst {
	public static void main(String[] args) {
		List ex = new ArrayList();
		ex.add(10);
		ex.add(10000000000000000l);
		ex.add(10.12f);
		ex.add("Hai");
		ex.add("A");
		ex.add(true);
		System.out.println(ex);
		
		List<Integer> ex1 = new ArrayList<Integer>();
		ex1.add(10);
		ex1.add(20);
		ex1.add(30);
		ex1.add(40);
		ex1.add(40);
System.out.println(ex1);
//size()
int i = ex.size();
int j = ex1.size();
System.out.println(i);
System.out.println(j);
// to get
int x = ex1.get(3);
System.out.println(x);


		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
