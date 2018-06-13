package lets.code.every.graph;

import java.util.ArrayList;

/**
 * 用10分，5分，2分，1分这4种硬币组成Target分钱，一共有几种方法？
 * @author swx
 *
 */
public class CoinsWays {

	//方法1，使用数组
	public static int countWays(int target)
	{
		int coins[] = {1,2,5,10};
		//dp[i][sum] 用前i种硬币构成sum 的所有组合数。
		int dp[]  = new int[20];
		dp[0] = 1;
		for(int i = 0; i < coins.length; i++)//硬币种类
			for(int j = coins[i]; j <= target; j++)
				dp[j]= dp[j] + dp[j - coins[i]];
		return dp[target];
	}
	//方法2 使用深度遍历
	static int count = 0;
	static int total = 0;
	/**
	 * 
	 * @param solution ArrayList 存储的是路径
	 * @param coin  存储的数 硬币的 种类面值
	 * @param target  目标金额
	 * @param index  从0开始
	 */
	public static void dfs(ArrayList<Integer> solution,int coin[], int target,int index)
	{
		if(total == target)
		{
			count ++;
			System.out.print(count + ":");
			for(int i = 0; i < solution.size(); i++) //输出的为路径
				System.out.print(solution.get(i) + " ");
			System.out.println();
			return;
		}
		if(total > target) return;
		for(int i = index; i < coin.length; i++)
		{
			total += coin[i];
			solution.add(coin[i]);
			dfs(solution, coin, target, i);
			solution.remove(solution.size() - 1);
			total -= coin[i];
		}
	}
	public static void main(String[] args) {

		{// method 1
			int count = countWays(5);
			System.out.println("method 1:the total way is :"+count);
		}

		int coin[] = {1,2,5,10};
		ArrayList<Integer> a = new ArrayList<Integer>();
		dfs(a, coin, 5, 0);
		
		
	}

}
