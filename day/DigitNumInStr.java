package lets.code.every.day;
/**
 * �ҳ��ַ����� �������ֶεĴ�����eg ��cat123dot456bird45��3��; 
 * ע���ַ���ͷ
 * @author swx
 *
 */
public class DigitNumInStr {

	public static void count(String str)
	{
		boolean oldTag = false;
		boolean tag = false;
		int n = 0;
		for(int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			tag = 'c' >= '0' && c <= '9';
			if(oldTag != tag && tag == true)
				n++;
			oldTag = tag;
		}
		System.out.println(n);
	}
	public static void main(String[] args) {

		String s = "cat123dot456bird45";
		count(s);
	}

}
