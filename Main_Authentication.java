package com.encapsulation;

import java.util.Scanner;

public class Main_Authentication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String uname = sc.next();
		System.out.println("Enter the Age");
		int uage = sc.nextInt();
		System.out.println("Enter the password");
		String upwd = sc.next();
		System.out.println("Enter the mobile no");
		long umobile = sc.nextLong();

		Singlesetter s = new Singlesetter();

		s.setDetails(uname, upwd, uage, umobile);

		System.out.println("Signin Successfully");

		String option = "no";

		do {

			System.out.println("Enter the Mobile No");
			long mbno = sc.nextLong();
			System.out.println("Enter the pwd");
			String pwd = sc.next();

			if (mbno == s.getmobileno() && pwd.equals(s.getpwd())) {

				System.out.println("login Sucessfully");
				System.out.println("User Details");
				System.out.println(s.getName());
				System.out.println(s.getage());
				System.out.println(s.getmobileno());

				break;

			} else {

				System.out.println("Login Unsuccess");
				System.out.println("Incorrect Mobile Number Or Password");

				System.out.println("To Re eneter Type Yes or To exit No");
				option = sc.next();
			}

		} while (option.equalsIgnoreCase("Yes"));

	}

}
