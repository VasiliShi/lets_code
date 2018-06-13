package lets.code.every.day;

public class ReverseInteger {

	public static int reverse(int x) {
		int result = 0;
		while (x != 0) {
			result = result * 10 + x % 10;
			x /= 10;
			if(result !=(result * 10 / 10))
                return 0;
		}
		
		return result;
	}

	public static int reverse1(int n) {
		int reversed_n = 0;
		while (n != 0) {
			int temp = reversed_n * 10 + n % 10;
			n = n / 10;
			if (temp / 10 != reversed_n) {
				reversed_n = 0;
				break;
			}
			reversed_n = temp;
		}
		return reversed_n;
	}

	public static void main(String[] args) {
		int a = -2147483412;
		int temp = a * 10;
		System.out.println(a == temp / 10);
		System.out.println(reverse(a));
		System.out.println(reverse1(a));

	}

}
