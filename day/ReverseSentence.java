package lets.code.every.day;

import java.util.Scanner;
import java.util.Stack;

public class ReverseSentence {

	public static String reverse(String str)
	{
		
		String sen[] = str.split(" ");
		String result = "";
		int N = sen.length;
		for(int i = 0; i < N/2; i++)
		{
			String s = sen[i];
			sen[i] = sen[N-1-i];
			sen[N-1-i] = s;
			
		}
		for(String s:sen)
			result += s+" ";
		
		/*
		Stack<String> tmp = new Stack<String>();
		for(String a:sen)
		{
			tmp.push(a);
		}
		while(!tmp.isEmpty())
		{
			result += tmp.pop()+" ";
		}
		*/
		return result.trim();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sentence = "";
		while(sc.hasNext())
		{
			sentence = sc.nextLine();
			System.out.println(reverse(sentence));
		}

	}

}
