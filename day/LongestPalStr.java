package lets.code.every.day;

/**
 * 最长回文串
 * @author swx
 *
 */
public class LongestPalStr {

	public static String longestPalindromeDP(String s)
	{
		int n = s.length();
		int longestBegin = 0;
		int maxLen = 1;
		boolean table[][] = new boolean[50][50];
		for(int i =0; i < n; i++)
		{
			table[i][i] = true;
		}
		for(int i =0; i < n-1; i++) //这个是判断  “aa” 这种类型的
		{
			if(s.charAt(i) == s.charAt(i+1))
			{
				table[i][i+1] = true;
				longestBegin = i;
				maxLen = 2;
			}
		}
		for(int len =3; len <= n ;len++)  // 这个是判断  “aba”类型
		{
			for(int i = 0; i < n - len + 1; i++)
			{
				
				int j = i + len - 1;  //
				if(s.charAt(i) == s.charAt(j) && table[i + 1][j - 1])
				{
					table[i][j] = true;
					longestBegin = i;
					maxLen = len;
				}
			}
		}
		//return longestBegin +" :"+maxLen;
		return s.substring(longestBegin, longestBegin+maxLen);
	}
	
	public static String solution(String s)
	{
		if(s.length() <= 1)
			return s;
		int max = 0;
		int temp = 0;
		int start = 0,end = 0;
		for(int index = 0; index < s.length(); index++)
		{
			int aba = 0,abba = 0;
			for(int i =1; index - i >= 0 && index + i < s.length(); i++)
			{
				if(s.charAt(index - i) == s.charAt(index + i))
					aba ++;
				else 
					break;
			}
			for(int i = 1; index - i + 1 >= 0 && index +  i  < s.length(); i ++)
			{
				if(s.charAt(index - i + 1) == s.charAt(index + i))
					abba ++;
				else 
					break;
			}
			temp = Math.max(aba*2 + 1, abba*2);
			if(temp > end - start)
			{
				start = index - (temp - 1) / 2;
				end = index + temp / 2;
			}
//			max = Math.max(temp, max);
			
		}
		return s.substring(start, end+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "baabba";


		String len = solution(str);
		System.out.println(len);


	}

}
