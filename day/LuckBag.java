package lets.code.every.day;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 网易内推笔试
 * 如果袋子里面的球的号码是{1, 1, 2, 3}，这个袋子就是幸运的，因为1 + 1 + 2 + 3 > 1 * 1 * 2 * 3
 * 可以适当从袋子里移除一些球(可以移除0个,但是别移除完)，要使移除后的袋子是幸运的
 * 编程计算一下你可以获得的多少种不同的幸运的袋子。
 * @author swx
 *
 */
public class LuckBag {
/**
 * 思路:a+b>a*b,a。b其中一个必为1，a+b+c...k<=abc...k,若加入一个数字 x使得 a+b+c...k+x>abc...kx
 * 那么x必然为1
 * @param nums
 * @param index
 * @param sum
 * @param multi
 * @return
 */
	public static int find(int nums[],int index,long sum,long multi)
	{
		int count = 0;
		for(int i = index; i < nums.length; i++)
		{
			sum += nums[i];
			multi *= nums[i];
			if(sum > multi)
				count += 1 + find(nums, index + 1, sum, multi);
			else if (nums[i] == 1) {
				count += find(nums, index + 1, sum, multi);
			}
			else //搜索剪枝 ，如果nums[i]> 1 必定不可以   /* 那么x必然为1*/
				break;
			sum -= nums[i];
			multi /= nums[i];
			while(i < nums.length - 1 && nums[i]==nums[i+1])
				i++;
		}
		return count ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n = sc.nextInt();
			int nums[] = new int[n];
			for(int i = 0;i < n; i++)
				nums[i] = sc.nextInt();
			Arrays.sort(nums);
			System.out.println(find(nums, 0, 0, 1));
		}
		sc.close();
	}

}
