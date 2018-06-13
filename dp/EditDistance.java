package lets.code.every.dp;

public class EditDistance {

	public static int edit(String wrong,String right)
	{
		int m = wrong.length();
		int n = right.length();
		int d[][] = new int[m+1][n+1];
		for(int i = 0; i <= m; i++) //���λ���ر�����Ū��  �м�
			d[i][0] = i;//��ʼ����һ��
		for(int j = 0; j <= n; j++)
			d[0][j] = j ;//��ʼ����һ��
		for(int i = 1; i <= m; i++)
		{
			char ci = wrong.charAt(i - 1);
			for(int j = 1; j <= n; j++)
			{
				char cj = right.charAt(j - 1);
				if(ci == cj)
					d[i][j] = d[i - 1][j - 1] ;
				else
				{
					int temp = Math.min(d[i][j - 1] + 1, d[i - 1][j] + 1);
					d[i][j] = Math.min(temp, d[i - 1][j - 1] + 1);
					
				}
			}
		}
		for(int i = 0; i <= m; i++)
		{
			for(int j =0;j <= n; j ++)
				System.out.print(d[i][j]+" ");
			System.out.println();
		}
		return d[m][n];
	}
	public static void main(String[] args) {

		int a = edit("sailn","failing");
		System.out.println("�༭����Ϊ�� "+a);
	}

}
