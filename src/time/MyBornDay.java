package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyBornDay {
	public static void main(String[] args) throws ParseException {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("请输入你的出生年月日");
		 String s = sc.nextLine();
		 sc.close();
		 //先把字符串转换成出生日期
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 Date bornDay = sdf.parse(s);
		 //通过出生日期得到出生时的毫秒值
		 long bornTime = bornDay.getTime();
		 //获取当前日期的毫秒值
		 long nowTime = System.currentTimeMillis();
		 //在世毫秒值
		 long liveTime = nowTime-bornTime;
		 //转成天数
		 long liveDay = liveTime/1000/60/60/24;
		 System.out.println("你已经在这个世上活了"+liveDay+"天");
	}
}
