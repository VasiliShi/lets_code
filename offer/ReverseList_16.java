package lets.code.every.offer;

import lets.code.every.day.LinkedList;

/**
 * ��ָoffer ������17 ��ת����
 * @author swx
 *
 */
public class ReverseList_16 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		//��������
		for (int i = 0; i < 10; i++) 
		{
			list.add(i);
		}
		list.print(list.head);
		
		list.print(list.reverse(list.head));

	}

}
