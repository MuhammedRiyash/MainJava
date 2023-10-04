package riyashProjects;

public class StringMethods {
	public static void main (String[]args) {
		System.out.println(Math.sqrt(20000));
		System.out.println(Math.abs(-20000));
		System.out.println(Math.round(2.53));
		System.out.println(Math.round(Math.random()*2000));
		System.out.println(Math.max(200,1000));
//		System.out.println(Math.celi(2.415));
		System.out.println(Math.min(200,1000));
		System.out.println(Math.log(3));
//		System.out.println(Math.log2(5000));
		
		String firstname ="muhammed ";
		String lastname ="Riyash ";
		
		System.out.println(firstname.length());
		System.out.println(lastname.toUpperCase());
		System.out.println(firstname.concat(lastname));
		System.out.println(firstname.contains("arron"));
		System.out.println(firstname.charAt(3));
		
		
	}

}
