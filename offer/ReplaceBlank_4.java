package lets.code.every.offer;
/**
 * ʵ��һ�����������ַ����Ŀո��滻��%20��we are happy -> we%20are%20happy
 * @author swx
 *
 */
public class ReplaceBlank_4 {
	//����1
	public static void solution(String str)
	{
		if(str == null || str.length() <=0)
			return ;
		int n = str.length();
		int blankNum = 0;
		for(int i = 0; i < n; i++)
		{
			if(str.charAt(i) == ' ')
				blankNum ++;
		}
		char []array = new char[n + blankNum * 2];
		int p1 = n - 1; //ǰ���ָ��
		int p2 = array.length - 1;//��һ��ָ��
		while(p1 >= 0&&p1 <= p2)
		{
			if(str.charAt(p1) == ' ') //ע�� ��--��������λ��
			{
				array[p2--] = '0';
				array[p2--] = '2';
				array[p2--] = '%';
				p1--; //
			}
			else
			{
				array[p2--] = str.charAt(p1--);//
			}
			//p1-- //ͬ���Ĵ������Էŵ�����
		}
		System.out.println(new String(array));
	}
	//���ӵ������ǣ��ҳ��ո�ĸ��� num*2������һ�� N + num*2 ���ȵ� ���飬һ��λ��һ��λ�õĸ�ֵ
	 public static String replaceSpace(String str) {
		 StringBuffer sb = new StringBuffer();
		 for(int i = 0; i < str.length(); i++)
			 if(str.charAt(i) == ' ')
				 sb.append("%20");
			 else
				 sb.append(str.charAt(i));
		 
		 return sb.toString();
	 }
	public static void main(String[] args) {
		String str = "we are happy";
		System.out.println(replaceSpace(str));
	}

}
