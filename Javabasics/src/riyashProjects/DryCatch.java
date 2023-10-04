package riyashProjects;

public class DryCatch {
	public static void main (String[]args) {
		try{
		System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("should not divide by zero");
		}
	}

}
