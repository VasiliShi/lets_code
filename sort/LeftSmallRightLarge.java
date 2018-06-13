package lets.code.every.sort;
/**
 * һ��int���飬�������������a��i��������ߵĶ�����С���ұߵĶ�������
 * @author swx
 *
 */
public class LeftSmallRightLarge {

	public static void solution(int a[])
	{
		int N = a.length;
		int rightMin[] = new int[N]; //����һ���������е�����
		rightMin[N - 1] = a[N - 1];
		for(int i = N - 2;i >= 0; i--)//�Ӻ���ǰ
		{
			if(a[i] < rightMin[i + 1]) //���a��i���� rightMin����С�Ļ�С������ӵ�rightMin��
				rightMin[i] = a[i];
			else
				rightMin[i] = rightMin[i + 1];//����͸�ֵi+1λ�����ݵ���iΪ
		}
		//int ������Χ��0,0x7fffffff��
		//int ������Χ��0x80000000,0xfffffff��
		int leftMax = 0x80000000; //��һ����С������ʾ���
		for(int i = 0; i < N; i++)
		{
			if(a[i] >= leftMax) 
			{
				leftMax = a[i]; //������������ģ�
				if(leftMax <= rightMin[i]) //������ĵ����ұ���С��
					System.out.print(leftMax+ " ");
			}
		}
	}

	public static void main(String[] args) {

		int array[] = {7,10,2,6,19,22,32};
		solution(array);
	}

}
