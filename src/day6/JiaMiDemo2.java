package day6;

import java.util.Scanner;

//���ܹ������£�
//���Ƚ����ݵ���Ȼ��ÿλ���ֶ�����5�����úͳ���10��������������֣�
//��󽫵�һλ�����һλ���ֽ����� ���������һ��С��8λ��������
//Ȼ�󣬰Ѽ��ܺ�Ľ���ڿ���̨��ӡ������ 
public class JiaMiDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��8λ��");
		int number = sc.nextInt();
		String code = jiaMi(number);
		System.out.println("���ܺ�������ǣ�" + code);
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
