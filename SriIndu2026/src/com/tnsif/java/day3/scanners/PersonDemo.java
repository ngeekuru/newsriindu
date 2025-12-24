package com.tnsif.java.day3.scanners;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		Person p = new Person();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter your name");
		String pname = sc.next();
		System.out.println("enter your salary");
		int psal = sc.nextInt();
		System.out.println("enter your city");
		
		String pcity = sc1.nextLine();		
		

	}

}
