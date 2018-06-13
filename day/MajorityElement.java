package lets.code.every.day;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static int majorityElement(int[] nums) {
		int result = 0;
		Map< Integer, Integer> count = new HashMap<>();
		for(int num:nums)
		{
			if(!count.containsKey(num))
				count.put(num, 1);
			else
				count.put(num, count.get(num) + 1);
			if(count.get(num) > nums.length/2) //����ط������ڱ���һ�ߣ�
				result = num;					//������map��Ԫ�ض�����ͬ�����Կ���ֱ����for�ڲ�
		}
		
        return result;
    }
	public static int majorityElement1(int[] nums) {
		int result = nums[0];
		int count = 1;
		for(int i = 1; i < nums.length; i++)
		{
			if(nums[i] == result)
				count++;
			else 
			{
				count--;
				if(count == 0)
				{
					result = nums[i];
					count = 1;
				}
			}
		}
		
        return result;
    }
	public static void main(String[] args) {
		int a[] = {1,1,23,3};
		int result = majorityElement1(a);
		System.out.println(result);

	}

}
