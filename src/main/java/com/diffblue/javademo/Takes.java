package com.diffblue.javademo;

import java.util.ArrayList;

public class Takes {
	public static boolean aDouble(double a){
		if(a > 10){
			return true;
		}
		return false;
	}

	public static boolean aFloat(float a){
		if(a > 10 && a < 20){
			return true;
		}
		return false;
	}

	public boolean nsaFloat(float a){
		if(a > 10 && a < 20){
			return true;
		}
		return false;
	}

	public static boolean ffis(float a, float b, int c, String d){
		if(a == 10 && b == 4 && c == 2 && d.equals("test")){
			return true;
		}
		return false;
	}

	public boolean aFloatR(float a){
		if(a > 10 && a < 20){
			return true;
		}
		return false;
	}

	public static boolean aChar(char a){
		if(a == 'q'){
			return true;
		}
		return false;
	}

	public static boolean aBoolean(boolean a){
		if(a == false){
			return true;
		}
		return false;
	}

	public static boolean anInt(int a){
		if(a == 3){
			return true;
		}
		return false;
	}

	public static boolean aNull(String a){
		if(a == null){
			return true;
		}
		return false;
	}

	public static boolean anArrayList(ArrayList a){
		if(a.size() > 1){
			return true;
		}
		return false;
	}
}
