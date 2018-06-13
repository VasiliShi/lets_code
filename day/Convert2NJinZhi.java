package lets.code.every.day;

import java.util.Stack;

public class Convert2NJinZhi {
	/**
	 * 10进制a，转成n进制
	 * @param a  
	 * @param n
	 */
	public static void solution(int a,int n)
	{
		Stack<String> s = new Stack<String>();
		while(a != 0)
		{
			int remider = a % n;
			if(n > 10 && remider > 10)
			{
				int m = remider -10 + 97; //'a'
				s.push((char)m + "");
			}
			else
			{
				s.push(remider + "");
			}
			a /= n;
		}
		while(!s.isEmpty())
		{
			System.out.print(s.pop());
		}
	}
	public static void main(String[] args) {
		solution(5,4);
	}

}