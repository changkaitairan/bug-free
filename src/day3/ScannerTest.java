package day3;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����֣�");
		int a = sc.nextInt();
		System.out.println("������ڶ������֣�");
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("�������ֵĺ��ǣ�"+ sum);
	}
}
