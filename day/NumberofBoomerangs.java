package lets.code.every.day;

import java.util.HashMap;
import java.util.Map;

public class NumberofBoomerangs {

	/**
	 * 注意 for(int i = 0; i < 5 && i != 2; i++)的用法，在i=2的时候就跳出，我竟然不知道
	 * @param a
	 * @param b
	 * @return
	 */
	public int distance(int a[],int b[])
	{
		int x = a[0] - b[0];
		int y = a[1] - b[1];
		return x*x + y*y;
	}
	public int numberOfBoomerangs(int[][] points) {//[a,b,c,d]
		int result = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i  = 0; i < points.length; i++)
		{
			for(int j = 0; j < points.length ; j++) //内层循环，计算ab,ac,ad距离
			{
				if(i != j)
				{
					int dis = distance(points[i], points[j]);
					map.put(dis, map.getOrDefault(dis, 0) + 1); //类似python a.get(key,default)
				}
			}
			for(int val:map.values()) 
				result += val * (val-1); //全排列 A(n,2)
			map.clear(); //清空map
		}
		
		return result;
	}

	public static void main(String[] args) {
		 
	}
}
