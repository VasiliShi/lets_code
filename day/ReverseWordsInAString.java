package lets.code.every.day;

public class ReverseWordsInAString {

	public static String reverseWords(String s) {
		StringBuilder res = new StringBuilder(); // String���ɱ�
		String words[] = s.split(" ");
		for (String word : words) {
			res.append(new StringBuilder(word).reverse().toString() + " "); // ���Ƕ��߳���StringBuilderЧ�ʸ���StringBuffer
		}
		return res.toString().trim(); // remove the last " "
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this is my computer !";
		System.out.println(reverseWords(str));
	}

}
