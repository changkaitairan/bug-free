package day5;

import java.util.Scanner;

//����¼�������������������Ӧ������
public class FunctionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������");
		int row = sc.nextInt();
		System.out.println("������������");
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
