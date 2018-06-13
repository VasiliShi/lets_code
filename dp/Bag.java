package lets.code.every.dp;
/**
 * 01背包问题
 * @author Administrator
 *
 */
public class Bag {

	/**
	 * 
	 * @param m 动态规划数组
	 * @param w 物品的重量
	 * @param v 物品的价值
	 * @param c 背包的容量
	 */
	public static int bag(int m[][],int w[],int v[],int c)
	{
		int N = w.length - 1;
		for(int i = 0; i <= c; i++)//初始化 第一行
			m[0][i] = 0;
		for(int i = 1; i <= N; i++)
		{
			m[i][0] = 0;//初始化第一列
			for(int j = 1; j <= c; j++)
				if(j < w[i])
					m[i][j] = m[i - 1][j];
				else
					m[i][j] = Math.max(m[i - 1][j], m[i - 1][j - w[i]] + v[i]);
		}
		return m[N][c ];
	}

	/**
	 * 第一行第一列全部初始化为0
	 * @param m
	 * @param w 物品的重量
	 * @param v 物品的价值
	 * @param c 背包的容量
	 * @return
	 */
	public static int test(int m[][],int w[],int v[],int c)
	{
		for(int i = 0; i <= c; i++) //row
			m[0][i] = 0;
		for(int i = 0; i <= w.length; i++)//column
			m[i][0] = 0;
		for(int i = 1;i <= w.length; i++)
		{
			for(int j = 1; j <= c; j++)
			{
				if(j < w[i-1]) // w[i-1]
					m[i][j] = m[i - 1][j];
				else                                  //拿出来前一个，再把第i - 1放进去比较哪个大
					m[i][j] = Math.max(m[i - 1][j], m[i - 1][j - w[i-1]] + v[i-1]);
			}
		}
		return m[w.length][c];
	}
	public static void main(String[] args) {

		int w[] = {3,6,5,4,6};
		int v[] = {2,2,6,5,4};
		int c = 10;
		int m[][] = new int[w.length + 1][c+1]; //c + 1 ;
//		System.out.println(bag(m,w,v,c));
		System.out.println(test(m,w,v,c));
		for(int i= 0 ;i <m.length;i++)
		{
			for(int j =0; j <m[i].length;j++)
				System.out.print(m[i][j]+" ");
			System.out.println();
		}

		
	}

}
