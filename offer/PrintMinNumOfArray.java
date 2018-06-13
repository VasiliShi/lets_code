package lets.code.every.offer;

import java.util.Arrays;
import java.util.Comparator;
/**
 * ÓÐÎó
 * @author swx
 *
 */
public class PrintMinNumOfArray {

	public static String sort(int a[])
	{
		String str[] = new String[a.length];
		for(int i = 0; i < a.length; i++)
		{
			str[i] = a[i] + "";
		}
		Arrays.sort(str, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return (o1+o2).compareTo(o2+o1);
			}
		});
		String result = "";
		for(String s : str)
			result += s;
		return result;
	}
	public static void main(String args)
	{
		int a[] = {3,32,321};
		System.out.println("fdsfs");
		System.out.println(sort(a));
	}
}
