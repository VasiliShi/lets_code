package lets.code.every.sort;

public class MergeSort {

	static int aux[];
	public static void sort(int a[])
	{
		aux = new int[a.length];
		sort(a,0,a.length - 1);
	}
	public static void sort(int a[],int low,int high)
	{
		if(high <= low)
			return;
		int mid = (high + low) / 2;
		sort(a,low,mid); // 将左半边排序
		sort(a,mid + 1,high);  //将右半边排序
		merge(a, low, mid, high);
	}
	public static void merge(int a[],int low, int mid,int high)
	{
		int i = low;//指向左半段  开始
		int j = mid + 1;//指向右半段  开始
		for(int k = low; k <= high; k++) //辅助设备
			aux[k] = a[k];
		int k = low;//这一点很重要
		while(i <=mid && j <= high)
		{
			if(a[i] > a[j])
				a[k++] = aux[j++];
			else
				a[k++] = aux[i++];
		}
		//下面的两个while循环只有一个会执行
		while(i <= mid) 
			a[k++] = aux[i++];
		while(j <= high)
			a[k++] = aux[j++];
	}
	
	public static void print(int a[])
	{
		for(int i:a)
			System.out.print(i + " ");
	}
	public static void main(String[] args) {
		int a[] = {-4,3,4,-3,5,9,2,6};
		sort(a);
		print(a);
	}

}
