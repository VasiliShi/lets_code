package lets.code.every.day;

public class RansomNote {

	public static  boolean canConstruct(String ransomNote, String magazine) {
		int array[] = new int[26];
		for(int i = 0; i < magazine.length(); i++)
			array[magazine.charAt(i) - 'a']++;
		for(int i = 0; i < ransomNote.length(); i++)
		{
			if(array[ransomNote.charAt(i) - 'a'] - 1 < 0) //可以直接合并为--array[ransomNote.charAt(i) - 'a']
			{
				return false;
			}
			array[ransomNote.charAt(i) - 'a']--; 
		}
		return true;
    }
	public static void main(String[] args) {
		String a = "aa";
		String b = "ab";
		System.out.println(canConstruct(a, b));
	}
}
