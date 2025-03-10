package com.real;

import java.util.*;

public class Signup {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		createprofile();

	}

	// ************************CREATE
	// PROFILE****************************************
	public static void createprofile() {

		String alt_mail_id = "";
		long u_alt_mob_no = 0;
		String opt = "no";
		System.out.println("Enter the Name : ");
		String uname = sc.next();
		System.out.println("Enter the AGE :");
		int uage = sc.nextInt();
		System.out.println("Enter the mobile_number : ");
		long umb_no = sc.nextLong();
		System.out.println("Do you want to enter Alternate mobile Number select \n yes or no");
		String ans = sc.next();
		if (ans.equalsIgnoreCase("yes")) {
			System.out.println("Enter the Alternate_Mobile_number : ");
			u_alt_mob_no = sc.nextLong();
		}
		System.out.println("Enter the Mail id : ");
		String umail_id = sc.next();
		System.out.println("Do you want to enter Alternate mail_id select \n yes or no");
		String ans1 = sc.next();
		if (ans1.equalsIgnoreCase("yes")) {
			System.out.println("Enter the alternate mail id : ");
			alt_mail_id = sc.next();
		}
		System.out.println("Enter the Password :");
		String upwd = sc.next();

		User u1 = new User(uname, uage, umb_no, u_alt_mob_no, umail_id, alt_mail_id, upwd);

		System.out.println("*******************Sign_in Sucessfull******************");

		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("------------------------------Login_page----------------------------");
		String option = "No";
		do {
			System.out.println("Enter the Mobile No :");
			long mbNo = sc.nextLong();
			System.out.println("Enter the Pwd");
			String u_pwd = sc.next();
			if ((mbNo == u1.getMb_no()) && (u_pwd.equals(u1.getPwd()))) {
				System.out.println("Login Sucessfully");
				profile(u1);

				break;
			} else {
				System.out.println("Login unsucessful");
				System.out.println("Incorrect Mobile_no or Password");
				System.out.println("TO reenter type yes or to exit No");
				option = sc.next();
			}
		} while (option.equalsIgnoreCase("yes"));

		// -------------------------------------------------Editing
		// profile-----------------------------------------------
		System.out.println("Do you want to edit your profile");
		System.out.println("Enter yes / no");
		String select = sc.next();

		if (select.equalsIgnoreCase("yes")) {

			do {
				editprofile(u1);
				System.out.println("Do you want to change other details also");
				System.out.println("Enter yes/no");
				opt = sc.next();
			} while (opt.equalsIgnoreCase("yes"));
		}

	}

	//// ------------------------edit
	//// profile----------------------------------------------------------------------------------
	public static void editprofile(User u1) {
		System.out.println("1.to edit Name");
		System.out.println("2. to edit mobile Number");
		System.out.println("3. to edit alternate mobile Number");
		System.out.println("4. to edit mail id");
		System.out.println("5. to edit alternate mail id");
		System.out.println("6.to edit password ");
		System.out.println("7. to edit age");
		System.out.println("select the above options");
		int option1 = sc.nextInt();
		switch (option1) {
		case 1: {
			System.out.println("Enter the New Name : ");
			String newName = sc.next();
			u1.setName(newName);
		}
			break;
		case 2: {
			System.out.println("Enter to new the mobile Number :");
			long newmb = sc.nextLong();
			u1.setMb_no(newmb);
		}
			break;
		case 3: {
			System.out.println("Enter to change the alternate mobile Number :");
			long newaltmb = sc.nextLong();
			u1.setAlt_mb_no(newaltmb);
		}
			break;
		case 4: {
			System.out.println("Enter the new mail id : ");
			String newMailid = sc.next();
			u1.setMail_id(newMailid);
		}
			break;
		case 5: {
			System.out.println("Enter the new alternate mail id : ");
			String newaltMailid = sc.next();
			u1.setAlt_mail_id(newaltMailid);
		}
			break;
		case 6: {
			System.out.println("To change the PASSWORD enter the OLD password");
			String check_pwd = sc.next();
			if (check_pwd.equals(u1.getPwd())) {
				System.out.println("Enter the New Password : ");
				String newpwd = sc.next();
				u1.setPwd(newpwd);
			} else {
				System.out.println("Password is incorrect");
			}
		}
			break;
		case 7: {
			System.out.println("Enter the Updated age");
			int newage = sc.nextInt();
			u1.setAge(newage);
		}
			break;
		default: {
			System.out.println("invalid input :");
		}

		}
		System.out.println("**Profile is updated Sucessfully**");
		System.out.println("The Updated profile is");
		profile(u1);
	}

	// -----------------------------------------------------------------------------------------------
	// ------------------------------show
	// profile--------------------------------------------
	public static void profile(User u1) {

		System.out.println("User details are :");
		System.out.println("User name : " + u1.getName());
		System.out.println("User age :" + u1.getAge());
		System.out.println("Mobile Number :" + u1.getMb_no());
		System.out.println("Alternate Mobile Number : " + u1.getAlt_mb_no());
		System.out.println("mail id : " + u1.getMail_id());
		System.out.println("Alternate mail id : " + u1.getAlt_mail_id());
	}

}
