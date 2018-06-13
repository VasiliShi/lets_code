package lets.code.every.sort;

public class QuickSort {

	/**
	 * ²ð·Ö
	 * @param a
	 * @param low
	 * @param high
	 * @return
	 */
	public static int partation(int a[],int low,int high)
	{
		int v = a[low];
		while(low < high)
		{
			while(low < high && a[high] >= v)
				high --;
			a[low] = a[high];
			while(low < high && a[low] <= v)
				low ++;
			a[high] = a[low];
		}
		a[low] = v;
		return low;
	}
	/**
	 * ÅÅÐò£¬
	 * @param a
	 * @param lo
	 * @param hi
	 */
	public static void quick_sort(int a[],int lo,int hi)
	{
		if(hi <= lo)
			return;
		int p = partation(a, lo, hi);
		quick_sort(a, lo, p - 1);
		quick_sort(a, p + 1,hi);
	}
	public static void print(int a[])
	{
		for(int i:a)
			System.out.print(i + " ");
	}
	public static void main(String[] args) {
		int a[] = {3,2,1,5,6,7};
		quick_sort(a,0,5);
		print(a);
	}

}
