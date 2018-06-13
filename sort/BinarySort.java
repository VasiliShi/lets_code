package lets.code.every.sort;
/**
 * 插入排序的升级版本；二分排序算法
 * @author Administrator
 *
 */
public class BinarySort {

	public static void sort(int a[])
	{
		int N = a.length;
		int tmp,low,mid,high;
		for(int i = 1; i < N; i++)
		{
			low = 0;
			tmp = a[i];
			high = i - 1;
			//前面的数组都是有序的，所以使用折半查找快速定位,找出前面比tmp小门后面比tmp大的分界点。
			while(low <= high)
			{
				mid = (low + high) / 2;
				if(a[mid] > tmp)
					high = mid - 1;
				else
					low = mid + 1;
			}
			System.out.println(low+""+high);
			for(int j = i - 1; j > high; j--)//最后返回的是high
			{
				a[j+1] = a[j];
			}
			a[high + 1] =tmp;
		}
	}
	public static void main(String[] args) {
		int a[] = {3,1,5,6,3,9,0,4};
		sort(a);
		for(int aa:a)
			System.out.print(aa + " ");
	}

}
