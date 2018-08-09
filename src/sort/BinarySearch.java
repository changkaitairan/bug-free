package sort;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一串数字，用空格间隔开");
		String arr = sc.nextLine();
		System.out.println("请输入要找的数字：");
		int x = sc.nextInt();
		sc.close();
		String[] arr2 = arr.split(" ");
		int[] arr3 = new int[arr2.length];
		for (int i = 0; i < arr2.length; i++) {
			arr3[i] = Integer.parseInt(arr2[i]);
		}
		Arrays.sort(arr3);
		System.out.println("排序后的数组：");
		System.out.println(Arrays.toString(arr3));
		int index = binarySearch(arr3, x);
		System.out.println(index);
	}

	public static int binarySearch(int[] a, int x) {
		int index = -1;
		int min = 0;
		int max = a.length;
		while (min < max) {
			int middle = (min + max) / 2;
			if (a[middle] == x) {
				index = 1;
				break;
			} else if (a[middle] < x) {
				min = middle + 1;
			} else {
				max = middle - 1;
			}
		}
		return index;
	}
}
