package local;

import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("«Î ‰»Î” œ‰µÿ÷∑£∫");
		String email = sc.nextLine();
		String regex = "\\w+@\\w{2,7}(\\.\\w{2,3})+";
		boolean flag = email.matches(regex);
		System.out.println(flag);
	}
}
