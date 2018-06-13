package lets.code.every.day;

import java.util.Arrays;

public class AssignCookies {
	// g º¢×Ó£¬s cookie
	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int num = 0;
		for (int i = 0; i < s.length; i++)
			if (num < g.length)
				if (s[i] > g[num])
					num++;
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
