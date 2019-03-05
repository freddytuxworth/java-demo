package com.diffblue.javademo;

public class ClassB {
	public int getAB(){
		ClassA cA = new ClassA();
		cA.setA(2);
		return cA.getA();
	}
}
