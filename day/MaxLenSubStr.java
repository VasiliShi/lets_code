package lets.code.every.day;
//��ظ��ִ�
public class MaxLenSubStr {

	public static String solution(String str)
	{
		int maxi = 0;
		int maxj = 0;
		int thislen = 0,maxlen = 0;
		for(int i = 0; i < str.length(); i++)
			for(int j = i+1; j < str.length(); j++)
			{
				if((thislen = sublen(str.substring(i),str.substring(j))) > maxlen)
				{
					maxlen = thislen;
					maxi = i;
					maxj = j;
				}
			}
		return str.substring(maxi, maxj+1); //����ǵ�Ҫ+1��
	}
	// a b �����ִ��ĳ���
	public static int sublen(String a, String b)
	{
		int i = 0;
		int count = 0;
		while(i < b.length())
		{
			if(a.charAt(i) == b.charAt(i))
				count += 1;
			else
				//return count;
				break;
			i++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdabcda";

		{
			String maxlen = solution(str);
			System.out.println("method one :"+maxlen);
		}


	}

}
