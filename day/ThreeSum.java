package lets.code.every.day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	static List<List<Integer>> result = new ArrayList<List<Integer>>();
	public static List<List<Integer>> threeSum(int[] num)
	{
		if(num == null || num.length < 3)
		{
			return result;
		}
		Arrays.sort(num);
		int len = num.length;
		for(int i = 1; i <= len - 1; i++)
		{
			if(num[i] == num[i-1]) continue;
			find(num,i-1,len - 1,num[i-1]);
		}
		return result;
	}
	public static void find(int num[],int begin,int end,int target)
	{
		int l = begin;
		int r = end;
		while(l < r)
		{
			if(num[l] + num[r] + target == 0)
			{
				List<Integer> res = new ArrayList<Integer>();
				res.add(num[l]);
				res.add(num[r]);
				res.add(target);
				result.add(res);
				while(l < r && num[l] == num[l + 1]) l ++;
				while(l < r && num[r] == num[r - 1]) r --;
				l ++;
				r -- ;
			}
			else if (num[l] + num[r] + target < 0)
				l ++;
			else r --;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a = {-1,0,1,2,-1,-4,4,-3,0};
		List<List<Integer>> res = threeSum(a);
		System.out.println(res);
	}

}
