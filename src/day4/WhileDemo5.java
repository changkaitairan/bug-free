package day4;

//�ҹ����ɽ������������壺8848m����������һ���㹻���ֽ�ţ����Ϊ��0.01m
//���ʣ����۵����ٴΣ��Ϳ��Ա�֤��Ȳ��������������ĸ߶�?
public class WhileDemo5 {
	public static void main(String[] args) {
		double x = 0.01;
		int count = 0;
		while (x < 8848) {
			x = x * 2;
			count++;
		}
		System.out.println("��Ҫ�۵�"+count+"��,����� "+x+"�ס�");
	}
}
