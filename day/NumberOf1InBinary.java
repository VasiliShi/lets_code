package lets.code.every.day;

/**
 * 剑指offer 10
 * 给定一整数，计算其二进制中 1的 个数
 * eg：9:1001,1的个数为2
 * @author swx
 *
 */
public class NumberOf1InBinary {

	public static int count(int a)
	{
		int count = 0;
		while(a != 0)
		{
			if(a % 2 != 0) //a & 1
				count += 1;
			a /= 2;
		}
		return count;
	}
	public static void main(String[] args) {

		int count = count(5);
		System.out.println(count);
	}

}
