package com.diffblue.javademo;

public class IncludeTest {

	public boolean needsFoo(String input){
		if(input.equals("foo")){
			return true;
		} else {
			return false;
		}
	}

	public boolean needsBar(String input){
		if(input.equals("bar")){
			return true;
		} else {
			return false;
		}
	}

}
