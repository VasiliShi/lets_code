package lets.code.every.dp;
/**
 * 数组的和相差最小,这个和 0 1背包问题一样
 * eg {1，2，3，4}，{1，4}-{2，3} = 0
 * 使得subset 尽量靠近sum / 2
 * @author Administrator
 *
 */
public class MinArraySum {

	public static int sum(int a[])
	{
		int sum = 0;
		for(int elem:a)
			sum += elem;
		return sum;
	}
	public static int solution(int a[])
	{
		int half = sum(a) / 2;
		
		int N = a.length ;
		int f[][] = new int[N + 1][half + 1];
		
		for(int i = 1; i <= N; i++)
		{
			for(int j = 1; j <= half; j++) //使得subset 尽量靠近sum / 2
			{
				if(j < a[i - 1]) 
					f[i][j] = f[i - 1][j];
				else
					f[i][j] = Math.max(f[i - 1][j], f[i - 1][j - a[i-1]] +a[i-1]);
			}
		}
		return f[N][half];
	}
	public static int oneDimensionDP(int a[])
	{
		int dp[] = new int[sum(a)/2 + 1];
		for(int i = 0; i < a.length; i++)
		{
			for(int j = sum(a)/2; j >= a[i]; j--) 
				dp[j] = Math.max(dp[j], dp[j-a[i]]+a[i]);
		}
		return dp[sum(a)/2];
	}
	public static void main(String[] args) {
		
		int a[] = {0,2,3,4};
		//int diff = sum(a) - 2 * solution(a);
		int diff = sum(a) - 2 * oneDimensionDP(a);
		System.out.println("the minimum of the difference of subarray sum is: "+ diff);
	}

}
