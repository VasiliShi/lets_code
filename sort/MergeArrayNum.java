package lets.code.every.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * �������������е����ֺϲ����ҳ�������С��һ��
 * eg{3,32,321} ==> 321323
 * @author swx
 *
 */
public class MergeArrayNum {

	public static String findMin(int a[])
	{
		String result = "";
		List<String> strs = new ArrayList<String>();
		for(int i :a)
			strs.add(i+"");
		Collections.sort(strs,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String s1 = o1 + o2;
				String s2 = o2 + o1;
				return s1.compareTo(s2); //�ַ����ıȽϣ�'a' < 'b'
			}
		});
		for(String str:strs)
			result += str;
		return result ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,32,321};
		System.out.println(findMin(a));
	}

}
