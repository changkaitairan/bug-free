package day4;

//��ν��ˮ�ɻ�����ָһ����λ�������λ���ֵ������͵��ڸ�������
//������153����һ��ˮ�ɻ�����
//153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
public class ForDemo6 {
	public static void main(String[] args) {
		for(int x = 100; x<1000; x++) {
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai)==x) {
				System.out.println(x);
			}
		}
	}
}
