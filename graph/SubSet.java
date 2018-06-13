package lets.code.every.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class SubSet {

	/**
	 * �󼯺ϵ��Ӽ�����ͨʵ�ַ���  ���
	 */
	public static  void solution()
	{
		int a[] = {1,2,3,4};
		int num = 1 << 4; //�Ӽ��ĸ���
		int index = 0,k=0;
		for(int i = 0; i < num; i++) //i ��1��15 �������Ӽ�,iת���ɶ�������ʽ
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
				index >>= 1;//������ÿ����λ�����ƣ�һλ��
				k++;
			}
			System.out.println("}");
		}
	}
	// ʹ��java ��setʵ��
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
					subSet.add(set[k]); //����ط����ʹ��set�ͻ���bug����� ����1 1 1 
				}
				index >>= 1;
				k++;
			}
			result.add(subSet);
		}
		return result;
	}
	
	//������ dfs 
    public static void dfs(int[] a, int index, ArrayList<Integer> tmp, Set<ArrayList<Integer>> ret) {
        ret.add(new ArrayList<Integer>(tmp));// 1  ��Ҫ���Ƴ���һ������
    	//ret.add(tmp);  // 2 ��������Ķ� ���������� 
        for (int i = index; i < a.length; i++) {
            tmp.add(a[i]);
            dfs(a, i + 1,tmp, ret); //�ݹ����
            tmp.remove(tmp.size() - 1);
        }
    }
	public static void main(String[] args) {
		
		//����1
		solution();
		
		
		//����2
		{	System.out.println("---------����2---------");
			int a[] = {1,2,3};
			Set<ArrayList<Integer>> result = getSubSet(a);	//���÷���
			//������
			for(ArrayList<Integer> subSet: result)
			{
				for(Integer num: subSet)
					System.out.print(num);
				System.out.println("");
			}
		}
		
		//����3 dfs
		{
			int a[] = {1,2,3,4};
			Set<ArrayList<Integer>> result = new HashSet<ArrayList<Integer>> ();
			dfs(a, 0,new ArrayList<Integer>(), result);
			System.out.println(result);
		}
		
		
	}

}
