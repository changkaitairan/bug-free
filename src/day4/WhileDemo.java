package day4;

//С��������ÿ�����2.5ԪǮ������������������ǣ�
//ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ��������Ứȥ6ԪǮ��
//���ʣ����������죬С���ſ��Դ浽100ԪǮ��
public class WhileDemo {
	public static void main(String[] args) {
		double total = 0;
		int day = 1;
		while(total<100) {
			total = total + 2.5;
			if(day%5 == 0) {
				total = total - 6;
			}
			day++;
		}
		System.out.println("�ȵ���"+(day-1)+"�죬С����"+total+"ԪǮ��");
	}
}
