package lets.code.every.search;

public class MatrixSearch {

	public static boolean search(int a[][],int target)
	{
		int N = a.length;
		if(target < a[0][0] || target > a[N - 1][N - 1])
			return false;
		int row = 0;
		int col = N - 1;
		while(row <= N - 1 && col >= 0)
		{
			if(a[row][col] < target)
				row ++;
			else if(a[row][col] > target)
				col --;
			else 
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int a[][] = new int[][]{{1,5,7,9},{4,6,10,15},{8,11,12,19},{14,16,18,21}};
		boolean flag = search(a, 15);
		System.out.println(flag);


	}

}
