package riyashProjects;

import java.util.Scanner;

public class UserInput {
	public static void main (String[]args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("pera solra gopal");
		
		String name =obj.nextLine();
		System.out.println("name entered : "+name);
		
		String comment =obj.nextLine();
		System.out.println("comment throwed : " + comment);
		
		int age=obj.nextInt();
		System.out.println("age entered : "+age);
		

	}

}
