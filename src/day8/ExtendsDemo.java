package day8;

public class ExtendsDemo {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		Student s = new Student();
		t.eat();
		t.sleep();
		s.eat();
		s.sleep();
	}
}

class Person{
	public void eat(){
		System.out.println("eat");
	}
	
	public void sleep() {
		System.out.println("sleep");
	}
}

class Teacher extends Person{
	
}
class Student extends Person{
	
}