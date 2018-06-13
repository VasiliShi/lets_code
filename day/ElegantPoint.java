package lets.code.every.day;

import java.util.Scanner;

/**
 * ������Բ�ĵ�Բ�������뾶���ȣ�Բ�ϵĵ��Һ������궼Ϊ��������Ϊ���ŵģ��ҳ����������ĵ�
 * @author Administrator
 *
 */
public class ElegantPoint {

	public static void solution(int a)
	{
		int count = 0;
		int r = (int) Math.sqrt(a);
		for(int y = 1;y <= r;y++)
		{
			int x = (int) Math.sqrt(a - y*y); 
			if(x*x + y*y == a)
				count +=1;
		}
		System.out.println(count*4);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int rSquare = sc.nextInt();
			solution(rSquare);
		}
		sc.close();
	}

}
