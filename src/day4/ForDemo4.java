package day4;

import java.util.Scanner;

public class ForDemo4 {
	public static void main(String[] args) {
		// 两种方式分别求1到x的奇数和，偶数和
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int jSum = jSumMethod(x);
		int oSum = oSumMethod(x);
		System.out.println("1到x之间的奇数和是："+jSum);
		System.out.println("1到x之间的偶数和是："+oSum);
	}
	
	static int jSumMethod(int x) {
		int sum = 0;
		for(int i = 1; i<=x; i=i+2) {
			sum += i;
		}
		return sum;		
	}
	static int oSumMethod(int x) {
		int sum = 0;
		for(int i = 2; i<=x; i=i+2)
			sum += i;
		return sum;
	}
}
