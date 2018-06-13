package lets.code.every.offer;
/**
 * 奇数放在偶数的前面
 * @author Administrator
 *
 */
public class ReOrderArray_14 {

	public static void reOrderArray(int a[])
	{
		if(a == null)
			return;
		int begin = 0;
		int end = a.length - 1;
		while(begin < end)
		{
			while(begin < end && isOdd(a[begin]))
				begin ++;
			while(begin < end && !isOdd(a[end]))
				end -- ;
			if(begin < end) //交换位置
			{
				int tmp = a[begin];
				a[begin] = a[end];
				a[end] = tmp;
			}
		}
	}
	public static boolean isOdd(int n) // 
	{
		return (n&1) == 0;
	}
	public static void main(String[] args) {
		int a[] = {2,1,5,6,3,9,7,4};
		reOrderArray(a);
		for(int aa : a)
			System.out.print(aa);
	}

}
