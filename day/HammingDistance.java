package lets.code.every.day;

import java.util.Scanner;
/**
 * <h1>Hamming Distance</h1></br>
 * Given two num,x=1,y=4, out:2</br>
 * 1   (0 0 0 1)</br>
 * 4   (0 1 0 0)</br>
 *      ↑   ↑</br>
 * @author VasiliShi
 *
 */
public class HammingDistance {

	public static int hammingDistance(int x, int y) {
        int count = 0;
        while(x != 0 || y != 0)
        {
            if(x % 2 != y % 2)
                count += 1;
            x /= 2;
            y /= 2;
        }
        return count;
    }
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个数字：");
		while(sc.hasNext())
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(x + "和" +y +"的 hamming distince is "+hammingDistance(x,y) );
		}
	}

}
