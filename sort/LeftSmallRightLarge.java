package lets.code.every.sort;
/**
 * 一个int数组，求出所有这样的a【i】，其左边的都比它小，右边的都比它大
 * @author swx
 *
 */
public class LeftSmallRightLarge {

	public static void solution(int a[])
	{
		int N = a.length;
		int rightMin[] = new int[N]; //这是一个升序排列的数组
		rightMin[N - 1] = a[N - 1];
		for(int i = N - 2;i >= 0; i--)//从后向前
		{
			if(a[i] < rightMin[i + 1]) //如果a【i】比 rightMin中最小的还小，就添加到rightMin中
				rightMin[i] = a[i];
			else
				rightMin[i] = rightMin[i + 1];//否则就赋值i+1位的内容到第i为
		}
		//int 正数范围（0,0x7fffffff）
		//int 负数范围（0x80000000,0xfffffff）
		int leftMax = 0x80000000; //用一个最小的数表示最大
		for(int i = 0; i < N; i++)
		{
			if(a[i] >= leftMax) 
			{
				leftMax = a[i]; //用来找左边最大的，
				if(leftMax <= rightMin[i]) //左边最大的等于右边最小的
					System.out.print(leftMax+ " ");
			}
		}
	}

	public static void main(String[] args) {

		int array[] = {7,10,2,6,19,22,32};
		solution(array);
	}

}
