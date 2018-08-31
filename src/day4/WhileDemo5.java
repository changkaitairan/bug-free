package day4;

//我国最高山峰是珠穆朗玛峰：8848m，我现在有一张足够大的纸张，厚度为：0.01m
//请问，我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?
public class WhileDemo5 {
	public static void main(String[] args) {
		double x = 0.01;
		int count = 0;
		while (x < 8848) {
			x = x * 2;
			count++;
		}
		System.out.println("需要折叠"+count+"次,厚度是 "+x+"米。");
	}
}
