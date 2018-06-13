package lets.code.every.offer;

public class VerifySquenceOfBST_24 {

    public static boolean judge(int a[],int left,int right)
    {
        if(left <= right) return true;
        int root = a[right];
        int i = left;
        while(i<right && a[i] < root)
            i++;
        for(int j = i;j < right; j++)
            if(a[j] < root)
                return false;
        return judge(a, left, i-1) && judge(a, i, right);
    }
    public static boolean verifySquenceOfBST(int [] sequence) {
        return judge(sequence,0,sequence.length-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,7,6,9,11,10,8};
		System.out.println(verifySquenceOfBST(a));

	}

}
