package lets.code.every.day;
/**
 * ʹ��������ʽ�������
 * @author swx
 *С��ϲ���ĵ��ʾ����������ԣ�
 *1.����ÿ����ĸ���Ǵ�д��ĸ
 *2.����û��������ȵ���ĸ
 *3.����û�����硰xyxy��(�����x��yָ�Ķ�����ĸ�����ҿ�����ͬ)�����������У������п��ܲ�������
 */
public class LikeWordsbyRE {

	public static boolean isAllUper(String word)
	{
		return word.matches("[A-Z]+");
	}
	public static boolean hasContinous(String word)
	{
		return !word.matches(".*(.)(\\1).*");//.�����ַ���* 0������
	}
	public static boolean isThrEql(String word){
        return !word.matches(".*(.).*(.)(.*\\1)(.*\\2).*");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "ABACADA";
		if(isAllUper(word) && hasContinous(word) && isThrEql(word))
			System.out.println("LIKE...");
		else
			System.out.println("DISLIKE...");
	}

}
