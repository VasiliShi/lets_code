package lets.code.every.day;

import java.util.Scanner;
/**
 * ����������M��N��M���������M���ַ�����N���������ÿ���ַ�����λ����������0��
 * ���磺����2,8�� ��abc�� ����123456789���������Ϊ��abc00000��,��12345678��,��90000000�� 
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
			int m = sc.nextInt(); //�ַ�������
			int n =sc.nextInt();  //Ҫ��ضϵĳ���
			System.out.println("�ַ�������: "+ m +" �ضϵĳ��� : "+n);
			for(int i = 0;i < m; i++)
			{
				String str = sc.next(); //����
				solution(str,n);
			}
		}
	}

}
