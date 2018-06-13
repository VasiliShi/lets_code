package lets.code.every.day;
/**
 * N�����У�����7�ĸ���
 * 
 * @author swx
 *
 */
public class Count7Num {

	//����1������һ�������к���7�ĸ���
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
			if(currNum < 7) //����С���������λ�й�
			{
				System.out.println(count);
				count += higherNum * factor;
			}
			else if(currNum == 7) // ����7 ��λ��λ���й�
			{
				count += higherNum * factor + lowerNum + 1;
			}
			else //����7 �������λ�й�
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
	  public static void main(String[] args) { //public �� static���Ի���
		
		{//����1������
			int count = 0;
			for(int i = 0;i <= 100; i++)
			{
				count += count7NumInANum(i);
			}
			System.out.println("0~100�г���7�ĸ���Ϊ��"+count);
		}
		/*
		 * 1-100;����������ʾ��01,02,03....99,100 ��������������Ϊ2*100 = 200��ÿ�����ֳ��ֵĴ���Ϊ200��10=20 
		 */
		{//method 2
			int count = count7NumInANum_2(100);
			System.out.println("0~1000�г���7�ĸ���Ϊ��"+count);
		}
	
	}

}
