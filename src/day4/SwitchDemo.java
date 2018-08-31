package day4;

import java.util.Scanner;

public class SwitchDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入1到7之间的数字：");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wedsday");
			break;

		case 4:
		case 5:
		case 6:
		case 7:
			System.out.println("not the first three days");
			break;
		default:
			System.out.println("wrong input.");
		}
	}
}
