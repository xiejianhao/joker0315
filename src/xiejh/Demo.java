package xiejh;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		long year;
		
		year = scanner.nextLong();
		if(year % 4==0 && year%100!=0|| year %400==0){
			System.out.print(year + "是闰年！");
		}else{
			System.out.print(year + "不是闰年！");
		}
	}

}
