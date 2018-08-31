package day4;

//所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
//举例：153就是一个水仙花数。
//153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
public class ForDemo6 {
	public static void main(String[] args) {
		for(int x = 100; x<1000; x++) {
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai)==x) {
				System.out.println(x);
			}
		}
	}
}
