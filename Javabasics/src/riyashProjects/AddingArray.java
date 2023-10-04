package riyashProjects;

import java.util.ArrayList;

public class AddingArray {
	 
	public static void main (String[]main) {
		ArrayList<String>fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("strawberry");
		fruits.add("plum");
		fruits.add("berry");
		fruits.add("banana");
		fruits.set(3,"Grapes");
		fruits.remove(4);
		System.out.println(fruits);
		System.out.println(fruits.get(2));
		
		
	}
}
