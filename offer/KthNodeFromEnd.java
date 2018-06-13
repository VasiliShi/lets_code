package lets.code.every.offer;
import lets.code.every.day.LinkedList;
/**
 * 剑指offer 面试题15：链表中倒数第K个节点
 * @author swx
 *
 */
public class KthNodeFromEnd {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
			//建立链表
			for (int i = 0; i < 10; i++) 
			{
				list.add(i);
			}
			list.print(list.head);
			/**
			 * 需要注意的地方：k=0、head=null、lengt(head) < k
			 */
			int a = list.findKth2Tail(list.head, 3);
			System.out.println(a);
	}

}
