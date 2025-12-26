package com.tnsif.java.inheritance;

public class Aa {
	public void show1() {
		System.out.println("this is A class");
	}
}
class Bb extends Aa{   // show2 and show1 
	public void show2() {
		System.out.println("this is B class");
	}
} 
class Cc extends Aa{  //show3 and show1
	public void show3() {
		System.out.println("this is C class");
	}
}
class D extends Aa{   //show4 and show1
	public void show4() {
		System.out.println("this is D class");
	} 
}
