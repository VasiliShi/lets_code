package lets.code.every.offer;
/**
 * ��ָoffer ������4��չ����һ������������
 * @author swx
 * ���������������A1��A2��A1ĩβ���㹻�Ŀռ�����A2����A2�������ֲ���A1�У�Ҫ��A1����
 */
public class SortInOneArray_4 {

	public static void sort(int a[],int b[])
	{
		int i = 0; //ָ��a
		for(int aa:a)
		{
			if(aa == 0)
				break;
			i++;
		}
		int p = i + b.length - 1;//ָ��aĩβ
		int j = b.length - 1;//ָ��bĩβ
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
