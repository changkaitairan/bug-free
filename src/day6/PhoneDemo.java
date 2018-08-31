package day6;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone p = new Phone("XiaoMi","red",1999);
		p.call("Tom");
		p.sendMessage();
		p.playGame();
		System.out.println(p.getName());
		p.setName("Huawei");
		System.out.println(p.getName());
	}
}

class Phone {
	private String name;
	private String color;
	private int price;

	public Phone(String name, String color, int price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}

	// ��绰�ķ���
	public void call(String name) {
		System.out.println("��" + name + "��绰");
	}

	// �����ŵķ���
	public void sendMessage() {
		System.out.println("Ⱥ������");
	}

	// ����Ϸ�ķ���
	public void playGame() {
		System.out.println("����Ϸ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
