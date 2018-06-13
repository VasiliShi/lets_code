package lets.code.every.sort;

import java.util.Scanner;

public class HeapSort {

    // This class should not be instantiated.
    private HeapSort() { }
    public static void exch(int a[],int i,int j)
    {
    	int temp = a[i];
    	a[i] = a[j];
    	a[j] = temp;
    }
    //建堆得过程，大根堆
    public static void sink(int a[],int k,int N)
    {
    	while(2*k <= N)
    	{
    		int j = 2*k;
    		if(j < N && a[j] < a[j + 1]) j++;
    		if(a[k] > a[j]) break;
    		exch(a,j,k);
    		k = j;
    	}
    }
    public static void sort(int a[])
    {
    	int N = a.length -1 ;
    	for(int k = N/2; k >= 1; k--)
    		sink(a,k,N);
    	while(N > 1)
    	{
    		exch(a,1,N--);
    		//N--;
    		sink(a,1,N);
    	}
    }
    public static void show(int a[])
    {
    	for(int b = 1; b < a.length; b++)
    		System.out.print(a[b]+" ");
    }
    
    public static void main(String[] args) {
    	//int a [] = {5,5,1,3,8,2};
        //HeapSort.sort(a);
        //show(a);
    	Scanner sc = new Scanner(System.in);
    	System.out.print("请输入数组a[]的元素个数:");
    	try{
    		int n = sc.nextInt();
    		int b[] = new int[n];
    		for(int i=0;i<n;i++)
    		{
    			System.out.print("请输入数组b["+i+"]:");
    			b[i]=sc.nextInt();
    		}
    		sc.close();
    		HeapSort.sort(b);
    	    show(b);
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
       
    }
}

