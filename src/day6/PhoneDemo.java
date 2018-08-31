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

	// 打电话的方法
	public void call(String name) {
		System.out.println("给" + name + "打电话");
	}

	// 发短信的方法
	public void sendMessage() {
		System.out.println("群发短信");
	}

	// 玩游戏的方法
	public void playGame() {
		System.out.println("玩游戏");
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
