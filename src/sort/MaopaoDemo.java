package sort;

import java.util.Scanner;

public class MaopaoDemo {
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
		maopao(arr2);
		printArr(arr2);
	}

	public static void maopao(int[] input) {
		for(int i = 0; i<input.length-1; i++) {
			for(int j = 0; j<input.length-1-i;j++) {
				if(input[j]>input[j+1]) {
					int temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
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
