package riyashProjects;

public class Hdfc implements Bank{
	public void Salary() {
		System.out.println("salary acc");
	}
	public void Joint() {
		System.out.println("joint acc");
	}
	public void current() {
		System.out.println("current acc");
	}
	
public static void main(String[]args) {
	Hdfc obj = new Hdfc();
	obj.Salary();
	obj.current();
	
}
}
