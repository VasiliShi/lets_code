package lets.code.every.dp;

public class LCS {

	public static int lcs(int a[][],int b[][], String x, String y)
	{
		if(x.equals("")||y.equals(""))
			return 0;
		int m = x.length() ;
		int n = y.length() ;
		
		for(int i = 1; i < m; i++)
			a[i][0] = 0;
		for(int i = 1; i < n; i++)
			a[0][i] = 0;
		a[0][0] = 0;	
		for(int i = 1; i <= m; i++)
			for(int j = 1; j <= n; j++)
				if(x.charAt(i-1) == y.charAt(j-1)) ///减去1，字符串从0开始
				{
					a[i][j] = a[i - 1][j - 1] + 1;
					b[i][j] = 0;
				}
				else if(a[i - 1][j] > a[i][j - 1])
				{
					a[i][j] = a[i - 1][j] ;
					b[i][j] = 1;
				}
				else
				{
					a[i][j] = a[i][j - 1];
					b[i][j] = -1;
				}
		
		//这种方法是倒序输出 LCS的
		int i =m,j = n;
		String reverse= "";
		while(i > 0 && j > 0)
		{
			if(x.charAt(i - 1) == y.charAt(j - 1))
			{
				//System.out.print(x.charAt(i - 1)); //修改这个位置 可以变成正序
				reverse  = x.charAt(i - 1) + reverse;
				i --;
				j --;
			}
			else if(a[i - 1][j] >= a[i][j - 1])
				i --;
			else 
				j --;
		}
		System.out.println();
		System.out.println(reverse);
		return a[m][n];
	}
	
	//b用来存储路径，str看下面的具体实现
	public static void  displayLCS(int b[][], String str, int i, int j)
	{
		if(i == 0 || j == 0)
			return;
		if(b[i][j] == 0)
		{
			displayLCS(b,str,i - 1,j-1);
			System.out.print(str.charAt(i - 1)); //是i就是 str1，是j就是str2
		}
		else if(b[i][j] == 1)
		{
			displayLCS(b, str, i - 1, j);
		}
		else
		{
			displayLCS(b, str, i , j - 1);
		}
	}
	
	
	public static int lcs_recurison(int a[][],String x, String y, int i, int j)
	{
		if(i==0 || j==0)
			a[i][j] = 0;
		else if(x.charAt(i - 1) == y.charAt(j - 1))
			a[i][j] = lcs_recurison(a, x, y, i - 1, j - 1) + 1;
		else {
			a[i][j] = Math.max(lcs_recurison(a, x, y, i - 1, j), lcs_recurison(a, x, y, i, j-1));
		}
		return a[i][j];
	}
	
	
	
	public static void main(String[] args) {
		String x = "ABCBDAB";
		String y = "BDCABA";
		int a[][] = new int[x.length() + 1][y.length() + 1];
		int b[][] = new int[x.length() + 1][y.length() + 1];
		int count = lcs(a,b,x,y);
		displayLCS(b, x, x.length(), y.length());
		//int count = lcs_recurison(a, x, y, x.length(), y.length());
		//System.out.println(count);
		for(int bb[]:a)
		{
			for(int c:bb)
				System.out.print(c+" ");
			System.out.println();
		}
		

	}

}
