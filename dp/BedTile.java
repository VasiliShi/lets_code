package lets.code.every.dp;
/**
 * ����ש���⣬ʹ�õ��Ƕ�̬�滮
 * @author swx
 *
 */
public class BedTile {
//��̬�滮 ������¼�� ����
	public static int bed(int a[],int m )
	{
		if(a[m] != 0)
			return a[m];
		if(m == 0) //��0��ʼ������һ��Ԫ��
			a[m] = 1;
		else if(m == 1)
			a[m] = 2;
		else
		{
			a[m] = bed(a,m - 1) + bed(a,m - 2);
		}
		return a[m];
	}
	
	public static int bed_2(int a[],int m)
	{
		a[0] = 1;
		a[1] = 2;
		for(int i = 2;i <= m; i++)
			a[i] = a[i - 1] + a[i - 2];
		return a[m] ;
	}
	public static void main(String[] args) {

		
		{// method 1
			int a[] = {0,0,0,0};
			System.out.println(bed(a,3));
			for(int b :a)
				System.out.print(b + " ");
			System.out.println();
		}
		{// method 1
			int a[] = {0,0,0,0};
			System.out.println(bed_2(a,3));
			for(int b :a)
				System.out.print(b + " ");
		}
	}

}
