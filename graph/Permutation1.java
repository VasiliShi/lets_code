package lets.code.every.graph;

public class Permutation1 {

	public static void dfs(int a[],int book[],int step,int n)
	{
		if(step == n + 1)
		{
			for(int i = 0; i <= n; i++ )
				System.out.print(a[i] + " ");
			System.out.println();
			return;  //ÐèÒªÐ´return£¬
		}
		for(int i = 0; i <= n;i ++)
		{
			if(book[i] == 0)
			{
				a[step] = i+1;
				book[i] = 1;
				dfs(a, book, step + 1, n);
				book[i] = 0;
				System.err.println(i);
			}
		}
		//return;
	}
	public static void main(String[] args) {

		int a[] = {1,2,3};
		int book[] = new int[4];
		dfs(a, book, 0, 2);
	}

}
