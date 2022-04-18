package org.encapsulation;

import java.util.Scanner;

public class encap_demo {
	private String Student_name;
	private int Studentuser_id;
	private int password;

	public static String get_name() {
	return get_name();
	}
	public int get_stu_id() {
	return get_stu_id();
	}
	public int get_pass() {
	return get_pass();
	}
	public void set_name(String stu) {
	Student_name = stu;
	}
	public void set_stu_id(int stu) {
	Studentuser_id = stu;
	}
	public void set_pass(int stu) {
	password = stu;
	}
	public static void main(String args[], int s_id) {
	Scanner s = new Scanner(System.in);
	int op2;
	String stuname,stupass;
	int sub1,sub2,sub3,sub4,sub5;
	
	System.out.println("Enter your Name :");
	stuname = s.nextLine();
	System.out.println("Enter your User_ID :");
	stupass = s.nextLine();
	System.out.println("Enter your Password :");
	op2 = s.nextInt();

	System.out.println("Enter marks of 5 subjects :");
	System.out.println("Enter marks of sub1 :");
	sub1 = s.nextInt();
	System.out.println("Enter marks of sub2 :");
	sub2 = s.nextInt();
	System.out.println("Enter marks of sub3 :");
	sub3 = s.nextInt();
	System.out.println("Enter marks of sub4 :");
	sub4 = s.nextInt();
	System.out.println("Enter marks of sub5 :");
	sub5 = s.nextInt();
	
	int total = sub1+sub2+sub3+sub4+sub5;
	int percentage = (total/500) * 100;

	if (percentage>=35 && percentage<=45) {
	System.out.println("D Grade");
	}
	else if (percentage>=45 && percentage<55) {
	System.out.println("C Grade");
	}
	else if (percentage>=60 &&percentage <75) {
	System.out.println("B Grade");
	}
	else if (percentage>=75 && percentage<85) {
	System.out.println("A Grade");
	}
	else if (percentage>=85 && percentage<100) {
	System.out.println("O Grade");
	}
	else {
	System.out.println("Fail/Absent");
	}

	encap_demo j = new encap_demo();
	j.set_pass(op2);
	j.set_stu_id(s_id);

	System.out.println("Name :" + j.get_name());
	System.out.println("User_ID :" + j.get_stu_id());
	System.out.println("Password :" + j.get_pass());

	System.out.println("Total marks = " + total);
	System.out.println("Percentage = " + percentage);
	}
	}
