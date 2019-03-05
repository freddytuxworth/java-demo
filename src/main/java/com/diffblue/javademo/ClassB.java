package com.diffblue.javademo;

import com.diffblue.otherclass.ClassA;

public class ClassB {
	public int getAB(){
		ClassA cA = new ClassA();
		cA.setA(2);
		return cA.getA();
	}
}
