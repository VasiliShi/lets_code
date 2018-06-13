package lets.code.every.graph;
/**
 * ȫ�������⣬
 * @author swx
 *
 */
public class Permutation {
/**
 * 
 * @param a
 * @param k Ԫ�ص�index
 * @param m  ���һ��Ԫ�ص�index
 */
	public static void permutation(int a[], int k, int m)
	{
		if(k == m ) //ֱ����n��Ԫ�ص���n��Ԫ�ص�ȫ���У��ݹ����
		{
			for(int i = 0; i <= m; i++)
				System.out.print(a[i]);
			System.out.println();
			return ;
		}
		else
		{
			for(int j = k; j <= m; j++)
			{
				swap(a,j,k);
				permutation(a, k+1, m);//���2��Ԫ�ص���N��Ԫ��ȫ����
				swap(a,j,k); //���ı������ָ�
			}
		}
	}
	private static void swap(int[] a, int j, int k) {
		int temp = 0;
		temp = a[j];
		a[j] = a[k];
		a[k] = temp;
	}
	public static void main(String[] args) {

		int a[] = {1,2,3,4};
		permutation(a, 0, 3);
	}

}
