package day4;

//需求：请输出一个4行5列的星星(*)图案。
//结果：
//	*****
//	*****
//	*****
//	*****
public class ForForDemo {
	public static void main(String[] args) {
		for(int i = 0; i<4; i++) {
			for(int j =0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
