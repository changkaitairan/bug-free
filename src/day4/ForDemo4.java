package day4;

import java.util.Scanner;

public class ForDemo4 {
	public static void main(String[] args) {
		// ���ַ�ʽ�ֱ���1��x�������ͣ�ż����
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int jSum = jSumMethod(x);
		int oSum = oSumMethod(x);
		System.out.println("1��x֮����������ǣ�"+jSum);
		System.out.println("1��x֮���ż�����ǣ�"+oSum);
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
