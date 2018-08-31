package day4;

//需求：在控制台输出九九乘法表。
//	1*1=1
//	1*2=2	2*2=4
//	1*3=3	2*3=6	3*3=9
//	1*4=4	2*4=8	3*4=12	4*4=16
//	...
//	1*9=9	2*9=18	3*9=27	...
public class ForForDemo3 {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}
