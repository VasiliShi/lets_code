package lets.code.every.day;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
	public static int[] nextGreaterElement1(int[] nums1, int[] nums2) {
		Stack<Integer> stack = new Stack<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] res = new int[nums1.length];
		for (int i = 0; i < nums2.length; i++) {
			while (!stack.empty() && nums2[i] > stack.peek())
				map.put(stack.pop(), nums2[i]);
			stack.push(nums2[i]);
		}
		while (!stack.empty())
			map.put(stack.pop(), -1);
		for (int i = 0; i < nums1.length; i++) {
			res[i] = map.get(nums1[i]);
		}
		return res;
	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int result[] = new int[nums1.length];

		for (int i = 0; i < nums1.length; i++) {
			int tmp = Integer.MAX_VALUE;
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j])
					tmp = nums1[i];
				if (nums2[j] > tmp) {
					result[i] = nums2[j];
					break;
				}

			}
		}
		for (int i = 0; i < result.length; i++)
			if (result[i] == 0)
				result[i] = -1;
		return result;

	}

	public static void main(String[] args) {

		int a[] = { 4, 1, 2 };
		int b[] = { 1, 3, 4, 2 };
		for (int i : nextGreaterElement(a, b))
			System.out.print(i + ",");

	}

}
