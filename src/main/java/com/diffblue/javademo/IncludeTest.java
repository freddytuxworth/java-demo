package com.diffblue.javademo;

public class IncludeTest {

	public boolean needsFoo(String input){
		if(input == "foo"){
			return true;
		} else {
			return false;
		}
	}

	public boolean needsBar(String input){
		if(input == "bar"){
			return true;
		} else {
			return false;
		}
	}

}
