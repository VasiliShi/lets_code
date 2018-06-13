package lets.code.every.offer;
/**
 * 实现一个函数，把字符串的空格替换成%20，we are happy -> we%20are%20happy
 * @author swx
 *
 */
public class ReplaceBlank_4 {
	//方法1
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
		int p1 = n - 1; //前面的指针
		int p2 = array.length - 1;//后一个指针
		while(p1 >= 0&&p1 <= p2)
		{
			if(str.charAt(p1) == ' ') //注意 “--”操作的位置
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
			//p1-- //同样的错做可以放到外面
		}
		System.out.println(new String(array));
	}
	//复杂的做法是：找出空格的个数 num*2，创建一个 N + num*2 长度的 数组，一个位置一个位置的赋值
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
