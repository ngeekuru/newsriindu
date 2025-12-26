package com.tnsif.java.inheritance;

public class multi {
	public void show1()
	{
		System.out.println("this is A class");
	}
}
class B extends multi{
	public void show2()
	{
		System.out.println("this is B class");
	}
}
class C extends B{
	public void show3()
	{
		System.out.println("this is C class");
	}
}
