package lets.code.every.day;

import java.util.Scanner;

/**
 * 坐标在圆心的圆，给出半径长度，圆上的点且横纵坐标都为整数被称为优雅的，找出所有这样的点
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
