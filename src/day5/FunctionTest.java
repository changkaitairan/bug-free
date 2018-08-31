package day5;

import java.util.Scanner;

//键盘录入行数和列数，输出对应的星形
public class FunctionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行数：");
		int row = sc.nextInt();
		System.out.println("请输入列数；");
		int column = sc.nextInt();
		printStars(row,column);
		sc.close();
	}
	
	static void printStars(int x,int y) {
		for(int i = 0;i<x;i++) {
			for(int j = 0;j<y;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
