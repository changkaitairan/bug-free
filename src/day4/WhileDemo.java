package day4;

//小芳的妈妈每天给她2.5元钱，她都会存起来，但是，
//每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，
//请问，经过多少天，小芳才可以存到100元钱。
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
		System.out.println("等到第"+(day-1)+"天，小芳有"+total+"元钱。");
	}
}
