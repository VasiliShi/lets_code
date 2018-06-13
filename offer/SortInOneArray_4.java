package lets.code.every.offer;
/**
 * 剑指offer 面试题4拓展：在一个数组中排序
 * @author swx
 * 有两个排序的数组A1和A2，A1末尾有足够的空间容纳A2，把A2所有数字插入A1中，要求A1有序
 */
public class SortInOneArray_4 {

	public static void sort(int a[],int b[])
	{
		int i = 0; //指向a
		for(int aa:a)
		{
			if(aa == 0)
				break;
			i++;
		}
		int p = i + b.length - 1;//指向a末尾
		int j = b.length - 1;//指向b末尾
		i -= 1;
		while(i >=0 && j >= 0)
		{
			if(a[i] > b[j])
				a[p--] = a[i--];
			else
				a[p--] = b[j--];
		}
		while(i != 0 && p != 0) a[p--] = a[i--];
		while(j != 0 && p != 0) a[p--] = a[j--];
		for(int aa:a)
		{
			if(aa == 0)
				break;
			System.out.print(aa);;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,3,5,7,9,0,0,0,0,0,0,0,0};
		int b[] = {2,4,6};
		sort(a,b);
	}

}
