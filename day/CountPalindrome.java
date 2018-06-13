package lets.code.every.day;

import java.util.Scanner;
/**
 * 统计回文
 * 网易内推笔试题目，
 * @author swx
 *
 */
public class CountPalindrome {

	public static boolean isPalindrome(String str)
	{
		int N = str.length();
		int end = N - 1;
		for(int i = 0; i < N /2;i++ )
			if(!(str.charAt(i) == str.charAt(end--)))
				return false;
		return true;
	}
	//
	public static int insert(String a,String b)
	{
		String newstr = "";
		int count = 0;
		int N = a.length();
		for(int i = 0;i <= N;i++)
		{
			newstr = a.substring(0, i) + b + a.substring(i);
			if(isPalindrome(newstr))
				count ++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String a = sc.next();
			String b = sc.next();
			System.out.println(insert(a,b));
		}
	}

}
