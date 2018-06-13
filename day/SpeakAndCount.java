package lets.code.every.day;
/**
 * n个人围成一圈报数，m/m的倍数出圈，最后剩下的人是谁
 * @author swx
 *
 */
public class SpeakAndCount {

	public static void left(int n,int m )//剩下
	{
		boolean persons[] = new boolean[n];
		int code = 1;//用来计当前报的数
		int idx = 0;
		int size = n;
		while(size > 0)
		{
			if(!persons[idx])
			{
				if(code == m)
				{
					persons[idx] = true;
					System.out.println(idx + 1);
					code = 0;
					size --;
				}
				code ++;
			}
			idx ++;
			if(idx ==n)
				idx = 0;
		}
	}
	public static void main(String[] args) {
		left(6,3);
	}

}
