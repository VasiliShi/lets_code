package lets.code.every.dp;

import java.util.Scanner;

/**
 * �����ַ���s��ɾ��һЩ�ַ���ʹ��ʣ�µ���һ�����Ĵ��������Ҫɾ�����ַ�����
 * @author Administrator
 *
 */
public class ConstructPlalindrome {
/**
 * ʹ��LCS��ԭ����str��ת����������ִ�
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
			System.out.println("��Ҫɾ����"+diff+"���ַ�,���ܹ��ɻ��Ĵ�");
		}
	}

}
