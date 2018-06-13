package lets.code.every.day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 给出一个数字集合，找出最大的子集，使得这个子集中的任意两个元素满足（si，sj），满足si%sj=0或sj%si=0
 * nums：【1,2,3】
 * result：【1,2】 【1,3】
 * @author swx
 *
 */
public class LargestDivisibleSubSet {

	public static  List solution(int nums[])
	{
		Arrays.sort(nums);
		int f[] = new int[nums.length];
		int pre[] = new int[nums.length];
		for(int i = 0;i < nums.length; i++)
		{
			f[i] = 1;
			pre[i] = i;
			for(int j = 0;j < i;j++)//到i的前一个元素
			{
				if(nums[i] % nums[j] == 0 && f[i] < f[j] + 1)
				{
					f[i] = f[j] + 1;
					pre[i] = j;
				}
			}
		}
		List<Integer> ans = new ArrayList<Integer>();
		if(nums.length == 0)
			return ans;
		int max = 0;
		int max_i = 0;
		for(int i = 0; i < nums.length;i++)
		{
			if(f[i] > max)
			{
				max = f[i];
				max_i = i;
			}
		}
		ans.add(nums[max_i]);
		while(max_i != pre[max_i])
		{
			max_i = pre[max_i];
			ans.add(nums[max_i]);
			
		}
		Collections.sort(ans);
		return ans;
	}
	public static void main(String[] args) {
		int a[] = {1,2,3,5,4,8};
		List ans = solution(a);
		for(int i = 0;i < ans.size();i++)
			System.out.print(ans.get(i)+" ");
	}

}
