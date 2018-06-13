package lets.code.every.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {

	 public static boolean checkPerfectNumber(int num) {
	        if(num == 1) return false;
	        int sum = 0;
	        for(int i = 1; i < num; i++)
	            if(num % i == 0)
	                sum += i;
	        return sum == num;
	    }
	public static void main(String[] args) {
		System.out.println(checkPerfectNumber(33550336));
	}

}
