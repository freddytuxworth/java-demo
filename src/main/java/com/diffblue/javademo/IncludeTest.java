package com.diffblue.javademo;

import com.diffblue.importme.ImportMe;

public class IncludeTest {

        public boolean hasGot(){
		return com.diffblue.importme.ImportMe.hasGot();
	}

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
