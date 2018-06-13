package lets.code.every.offer;

public class PrintMatrix_20 {
	//clockwise À≥ ±’Î∑ΩœÚ
	public static void printMatrixClockwisely(int matrix[][], int columns, int rows)
	{
		if( columns <= 0 || rows <= 0)
			return;
		int start = 0;
		while(columns > start * 2 && rows > start * 2)
		{
			printMatrixInCircle(matrix, columns, rows,start);
			start ++;
		}
	}
	public static void printMatrixInCircle(int matrix[][],int columns, int rows,int start)
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
