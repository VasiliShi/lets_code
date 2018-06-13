package lets.code.every.day;
/**
 * 12453,���һ�������������ڵ����ӣ������м�����˵�С��eg123 Ҳ��������
 * @author Administrator
 *
 */

public class JDbishi {

	public static void solution(int a[])
	{
		int N = a.length;
		int matrix[][] = new int[N][N];
		int mid = 0x80000000;
		for(int i = 0;i < N; i++)
		{
			mid = a[(i+1)%N];
			matrix[i][(i+1)%N] = 1;
			matrix[(i+1)%N][i] = 1;
			for(int j = (i+2) % N; j % N != i; j++) //j˳ʱ����ת��
			{
				if(a[i] > mid && a[j] > mid )
				{
					mid = a[j];//��j��ֵ����mid
					matrix[i][j] = 1;
					matrix[j][i] = 1;
				}
			}
		}
		
		int count = 0;
		for(int i = 0; i < N;i++ )
			for(int j = 0;j <= i; j++)
				if(matrix[i][j] == 1)
					count += 1;
		
		System.out.println("�ܹ��У�"+count+" ����ͨ��ʽ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]  = {1,2,4,5,3};
		int a[]  = {2,1,3,4,5,6};
		solution(a);

	}

}
