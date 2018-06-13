package lets.code.every.java;
/**
 * 观察值得变化
 * @author swx
 *
 */
public class ValueChange {

	String str = new String("hello");
	char ch[] = {'1','2','3','4'};
	public void change(String str,char ch[])
	{
		str = "hi";
		ch[0] = 'g';
	}
	public void test()
	{
		change(str, ch);
		System.out.println(str + "and");
		System.out.println(ch);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ValueChange vc = new ValueChange();
		vc.test();
		//
		String s = "abcdefg";
		s.concat("123");
		s.toUpperCase();
		System.out.println(s);
	}

}
