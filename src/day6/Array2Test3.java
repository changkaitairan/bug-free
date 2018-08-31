package day6;

import java.util.Scanner;

//���󣺴�ӡ���������(�������Լ���¼��)
//
//1
//1 1	
//1 2 1
//1 3 3 1
//1 4 6 4 1 
//1 5 10 10 5 1
//����Ϊ�����������
public class Array2Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ��ӡ���������������");
		int row = sc.nextInt();
		printTriangle(row);
	}

	public static void printTriangle(int x) {
		int[][] data = new int[x][x];
		for (int i = 0; i < x; i++) {
			data[i][0] = 1;
			data[i][i] = 1;
		}

		for (int i = 0; i < x; i++) {
			for (int j = 1; j < i; j++) {
				data[i][j] = data[i - 1][j - 1] + data[i - 1][j];
			}
		}

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < (x - i); j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < i+1; k++) {
				System.out.print(data[i][k]+"   ");
			}
			System.out.println();
		}
	}
}
