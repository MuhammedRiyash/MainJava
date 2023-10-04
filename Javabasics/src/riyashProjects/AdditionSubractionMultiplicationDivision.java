package riyashProjects;
  
import java.util.Scanner;

public class AdditionSubractionMultiplicationDivision {
		public static void main(String[]args) {
			Scanner ASMDM = new Scanner(System.in);
			System.out.println("Write a number to show the value of Addition,Subraction,Multiplication,Division and Modules ");
			
			System.out.println("Enter tht First number");
			int num1 = ASMDM.nextInt();
			
			System.out.println("Enter tht Second number");
			int num2 = ASMDM.nextInt();
			
			System.out.println(num1+num2);
			System.out.println(num1-num2);
			System.out.println(num1*num2);
			System.out.println(num1/num2);
			System.out.println(num1%num2);
		}
}
