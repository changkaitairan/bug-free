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
		System.out.println("���಻���޸ĵķ�����");
	}
}

class Zi extends Fu {
	public void show1() {
		System.out.println("���ೢ����д����ķ���������û�гɹ�");
	}
}