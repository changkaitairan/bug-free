package day4;
//ͳ��1-1000֮��ͬʱ�������������������ж��ٸ���
//��3������2
//��5������3
//��7������2
public class ForDemo9 {
	public static void main(String[] args) {
		int count = 0;
		for(int x = 1; x<=1000; x++) {
			if(x%3==2 && x%5==3 && x%7==2) {
				count++;
				System.out.println("��"+count+"����������������"+x);
			}
		}	
		System.out.println("�ܹ���"+count+"������");
	}
}
