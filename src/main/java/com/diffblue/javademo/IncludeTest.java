package com.diffblue.javademo;

public class IncludeTest {

	public boolean needsFoo(String input){
		if(input.equals("youll_never_guess_me")){
			return true;
		}
		return false;
	}

	public boolean needsBar(String input){
		if(input.equals("youll_never_guess_me")){
			return true;
		} else {
			return false;
		}
	}

}
