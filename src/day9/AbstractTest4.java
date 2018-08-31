package day9;

/*
假如我们在开发一个系统时需要对员工类进行设计，员工包含3个属性：姓名、工号以及工资。
经理也是员工，除了含有员工的属性外，另为还有一个奖金属性。
请使用继承的思想设计出员工类和经理类。要求类中提供必要的方法进行属性访问。

分析：
	普通员工类
		成员变量：姓名、工号以及工资。
		成员方法：工作
	经理类：
		成员变量：姓名、工号以及工资，奖金属性
		成员方法：工作
		
实现：
	员工类：
	普通员工类：
	经理类：
*/
public class AbstractTest4 {
	public static void main(String[] args) {
		// 测试普通员工
		Employee emp = new Programmer();
		emp.setName("林青霞");
		emp.setNumber(1);
		emp.setSalary(18000);
		System.out.println(emp.getName() + "---" + emp.getNumber() + "---" + emp.getSalary());
		emp.work();
		System.out.println("-------------");
		emp = new Programmer("林青霞", 1, 18000);
		System.out.println(emp.getName() + "---" + emp.getNumber() + "---" + emp.getSalary());
		emp.work();
		System.out.println("-------------");

		Manager m = new Manager();
		m.setName("刘意");
		m.setNumber(2);
		m.setSalary(8000);
		m.setAward(2000);
		System.out.println(m.getName() + "---" + m.getNumber() + "---" + m.getSalary() + "---" + m.getAward());
		m.work();
		System.out.println("-------------");

		// 通过构造方法赋值
		m = new Manager("刘意", 2, 8000, 2000);
		System.out.println(m.getName() + "---" + m.getNumber() + "---" + m.getSalary() + "---" + m.getAward());
		m.work();
	}
}

abstract class Employee {
	private String name;
	private int number;
	private int salary;

	public Employee() {

	}

	public Employee(String name, int number, int salary) {
		this.name = name;
		this.number = number;
		this.salary = salary;
	}

	public abstract void work();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

class Programmer extends Employee {
	public Programmer() {

	}

	public Programmer(String name, int number, int salary) {
		super(name, number, salary);
	}

	public void work() {
		System.out.println("程序员在敲代码。");
	}
}

class Manager extends Employee {
	private int award;

	public Manager() {

	}

	public Manager(String name, int number, int salary, int award) {
		super(name, number, salary);
		this.award = award;
	}

	public void work() {
		System.out.println("这是经理在工作。");
	}

	public int getAward() {
		return award;
	}

	public void setAward(int award) {
		this.award = award;
	}
}
