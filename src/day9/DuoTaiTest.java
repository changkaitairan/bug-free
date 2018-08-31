package day9;

public class DuoTaiTest {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.eat();
		Dog d = (Dog)a;
		d.eat();
		d.lookDoor();
		a = new Cat();
		a.eat();
		Cat c = (Cat)a;
		c.eat();
		c.playGame();
	}
}

class Animal{
	public void eat() {
		System.out.println("eat");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("Dog eat.");
	}
	public void lookDoor() {
		System.out.println("Dog look door.");
	}
}
class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("Cat eat.");
	}
	
	public void playGame() {
		System.out.println("Cat hide.");
	}
}