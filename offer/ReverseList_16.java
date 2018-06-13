package lets.code.every.offer;

import lets.code.every.day.LinkedList;

/**
 * 剑指offer 面试题17 反转链表
 * @author swx
 *
 */
public class ReverseList_16 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		//建立链表
		for (int i = 0; i < 10; i++) 
		{
			list.add(i);
		}
		list.print(list.head);
		
		list.print(list.reverse(list.head));

	}

}
