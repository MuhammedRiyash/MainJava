package riyashProjects;
import java.util.LinkedList;
public class Linklistmethod {
	public static void main (String[]main) {
		LinkedList<String>fruits = new LinkedList<String>();
		fruits.add("apple");
		fruits.add("strawberry");
		fruits.add("plum");
		fruits.add("berry");
		fruits.add("banana");
		fruits.set(4,"Grapes");
		fruits.remove(4);
		fruits.removeFirst();
		fruits.removeLast();
		fruits.addFirst("fig");
		fruits.addLast("guva");
		System.out.println(fruits);
		System.out.println(fruits.get(2));
		
		
	}
}


