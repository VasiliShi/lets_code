package lets.code.every.graph;
/**
 * 全排列问题， B出现在A前面的 全排列情况
 * @author swx
 *
 */
public class Permutation2 {

	public static void permutation(int a[], int k, int m)
	{
		int flag = 0;
		if(k == m ) //直到第n个元素到第n个元素的全排列，递归出口
		{
			for(int i = 0; i <=m ;i++)  
				if(a[i] == 3)
					flag = 1;
				else if(a[i] == 4)
					flag = 2;
			if(flag == 1) //如果3先出现，flag = 2
			{
				for(int i = 0; i <= m; i++)
					System.out.print(a[i]);
				System.out.println();
			}
		}
		else
		{
			for(int j = k; j <= m; j++)
			{
				swap(a,j,k);
				permutation(a, k+1, m);//求第2个元素到第N个元素全排列
				swap(a,j,k); //将改变的数组恢复
			}
				
		}
			
	}
	private static void swap(int[] a, int j, int k) {
		int temp = 0;
		temp = a[j];
		a[j] = a[k];
		a[k] = temp;
	}
	public static void main(String[] args) {

		int a[] = {1,2,3,4};
		permutation(a, 0, 3);
	}

}
