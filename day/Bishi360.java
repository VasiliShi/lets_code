
package lets.code.every.day;

public class Bishi360 {

	public static int find(String str,String sub)
	{
		int m = str.length();
		int n = sub.length();
		if(m < n)
			return -1;
		int i = 0;
		int j = 0;
		while(i < m && j <n )
		{
			if(str.charAt(i) == sub.charAt(j))
			{
				i++;
				j++;
			}
			else
			{
				i = i - j +1;//»ØËÝ
				j = 0;
			}
		}
		if(j == n)
			//return i - j ;//·µ»ØÎ»ÖÃ
			return i;
		return -1;
	}
	public static String reverse(String str)
	{
		String result = "";
		for(int i = 0;i<str.length();i++)
		{
			result  = str.charAt(i) + result;
		}
		return result;
	}
	public static boolean isHuiwen(String str)
	{
		int i = 0;
		int j = str.length() - 1;
		while(i < str.length()/2)
		{
			if(str.charAt(i) == str.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	public static void solution(String str,String first,String second)
	{
		int firstN = first.length();
		int secondN = second.length();
		int N = str.length();
		String reverse = reverse(str);
		if(N < firstN || N < secondN)
		{
			System.out.println("invalid");
		}
		else if(isHuiwen(str)&&isHuiwen(first)&&isHuiwen(second))
		{
			System.out.println("both");
		}
		else if(find(str, first)!= -1 && find(str.substring(find(str, first)), second)!= -1)
		{
			System.out.println("forward");
		}
		else if(find(reverse, first)!= -1 && find(reverse.substring(find(reverse, first)), second)!= -1)
		{
			System.out.println("backword");
		}
		else
		{
			System.out.println("invalid");
		}
	}
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNext())
//		{
//			String str = sc.nextLine();
//			String first = sc.nextLine();
//			String second = sc.nextLine();
//			solution(str,first,second);
//		}
	
		String str = "fdgrwheiorewi";
		String first = "iw";
		String second = "rgd";
		solution(str,first,second);
	}

}
