package day6;

import java.util.Scanner;

//加密规则如下：
//首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
//最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
//然后，把加密后的结果在控制台打印出来。 
public class JiaMiDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个8位数");
		int number = sc.nextInt();
		String code = jiaMi(number);
		System.out.println("加密后的文字是：" + code);
	}

	public static String jiaMi(int num) {
		String code = "";
		int[] arr = new int[8];
		int index = 0;
		while (num > 0) {
			arr[index] = num % 10;
			num = num / 10;
			index++;
		}
		for (int i = 0; i < index; i++) {
			arr[i] = (arr[i] + 5) % 10;
		}
		int temp = arr[index-1];
		arr[index-1] = arr[0];
		arr[0] = temp;
		for (int i = 0; i < index; i++) {
			code = code + arr[i];
		}
		return code;
	}
}
