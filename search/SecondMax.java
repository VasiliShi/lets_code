package lets.code.every.search;
/**
 * �����еڶ��������
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
			if(a[i] > maxnumber) // �������������洢 ���  �� �ڶ���
			{
				secmax = maxnumber;
				maxnumber = a[i];
			}// ���a[i]û��max��ҲҪ��secmax�Ƚ�һ��
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
