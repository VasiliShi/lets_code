package lets.code.every.sort;
/**
 * 对公司员工的年龄进行排序，由于年龄范围0~99,数字的范围小出现的频率高
 * @author swx
 *
 */
public class AgeSort {

	public static void sortAge(int ages[])
	{
		int N = ages.length;
		if (ages == null || N <= 0)
			return ;
		//假定年龄最大的为99岁
		int oldestAge = 99;
		//定义一个长度为99的数组
		int timesOfAge[] = new int[oldestAge ]; //每一个年龄出现的次数
		
		for(int i = 0; i < oldestAge; i++) // not necessary,because java array is initialized with zero
			timesOfAge[i] = 0;
		for(int i = 0; i < N; i++)
		{
			int age = ages[i];
			timesOfAge[age] ++;
		}
		int index = 0;
		for(int i = 0; i < oldestAge; i++)
		{
			for(int j = 0; j <timesOfAge[i]; j++)
			{
				ages[index] = i;
				index ++;
			}
		}
	}
	public static void main(String args[])
	{
		int a[] = {3,1,2,2,6,5,8};
		sortAge(a);
		for(int aa : a)
			System.out.print(aa+"  ");
	}
}
