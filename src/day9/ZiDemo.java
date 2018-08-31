package day9;

public class ZiDemo {

	public static void main(String[] args) {
		Fu f = new Fu();
		f.show();
		Zi z = new Zi();
		z.show();
		z.show1();
	}
}

class Fu {
	public final void show() {
		System.out.println("父类不可修改的方法。");
	}
}

class Zi extends Fu {
	public void show1() {
		System.out.println("子类尝试重写父类的方法。看来没有成功");
	}
}