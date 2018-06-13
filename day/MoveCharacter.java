package lets.code.every.day;

/**
 * ÒÆ¶¯×Ö·û
 * @author swx
 *
 */
public class MoveCharacter {

	public static void exch(char []a,int i ,int j)
	{
		char tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	public static void solution(String str)
	{
		char array[] = str.toCharArray();
		int N = array.length;
		for(int i = 1; i < N; i++)
		{
			for(int j = i; j > 0; j--)
			{
				if(array[j] >= 'a' && array[j] <= 'z' && array[j - 1] >= 'A' && array[j - 1] <= 'Z')
				{
					exch(array,j,j - 1);
				}
			}
		}

		System.out.println(String.valueOf(array));
	}
	public static void main(String[] args) {
		String str = "AkleBiCeilD";
		solution(str);
	}

}
