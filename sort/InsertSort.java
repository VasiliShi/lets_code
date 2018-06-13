package lets.code.every.sort;

public class InsertSort {

	public static void exch(int a[],int i ,int j)
	{
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	public static void sort(int a[])
	{
		for(int i = 1; i < a.length; i++)
		{
			for(int j = i; j > 0; j--)
				if(a[j] < a[j - 1])
					exch(a,j,j-1);		
		}
	}
	public static void main(String[] args) {
		int a[] = {3,1,5,6,3,9,0,4};
		sort(a);
		for(int aa:a)
			System.out.print(aa + " ");
	}

}
