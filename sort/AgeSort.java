package lets.code.every.sort;
/**
 * �Թ�˾Ա����������������������䷶Χ0~99,���ֵķ�ΧС���ֵ�Ƶ�ʸ�
 * @author swx
 *
 */
public class AgeSort {

	public static void sortAge(int ages[])
	{
		int N = ages.length;
		if (ages == null || N <= 0)
			return ;
		//�ٶ���������Ϊ99��
		int oldestAge = 99;
		//����һ������Ϊ99������
		int timesOfAge[] = new int[oldestAge ]; //ÿһ��������ֵĴ���
		
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
