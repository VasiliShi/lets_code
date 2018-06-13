package lets.code.every.graph;

import java.util.ArrayList;

/**
 * ��10�֣�5�֣�2�֣�1����4��Ӳ�����Target��Ǯ��һ���м��ַ�����
 * @author swx
 *
 */
public class CoinsWays {

	//����1��ʹ������
	public static int countWays(int target)
	{
		int coins[] = {1,2,5,10};
		//dp[i][sum] ��ǰi��Ӳ�ҹ���sum �������������
		int dp[]  = new int[20];
		dp[0] = 1;
		for(int i = 0; i < coins.length; i++)//Ӳ������
			for(int j = coins[i]; j <= target; j++)
				dp[j]= dp[j] + dp[j - coins[i]];
		return dp[target];
	}
	//����2 ʹ����ȱ���
	static int count = 0;
	static int total = 0;
	/**
	 * 
	 * @param solution ArrayList �洢����·��
	 * @param coin  �洢���� Ӳ�ҵ� ������ֵ
	 * @param target  Ŀ����
	 * @param index  ��0��ʼ
	 */
	public static void dfs(ArrayList<Integer> solution,int coin[], int target,int index)
	{
		if(total == target)
		{
			count ++;
			System.out.print(count + ":");
			for(int i = 0; i < solution.size(); i++) //�����Ϊ·��
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
