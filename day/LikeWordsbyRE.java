package lets.code.every.day;
/**
 * 使用正则表达式解决问题
 * @author swx
 *小易喜欢的单词具有以下特性：
 *1.单词每个字母都是大写字母
 *2.单词没有连续相等的字母
 *3.单词没有形如“xyxy”(这里的x，y指的都是字母，并且可以相同)这样的子序列，子序列可能不连续。
 */
public class LikeWordsbyRE {

	public static boolean isAllUper(String word)
	{
		return word.matches("[A-Z]+");
	}
	public static boolean hasContinous(String word)
	{
		return !word.matches(".*(.)(\\1).*");//.任意字符，* 0个或多个
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
