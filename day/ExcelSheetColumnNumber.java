package lets.code.every.day;

public class ExcelSheetColumnNumber {

	public int titleToNumber(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result = result * 26 + (int)(s.charAt(i) - 'A' + 1);
		}
		return result;
	}
	public int test1(String s)
	{	
		int result = 0;
		for(int i  = s.length() - 1; i>=0;i--)
		{
			result +=(s.charAt(i) - 'A' + 1)*(int)Math.pow(26, s.length() - 1 -i);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i  = 6 - 1; i>=0;i--)
		{
			 System.out.println(6 -i);
		}

	}

}
