package lets.code.every.day;

import java.util.Scanner;

/**
 * ƴ��ת����
 * ������һ��ֻ����ƴ�����ַ������������Ӧ���������С�ת����ϵ���£�
 * ������      ƴ��        yi  er  san  si  wu  liu  qi  ba  jiu
 * ����������        1   2   3      4   5    6    7   8   9
 * �����ַ�ֻ����Сд��ĸ�������ַ�����������ƥ��
 * eg:input: yiersansi ---> 1234
 * @author swx
 *  
 */
public class Pinyin2Digit {

	public static void sulution(String str)
	{
		int i = 0;
		String result = "";
		while(i < str.length())
		{
			switch(str.charAt(i))
			{
			case 'y':
				result += '1';
				i += 2;
				break;
			case 'e':
				result += '2';
				i += 2;
				break;
			case 's':
				if(str.charAt(i + 1) == 'a')
				{
					result += '3';
					i += 3;
				}
				else
				{
					i += 2;
					result += '4';
				}
				break;
			case 'w':
				result += '5';
				i += 2;
				break;
			case 'l':
				result += '6';
				i += 3;
				break;
			case 'q':
				result += '7';
				i += 2;
				break;
			case 'b':
				result += '8';
				i += 2;
				break;
			case 'j':
				result += '9';
				i += 3;
				break;
			}
		}
		System.out.println("digit is : "+Integer.parseInt(result));
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("please in put string :");
		while(sc.hasNext())
		{	
			String str = sc.next();
			sulution(str);
		}
	}

}
