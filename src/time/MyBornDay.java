package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyBornDay {
	public static void main(String[] args) throws ParseException {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("��������ĳ���������");
		 String s = sc.nextLine();
		 sc.close();
		 //�Ȱ��ַ���ת���ɳ�������
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 Date bornDay = sdf.parse(s);
		 //ͨ���������ڵõ�����ʱ�ĺ���ֵ
		 long bornTime = bornDay.getTime();
		 //��ȡ��ǰ���ڵĺ���ֵ
		 long nowTime = System.currentTimeMillis();
		 //��������ֵ
		 long liveTime = nowTime-bornTime;
		 //ת������
		 long liveDay = liveTime/1000/60/60/24;
		 System.out.println("���Ѿ���������ϻ���"+liveDay+"��");
	}
}
