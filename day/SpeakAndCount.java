package lets.code.every.day;
/**
 * n����Χ��һȦ������m/m�ı�����Ȧ�����ʣ�µ�����˭
 * @author swx
 *
 */
public class SpeakAndCount {

	public static void left(int n,int m )//ʣ��
	{
		boolean persons[] = new boolean[n];
		int code = 1;//�����Ƶ�ǰ������
		int idx = 0;
		int size = n;
		while(size > 0)
		{
			if(!persons[idx])
			{
				if(code == m)
				{
					persons[idx] = true;
					System.out.println(idx + 1);
					code = 0;
					size --;
				}
				code ++;
			}
			idx ++;
			if(idx ==n)
				idx = 0;
		}
	}
	public static void main(String[] args) {
		left(6,3);
	}

}
