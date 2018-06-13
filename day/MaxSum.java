package lets.code.every.day;

public class MaxSum {

	public static int sum(int a[])
	{
		int maxsum = 0;
		int sum = 0;
		for(int i = 0; i < a.length; i++)
		{
			sum += a[i];
			if(maxsum < sum)
				maxsum = sum;
			else if(sum < 0)
				sum = 0;
			
		}
		return maxsum;
	}	


	public static void main(String[] args) {

		//int a[] ={-2,5,3,-6,4,8,6};
		int a[] = {1,-2,3,10,-4,7,2,-5};
		System.out.println("maxsum = "+sum(a));
	}

}
