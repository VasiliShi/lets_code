package lets.code.every.java;
/**
 * String 的几种创建方式的对比
 * @author swx
 *
 */
public class StringTest {

	public static void test()
	{
		String s1 = "12345";
		String s2 = s1;
		String s3 = "12345";
		String s4 = new String("12345");
		String s5 = new String("12345");
		System.out.println("s1==s3"+(s1==s3)); //true
		System.out.println("s1==s4"+(s1==s4)); //false
		System.out.println("s2.equals(s4)"+s2.equals(s4)); //true
		System.out.println("s4==s5"+(s4==s5)); // false
		System.out.println("s5.equals(s5)"+(s4.equals(s5))); //true
	}
	public static void test1()
	{
		int i = 20160728;
		String s = "The London Olympics";
		String result;
		if(i > 20160805 && (s = "The Rio Olympics").contains("Rio"))
		{
			result = "China";
		}
		else
		{
			result = "Chinese";
		}
		System.out.println(result + ",Welcome to" + s);
	}
	public static void main(String[] args) {
		//test();
		//test1();
		int a = 1,b = 2,c = 0;
		do{
			--b;
			a = a-1;
		}while(a > 1);
		c = a ^ b;
		System.out.println(c);
		byte e = 5;
		System.out.println(e << 1);
	}

}
