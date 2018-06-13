package lets.code.every.day;

import java.util.Scanner;
/**
 * 输入两个数M，N；M代表输入的M串字符串，N代表输出的每串字符串的位数，不够补0。
 * 例如：输入2,8， “abc” ，“123456789”，则输出为“abc00000”,“12345678“,”90000000” 
 * @author swx
 *
 */
public class SplitString {
	public static void solution(String str, int n)
	{
		int len = str.length(); //the length of str
		int quotient = len / n; //num of can be splited
		int remainder = len % n; // remainder
		if(quotient > 0)
		{
			for(int i = 1; i <= quotient; i++)
			{
				System.out.println(str.substring(n*(i - 1), n*i));
			}
		}
		String str2 = str.substring(len - remainder);
		while(str2.length() < n)
			str2 += "0";
		System.out.println(str2);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int m = sc.nextInt(); //字符串数量
			int n =sc.nextInt();  //要求截断的长度
			System.out.println("字符串数量: "+ m +" 截断的长度 : "+n);
			for(int i = 0;i < m; i++)
			{
				String str = sc.next(); //读入
				solution(str,n);
			}
		}
	}

}
