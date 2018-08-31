package day9;

public class InterfaceTest {
	public static void main(String[] args) {
		JumpCat jc = new JumpCat();
		jc.setName("black cat");
		jc.setAge(3);
		System.out.println(jc.getName()+" "+jc.getAge());
		jc.eat();
		jc.sleep();
		jc.jump();
	}
}

interface Jumping {
	public abstract void jump();
}

abstract class Animal1 {
	private String name;
	private int age;

	public Animal1() {
		super();
	}

	public Animal1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public abstract void eat();

	public void sleep() {
		System.out.println("sleeping");
	}
}

class Cat1 extends Animal1 {
	public Cat1() {

	}

	public Cat1(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat eat fish.");
	}
}

class Dog1 extends Animal1 {

	public Dog1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog1(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog eat meat.");
	}
}

class JumpCat extends Cat1 implements Jumping {

	public JumpCat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JumpCat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Jumping Cat");
	}
}

class JumpDog extends Dog1 implements Jumping {

	public JumpDog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JumpDog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Jumping Dog");
	}
}