package org.list;
import java.util.ArrayList;
import java.util.List;
public class arraylistforloop {
public static void main(String[] args) {
	List<Integer> ex1 = new ArrayList<Integer>();
	ex1.add(10);
	ex1.add(20);
	ex1.add(30);
	ex1.add(40);
	ex1.add(40);
System.out.println(ex1);
//for loop
for(int i=0;i<ex1.size();i++){ 
	System.out.println(ex1.get(i));
//for each loop
}for(Integer k:ex1){
	System.out.println(k);
}}}
