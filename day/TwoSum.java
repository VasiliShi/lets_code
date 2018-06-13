package lets.code.every.day;

import java.util.HashMap;
import java.util.Map;
/**
 * Given nums = [2, 7, 11, 15], target = 9,
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
 * @author swx
 *
 */
public class TwoSum {

	/**
	 * ʱ�临�ӶȺͿռ临�Ӷ�O(n)
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int nums[],int target)
	{// ���ַ�����Ҫ������������
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i < nums.length; i++)
			map.put(nums[i], i);
		for(int i = 0; i < nums.length; i++)
		{
			int com = target - nums[i];
			if(map.containsKey(com) && map.get(com) != i) //
			{
				return new int[]{i,(int) map.get(com)};
			}
		}
		throw new IllegalArgumentException("error ");
	}
	//�������ֻ��Ҫ����һ�� ����
	public static int[] twoSum1(int nums[],int target)
	{
		Map<Integer,Integer> map = new HashMap();
		for(int i = 0; i < nums.length; i++)
		{
			int com = target - nums[i];
			if(map.containsKey(com))
			{
				return new int[]{map.get(com),i};
			}
			map.put(nums[i],i);
		}
		throw new IllegalArgumentException("error ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 7, 11, 15};
		int b[] = twoSum(a,9);
		for(int bb:b)
			System.out.println(bb);
		System.out.println(0x7fffffff);
	}

}
