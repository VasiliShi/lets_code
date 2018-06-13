package lets.code.every.day;
public class ReverseString {

	public static String reverse(String s)
	{
		int N = s.length();
		String reverse = "";
		for(int i = 0; i < N; i++)
		{
			reverse = s.charAt(i) + reverse;
		}
		return reverse;
	}
	public static String reverse1(String s)
	{
		int N = s.length();
		if(N == 1)
			return s;
		String left = s.substring(0, N/2);
		String right = s.substring(N/2, N);
		return reverse1(right) + reverse1(left);
	}
	public static  String reverse2(String s)
	{
		if(s.equals("") || s.length() <=1)
			return s;
		char a[] = s.toCharArray();
		for(int i = 0; i < a.length / 2; i++)
		{
			char tmp = a[i];
			a[i] = a[a.length-i-1];
			a[a.length - i - 1] = tmp;
		}
		return String.valueOf(a);
	}
	public static void main(String[] args) {

		String s = "12345678";
		System.out.println(reverse1(s));
	}

}
