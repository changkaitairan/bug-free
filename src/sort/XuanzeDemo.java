package sort;

import java.util.Scanner;

public class XuanzeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����֣��ÿո����");
		String input = sc.nextLine();
		String[] arr = input.split(" ");
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		System.out.println("����������ϣ�������...");
		xuanze(arr2);
		printArr(arr2);
		sc.close();
	}

	public static void xuanze(int[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = i+1; j < input.length; j++) {
				if (input[i] > input[j]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
	}

	public static void printArr(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.print("]");
	}
}
