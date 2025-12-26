package com.tnsif.java.constrct;

public class Student {
	int sid=101;
	String sname="John";
	
	//Default constructor -0
	Student()
	{
	System.out.println("the student name is:"+sname);
	}
	//parametrized constructor >1
	Student(int a)
	{
		System.out.println("the student id is:"+sid + "the value of a is"+a);
	}
	Student(int a,int b)
	{
		System.out.println("the a value is:" +a+" the b value is:"+b);
	}
}
