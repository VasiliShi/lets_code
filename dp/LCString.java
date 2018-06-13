package lets.code.every.dp;

public class LCString {
/**
 * ʹ��LCS��������LCString��
 * @param a
 * @param b
 * @return
 */
	public static int subString(String a,String b )
	{
		int lenA = a.length();
		int lenB = b.length();
		int m[][] = new int[lenA + 1][lenB + 1];
		int maxLen = 0;
		int tmp = 0;
		for(int i = 1; i < lenA;i++)
		{
			char aa = a.charAt(i - 1);
			for(int j = 1; j < lenB; j++)
			{
				char bb = b.charAt(j - 1);
				if(aa == bb)
				{
					m[i][j] = m[i - 1][j - 1] + 1; //����ַ����,���Ͻ�Ԫ��+1
					maxLen = Math.max(maxLen, m[i][j]);
				}
			}
		}
		return maxLen;
	}

	public static void getLCString(char[] str1, char[] str2) {
		int i, j;
		int len1, len2;
		len1 = str1.length;
		len2 = str2.length;
		int maxLen = len1 > len2 ? len1 : len2;
		int[] max = new int[maxLen];
		int[] maxIndex = new int[maxLen];
		int[] c = new int[maxLen]; // ��¼�Խ����ϵ����ֵ�ĸ���

		for (i = 0; i < len2; i++) 
		{
			for (j = len1 - 1; j >= 0; j--) 
			{
				if (str2[i] == str1[j]) 
				{
					if ((i == 0) || (j == 0))
						c[j] = 1;
					else
						c[j] = c[j - 1] + 1;
				} 
				else
				{
					c[j] = 0;
				}

				if (c[j] > max[0])
				{ // ����Ǵ�������ʱֻ��һ�������,����Ҫ�Ѻ������0;
					max[0] = c[j]; // ��¼�Խ���Ԫ�ص����ֵ��֮���ڱ���ʱ������ȡ�Ӵ��ĳ���
					maxIndex[0] = j; // ��¼�Խ���Ԫ�����ֵ��λ��

					for(int k = 1; k < maxLen; k++) 
					{
						max[k] = 0;
						maxIndex[k] = 0;
					}
				}
				else if (c[j] == max[0]) 
				{ // �ж������ͬ���ȵ��Ӵ�
					for(int k = 1; k < maxLen; k++) 
					{
						if (max[k] == 0) 
						{
							max[k] = c[j];
							maxIndex[k] = j;
							break; // �ں����һ����Ҫ�˳�ѭ����
						}

					}
				}
			}
		}

		for (j = 0; j < maxLen; j++) 
		{
			if (max[j] > 0)
			{
				System.out.println("��" + (j + 1) + "�������Ӵ�:");
				for (i = maxIndex[j] - max[j] + 1; i <= maxIndex[j]; i++)
					System.out.print(str1[i]);
				System.out.println(" ");
			}
		}
	}
	public static void main(String[] args) {

		String str1 = new String("123456abcd567");
		String str2 = new String("234dddabc45678");
		getLCString(str1.toCharArray(), str2.toCharArray());
	}

}
