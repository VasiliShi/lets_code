package lets.code.every.day;

import java.util.HashMap;
import java.util.Map;

public class NumberofBoomerangs {

	/**
	 * ע�� for(int i = 0; i < 5 && i != 2; i++)���÷�����i=2��ʱ����������Ҿ�Ȼ��֪��
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
			for(int j = 0; j < points.length ; j++) //�ڲ�ѭ��������ab,ac,ad����
			{
				if(i != j)
				{
					int dis = distance(points[i], points[j]);
					map.put(dis, map.getOrDefault(dis, 0) + 1); //����python a.get(key,default)
				}
			}
			for(int val:map.values()) 
				result += val * (val-1); //ȫ���� A(n,2)
			map.clear(); //���map
		}
		
		return result;
	}

	public static void main(String[] args) {
		 
	}
}
