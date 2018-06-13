package lets.code.every.day;

import java.util.HashMap;
import java.util.Map;

public class KdiffPairs {

	public static int findPairs(int[] nums, int k) 
	{
		if(nums == null || nums.length ==0) return 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		int count = 0;
		for(int i:nums)
		{
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		System.out.println(map.entrySet());
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(k == 0)
			{
				if(entry.getValue() >= 2)
					count ++;
			}
			else {
				if(map.containsKey(entry.getKey() +k))
					count ++;
			}
		}
		return count;
	}
	public static void main(String[] args) {

		int a[] = {3, 1, 4, 1, 5};
		findPairs(a,2);
	}

}
