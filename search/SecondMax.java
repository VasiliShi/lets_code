package lets.code.every.search;
/**
 * 数组中第二大的数，
 * @author swx
 *
 */
public class SecondMax {

	static int max = -32767;
	public static int secondMax(int a[])
	{
		int maxnumber = a[0];
		int secmax = max;
		for(int i = 1; i < a.length; i++)
		{
			if(a[i] > maxnumber) // 两个变量用来存储 最大  和 第二大
			{
				secmax = maxnumber;
				maxnumber = a[i];
			}// 如果a[i]没有max大，也要和secmax比较一下
			else if (a[i] > secmax) {
				secmax = a[i];
			}
		}
		return secmax;
	}
	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6,88,6,7,8};
		int second = secondMax(a);
		System.out.println("second max number is: "+second);
	}

}
