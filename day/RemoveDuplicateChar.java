package lets.code.every.day;

import java.util.Scanner;

/**
 * È¥³ıÖØ¸´×Ö·û²¢ÅÅĞò
 * input : aabcdefff
 * output:abcdef
 * @author swx
 *
 */
public class RemoveDuplicateChar {

	public static String solution(String str)
	{
		int a[] = new int[26];
		String result = "";
		for(int i = 0; i < str.length(); i++)
		{
			if(a[str.charAt(i) - 'a'] == 0) //
			{
				a[str.charAt(i) - 'a'] = 1;
				result += str.charAt(i);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String str = sc.next();
			System.out.println(solution(str));
		}
		
	}

}
