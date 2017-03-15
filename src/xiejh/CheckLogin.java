package xiejh;

import java.util.Scanner;

public class CheckLogin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入登录用户名：");
		String username = sc.nextLine();// 接收用户输入登录名
		System.out.println("请输入登录密码：");
		String password = sc.nextLine();// 接收用户输入登录密码
		
		if(!username.equals("xiejh")){
			System.out.println("用户名非法。");
		}else if(!password.equals("1234")){
			 System.out.println("登录密码错误。");
		}else{
			System.out.println("恭喜您，登录信息通过验证。");
		}
	}

}
