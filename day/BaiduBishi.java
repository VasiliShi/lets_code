package lets.code.every.day;

import java.util.Scanner;

public class BaiduBishi {

	public static void solution(long a[],long b[])
	{
		
		long result = 0;
		for(int i = 0;i < a.length; i++)
			result ^= a[i];
		for(int i = 0; i < b.length; i++)
			result ^= b[i];
		//return result;
		System.out.println(result);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext())
		{
			int zushu = sc.nextInt();
			for(int i = 0; i <zushu;i++)
			{
				long geshu = sc.nextLong();
				long a[] = new long[(int) geshu];
				for(long j = 0; j< geshu;j++)
				{
					a[(int) j] = sc.nextLong();
				}
				
				//b
				long b[] = new long[(int) (geshu- 1)];
				for(long j = 0; j< geshu - 1;j++)
				{
					b[(int) j] = sc.nextLong();
				}
				solution(a,b);
			}	
		}
		sc.close();
	}

}
