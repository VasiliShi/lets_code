package lets.code.every.dp;

import java.util.Scanner;

/**
 * 给定字符串s，删除一些字符，使得剩下的是一个回文串；输出需要删除的字符个数
 * @author Administrator
 *
 */
public class ConstructPlalindrome {
/**
 * 使用LCS的原理，将str逆转，求最长公共字串
 * @param a
 * @param b
 * @return
 */
	public static int method1(String a,String b)
	{
		int lenA = a.length();
		int lenB = b.length();
		int dp[][] = new int[lenA + 1][lenB + 1] ;
		for(int i = 1; i <= lenA; i++)
		{
			for(int j = 1; j <= lenB; j++)
			{
				if(a.charAt(i - 1) == b.charAt(j - 1))
				{
					dp[i][j] = dp[i - 1][j - 1] +1;
				}
				else
				{
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[lenA][lenB];
	}
	public static String reverse(String str)
	{
//		String result = "";
//		for(int i = 0 ; i < str.length(); i++)
//			result = str.charAt(i) + result;
//		return result;
		int N = str.length();
		if(N == 1) return str;
		String left = str.substring(0, N / 2);
		String right = str.substring(N / 2,N);
		return reverse(right) + reverse(left);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String strA = sc.nextLine();
			String strB = reverse(strA);
			int lcsLength = method1(strA,strB);
			int diff = strA.length() - lcsLength;
			System.out.println("需要删除："+diff+"个字符,就能构成回文串");
		}
	}

}
