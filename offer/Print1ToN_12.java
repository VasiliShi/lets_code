package lets.code.every.offer;

/**
 * 面试题12：打印1到最大的n位数
 * 输入数字n，按顺序打印出1到最大的n位十进制数，比如输入3，则打印出1,2,3一直到最大的三位数999
 * @author swx
 *
 */
public class Print1ToN_12 {

	public static void method_1(int n )
	{
		int num = 1;
		int i = 1;
		while(i <= n)
		{
			num *= 10;
			i++;
		}
		for(i = 1;i < num; i++)
			System.out.print(i +" ");
	}
	
	////
	public static void method_2(int n)
	{
		if(n <= 0)
			return;
		char num[] = new char[n];
		for(int i = 0; i < num.length; i++)
			num[i] = '0';
		int time = 0;
		while(!increment(num))
		{
			print(num);
			time ++;
			if(time % 10 == 0)
			{
				System.out.println();
				time = 0;
			}
		}
	}
	///模拟整数加法
	public static boolean increment(char num[])
	{
		int remider = 0; //进位，5+7 = 12，此时remider=1
		for(int i =num.length - 1; i >= 0;i--)
		{
			int count = num[i] - '0' + remider;
			if(i == num.length - 1) //最后一位发生变化
				count += 1;
			if(count >= 10)
			{
				if(i == 0)
					return true;//最高位发生进位
				else
				{
					count -= 10;
					remider = 1;
					num[i] = (char) ('0' + count);
				}
			}
			else
			{
				num[i] = (char) ('0' + count);
				break;
			}
		}
		return false;
	}
	public static void print(char num[])
	{
		for(int i = 0;i <= num.length - 1;i++)
		{
			if(num[i] != '0')
			{
				for(int j = i;j <= num.length - 1;j++)
				{
					System.out.print(num[j]);
				}
				System.out.print("  ");
				break;
			}
		}
	}
	// 使用递归
	public static void method_3(int n)
	{
		if(n <= 0)
			return;
		char num[] = new char[n];
		for(int i = 0; i < 10; i++) 
		{
			num[0] = (char) (i + '0');//第0位 全排列0~9
			recursive(num,n ,0);
		}
	}
	public static void recursive(char num[],int length ,int index) //index全排列到第几位了
	{
		if(index == length - 1)
		{
			System.out.println();
			print(num);
			return;
		}
		for(int i = 0; i < 10; i++)
		{
			num[index + 1] = (char) (i + '0');
			recursive(num,length,index + 1);
		}
	}
	public static void main(String[] args) {
		//method_1(2);
		method_2(4);		
	}
}
