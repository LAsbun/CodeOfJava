package ch401;

public class Student {
	private 
		String name;
		int age;
	
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void show(){
		System.out.println("Name is "+ this.name);
		System.out.println("Age is "+ this.age);
	}
	
}
