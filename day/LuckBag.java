package lets.code.every.day;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * �������Ʊ���
 * ��������������ĺ�����{1, 1, 2, 3}��������Ӿ������˵ģ���Ϊ1 + 1 + 2 + 3 > 1 * 1 * 2 * 3
 * �����ʵ��Ӵ������Ƴ�һЩ��(�����Ƴ�0��,���Ǳ��Ƴ���)��Ҫʹ�Ƴ���Ĵ��������˵�
 * ��̼���һ������Ի�õĶ����ֲ�ͬ�����˵Ĵ��ӡ�
 * @author swx
 *
 */
public class LuckBag {
/**
 * ˼·:a+b>a*b,a��b����һ����Ϊ1��a+b+c...k<=abc...k,������һ������ xʹ�� a+b+c...k+x>abc...kx
 * ��ôx��ȻΪ1
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
			else //������֦ �����nums[i]> 1 �ض�������   /* ��ôx��ȻΪ1*/
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
