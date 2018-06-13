package lets.code.every.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class SubSet {

	/**
	 * 求集合的子集，普通实现方法  输出
	 */
	public static  void solution()
	{
		int a[] = {1,2,3,4};
		int num = 1 << 4; //子集的个数
		int index = 0,k=0;
		for(int i = 0; i < num; i++) //i 从1到15 就是真子集,i转化成二进制形式
		{
			index = i;
			k = 0;
			System.out.print("{");
			while(index != 0)
			{
				if((index & 1) != 0)
				{
					System.out.print(a[k]);
				}
				index >>= 1;//二进制每次移位（右移）一位，
				k++;
			}
			System.out.println("}");
		}
	}
	// 使用java 的set实现
	public static Set<ArrayList<Integer>>  getSubSet(int set[])
	{
		Set<ArrayList<Integer>> result = new HashSet<ArrayList<Integer>>();
		int n = set.length;
		int num = n==0 ? 0:1 << n;
		for(int i = 0;i < num; i++)
		{
			ArrayList<Integer> subSet = new ArrayList<Integer>();
			int index = i;
			int k = 0;
			while(index != 0)
			{
				if((index & 1) != 0)
				{
					subSet.add(set[k]); //这个地方如果使用set就会有bug，如果 都是1 1 1 
				}
				index >>= 1;
				k++;
			}
			result.add(subSet);
		}
		return result;
	}
	
	//方法三 dfs 
    public static void dfs(int[] a, int index, ArrayList<Integer> tmp, Set<ArrayList<Integer>> ret) {
        ret.add(new ArrayList<Integer>(tmp));// 1  需要复制出来一个对象
    	//ret.add(tmp);  // 2 这样不会改动 ※※※※※ 
        for (int i = index; i < a.length; i++) {
            tmp.add(a[i]);
            dfs(a, i + 1,tmp, ret); //递归过程
            tmp.remove(tmp.size() - 1);
        }
    }
	public static void main(String[] args) {
		
		//方法1
		solution();
		
		
		//方法2
		{	System.out.println("---------方法2---------");
			int a[] = {1,2,3};
			Set<ArrayList<Integer>> result = getSubSet(a);	//调用方法
			//输出结果
			for(ArrayList<Integer> subSet: result)
			{
				for(Integer num: subSet)
					System.out.print(num);
				System.out.println("");
			}
		}
		
		//方法3 dfs
		{
			int a[] = {1,2,3,4};
			Set<ArrayList<Integer>> result = new HashSet<ArrayList<Integer>> ();
			dfs(a, 0,new ArrayList<Integer>(), result);
			System.out.println(result);
		}
		
		
	}

}
