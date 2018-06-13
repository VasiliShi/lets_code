package lets.code.every.day;

import java.util.Scanner;
/**
 * 给出括号的对数（pair）,打印出所有合法的括号对组合
 * @author SWX
 *
 */
public class PrintParentheses {

	public static void print(int l, int r, char str[], int n) {
		if (l < 0 || r < l)
			return;
		if (l == 0 && r == 0) {
			for (int i = 0; i < n; i++) {
				System.out.print(str[i]);
			}
			System.out.println();
		} else {
			if (l > 0) {
				str[n] = '(';
				print(l - 1, r, str, n + 1);
			}
			if (r > l) {
				str[n] = ')';
				print(l, r - 1, str, n + 1);
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			char str[] = new char[n * 2];
			print(n, n, str, 0);
		}
		sc.close();
	}

}
