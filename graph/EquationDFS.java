package lets.code.every.graph;
/**
 * �������� ʹ��ʽ����
 * �ڿڿ� + �ڿڿ� = �ڿڿ�
 * @author swx
 *
 */
public class EquationDFS {

	int total = 0;
	int a[] = new int[10];
	int book[] = new int[10];
	public void dfs(int step)
	{
		if(step == 10)
		{
			if(a[1]*100 + a[2]*10 + a[3] + a[4]*100 + a[5]*10+a[6] == a[7]*100 + a[8]*10+a[9])
			{
				total ++;
				//java ��ʽ����� ʹ��printf
				System.out.printf("%d%d%d+%d%d%d=%d%d%d",a[1],a[2],a[3],a[4],a[5],a[6],a[7],a[8],a[9]);
				System.out.println();
			}
		}
		for(int i = 1; i<=9;i++)
		{
			if(book[i] == 0)
			{
				a[step] = i;
				book[i] = 1;
				dfs(step+1);
				book[i] = 0;
			}
		}
		
	}
	
	public static void main(String[] args) {

		EquationDFS dfs = new EquationDFS();
		dfs.dfs(1);
		System.out.println("total num is:"+ dfs.total/2);//��Ϊ a+b=c ��b+a=c �������
	}

}
