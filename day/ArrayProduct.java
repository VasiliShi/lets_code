package lets.code.every.day;
/**
 * input:һ������Ϊn������input ��2,3,4,5��
 * output������input[i]֮��ĳ˻� ��60.40,30,24��
 * @author swx
 *
 */
public class ArrayProduct {

	public static void sample_solution(int input[])
	{
		for(int i = 0; i < input.length; i++)
		{
			int tmp = 1;
			for(int j =0; j < input.length; j++)
				if(i != j)
					tmp *= input[j];
			System.out.print(tmp + " ");
		}
		System.out.println();
	}
	
	public static void solution(int input[])
	{
		int N = input.length;
		int result[] = new int[N];
		result[0] = 1;
		for(int i = 1;i < N;i++)
		{
			result[i] = result[i - 1] * input[i - 1];//��һ�����ǰ��Ԫ�صĳ˻�
		}
		result[0] = input[N - 1];
		for(int i = N - 2; i > 0; i--) //����ط� ������
		{
			result[i] *= result[0];
			result[0] *= input[i];
		}
		for(int i = 0;i < N; i++)
			System.out.print(result[i] + " ");
		
		
	}
	public static void main(String[] args) {

		int a[] = {2,3,4,5};
		sample_solution(a);
		solution(a);
	}

}
