package lets.code.every.day;

import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {

	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> inter = new HashSet<>();
		for(int a:nums1)
			set.add(a);
		for(int a:nums2)
		{
			if(set.contains(a))
				inter.add(a);
			
		}
		int result[] = new int[set.size()];
		int i = 0;
		for(int s:inter)
			result[i++] = s;
		return result;
    }

	public static void main(String[] args) {

	}

}
