package lets.code.every.offer;
import lets.code.every.day.LinkedList;
/**
 * ��ָoffer ������15�������е�����K���ڵ�
 * @author swx
 *
 */
public class KthNodeFromEnd {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
			//��������
			for (int i = 0; i < 10; i++) 
			{
				list.add(i);
			}
			list.print(list.head);
			/**
			 * ��Ҫע��ĵط���k=0��head=null��lengt(head) < k
			 */
			int a = list.findKth2Tail(list.head, 3);
			System.out.println(a);
	}

}
