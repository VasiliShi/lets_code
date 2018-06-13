package lets.code.every.day;

public class MoveZeroes {

	public static void solution(int a[])
	{
		int j = 0;
		int tmp;
		for(int i = 0; i < a.length; i++)
			if(a[i] != 0)
			{
				 tmp = a[j];
				a[j] = a[i];
				a[i] = tmp;
				j++;
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0, 1, 0, 3, 12};
		solution(nums);
		for(int a:nums)
			System.out.println(a);
	}

}
