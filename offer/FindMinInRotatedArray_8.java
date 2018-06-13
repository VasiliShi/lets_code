package lets.code.every.offer;
/**
 * 剑指offer 面试题8
 * find mix from rotated array 
 * [3,4,5,1,2] ---->min is 1
 * @author swx
 *
 */
public class FindMinInRotatedArray_8 {

	public static int min(int a[])
	{
		
		if(a == null || a.length <= 0)
		{
			System.err.println("Invalid parameters...");
			return 0;
		}
		int N = a.length;
		int low = 0;
		int hi = N - 1;
		int mid = low; //若数组有序【1,2,3】，直接返回a[low]，故mid初始化low
		while(a[low] >= a[hi]) //while(low <= hi)
		{
			if(hi - low == 1)
			{
				mid = hi;
				break;
			}
			mid = (low + hi) / 2;
			//[1,0,1,1]这种情况，需要使用顺序查找
			if(a[low] == a[hi] && a[mid] == a[low])
				return minInOrder(a, low, hi);
			
			if(a[mid] >= a[low])
				low = mid;
			else if (a[mid] <= a[hi]) {
				hi = mid;
			}
		}
		return a[mid];
	}
	public static int minInOrder(int a[],int low,int hi)
	{
		int min = a[low];
		for(int i = low + 1; i <= hi; i++)
		{
			if(a[i] < min)
				min = a[i];
		}
		return min;
	}
	public static void main(String[] args) {

		int a[] = {4,5,1,2,3};
		System.out.println("case one: the mix value in rotated array is :"+min(a));
		int a1[] = null;
		System.out.println("case two: the mix value in rotated array is :"+min(a1));
		int a2[] = {1,0,1,1,1};
		System.out.println("case three: the mix value in rotated array is :"+min(a2));
		
	}

}
