package day9;

/*
���������ڿ���һ��ϵͳʱ��Ҫ��Ա���������ƣ�Ա������3�����ԣ������������Լ����ʡ�
����Ҳ��Ա�������˺���Ա���������⣬��Ϊ����һ���������ԡ�
��ʹ�ü̳е�˼����Ƴ�Ա����;����ࡣҪ�������ṩ��Ҫ�ķ����������Է��ʡ�

������
	��ͨԱ����
		��Ա�����������������Լ����ʡ�
		��Ա����������
	�����ࣺ
		��Ա�����������������Լ����ʣ���������
		��Ա����������
		
ʵ�֣�
	Ա���ࣺ
	��ͨԱ���ࣺ
	�����ࣺ
*/
public class AbstractTest4 {
	public static void main(String[] args) {
		// ������ͨԱ��
		Employee emp = new Programmer();
		emp.setName("����ϼ");
		emp.setNumber(1);
		emp.setSalary(18000);
		System.out.println(emp.getName() + "---" + emp.getNumber() + "---" + emp.getSalary());
		emp.work();
		System.out.println("-------------");
		emp = new Programmer("����ϼ", 1, 18000);
		System.out.println(emp.getName() + "---" + emp.getNumber() + "---" + emp.getSalary());
		emp.work();
		System.out.println("-------------");

		Manager m = new Manager();
		m.setName("����");
		m.setNumber(2);
		m.setSalary(8000);
		m.setAward(2000);
		System.out.println(m.getName() + "---" + m.getNumber() + "---" + m.getSalary() + "---" + m.getAward());
		m.work();
		System.out.println("-------------");

		// ͨ�����췽����ֵ
		m = new Manager("����", 2, 8000, 2000);
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
		System.out.println("����Ա���ô��롣");
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
		System.out.println("���Ǿ����ڹ�����");
	}

	public int getAward() {
		return award;
	}

	public void setAward(int award) {
		this.award = award;
	}
}
