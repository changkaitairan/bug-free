package day5;

import java.util.Scanner;

//��������Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
public class ArrayTest5 {
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10,12,14,16,18,20,12,8,2};
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int index = getIndex(arr,x);
		System.out.println(x+"��һ�γ��ֵ������ǣ�"+index);
	}

	public static int getIndex(int[] a,int x) {
		int index = -1;
		for(int i =0;i<a.length;i++) {
			if(x==a[i]) {
				index = i;
				break;
			}
		}
		return index;
	}
}
