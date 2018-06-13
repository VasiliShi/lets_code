package lets.code.every.day;
/**
 * N个数中，出现7的个数
 * 
 * @author swx
 *
 */
public class Count7Num {

	//方法1，计算一个数字中含有7的个数
	public static int count7NumInANum(int n)
	{
		int num = 0;
		while(n != 0)
		{
			num += (n % 10 == 7)?1 : 0;
			n /= 10;
		}
		return num;
	}
	//method 2
	public static int  count7NumInANum_2(int n)
	{
		int count = 0;
		int factor = 1;
		int lowerNum = 0;
		int currNum = 0;
		int higherNum = 0;
		while(n / factor != 0)
		{
			lowerNum = n - (n / factor) * factor;//95 - (95/10)*10 = 5
			currNum = (n / factor) % 10; //(95/10) % 10 = 9;
			higherNum = n / (factor * 10); // 95 / (10 * 10) = 0;
			if(currNum < 7) //比七小，仅仅与高位有关
			{
				System.out.println(count);
				count += higherNum * factor;
			}
			else if(currNum == 7) // 等于7 高位低位都有关
			{
				count += higherNum * factor + lowerNum + 1;
			}
			else //大于7 仅仅与高位有关
			{
				count += (higherNum + 1) * factor;
			}
				
//			switch(currNum)
//			{
//			case 0:
//				count += higherNum * factor;
//				break;
//			case 7:
//				count += higherNum * factor + lowerNum + 1;
//				break;
//			default:
//				count += (higherNum + 1) * factor;
//				break;
//			}
			factor *= 10;
		}
		return count;
	}
	  public static void main(String[] args) { //public 和 static可以互换
		
		{//方法1，遍历
			int count = 0;
			for(int i = 0;i <= 100; i++)
			{
				count += count7NumInANum(i);
			}
			System.out.println("0~100中出现7的个数为："+count);
		}
		/*
		 * 1-100;可以这样表示，01,02,03....99,100 。出现数字总数为2*100 = 200；每个数字出现的次数为200÷10=20 
		 */
		{//method 2
			int count = count7NumInANum_2(100);
			System.out.println("0~1000中出现7的个数为："+count);
		}
	
	}

}
